package com.zoup.android.magictower.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.zoup.android.magictower.bean.MoveEvent;
import com.zoup.android.magictower.bean.UpDownStairsEvent;
import com.zoup.android.magictower.common.rx.RxBus;
import com.zoup.android.magictower.common.rx.RxDisposables;
import com.zoup.android.magictower.element.Control;
import com.zoup.android.magictower.element.Element;
import com.zoup.android.magictower.element.Hero;
import com.zoup.android.magictower.element.ItemFactory;
import com.zoup.android.magictower.element.Map;

import java.util.Iterator;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by zoup on 2018/10/27
 * E-Mail：2479008771@qq.com
 */
public class GameSurfaceView extends SurfaceView implements Runnable, SurfaceHolder.Callback2 {
    private Context context;
    private SurfaceHolder surfaceHolder;
    private Canvas canvas;
    private volatile boolean flag;
    private int screenWidth;
    private int screenHeight;
    public static int floor = 1;
    public static float MAP_ITEM_WIDTH = 0.0f;
    private Map map;
    private Hero hero;
    private Control control;
    public static int status = 0;

    public GameSurfaceView(Context context) {
        super(context);
        init(context);
    }

    public GameSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public GameSurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @Override
    public void surfaceRedrawNeeded(SurfaceHolder holder) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        screenWidth = getWidth();
        screenHeight = getHeight();
        MAP_ITEM_WIDTH = screenHeight / 10;
        map = new Map();
        hero = new Hero();
        control = new Control(context.getResources());
        ItemFactory.setElement(this.getResources(), Map.getMap(floor), floor);
        Thread thread = new Thread(this);
        flag = true;
        thread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        flag = false;
        surfaceHolder.removeCallback(this);
    }

    @Override
    public void run() {
        while (flag) {
            try {
                draw();
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return control.onTouchEvent(event);
    }

    private void init(Context context) {
        this.context = context;
        surfaceHolder = getHolder();
        surfaceHolder.setFormat(PixelFormat.TRANSLUCENT);
        surfaceHolder.addCallback(this);
        setFocusable(true);
    }

    private void draw() {
        try {
            canvas = surfaceHolder.lockCanvas();
            if (status == 0) {
                map.draw(context, canvas, floor);
                hero.draw(context, canvas, floor);
                control.draw(canvas);
                Iterator iterator = Element.npcs.iterator();
                while (iterator.hasNext()) {
                    ((Element) iterator.next()).draw(this.canvas);
                }
            } else {
                setFloor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (canvas != null) {
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
    }

    public void setFloor() {
        floor += status;
        ItemFactory.setElement(this.getResources(), Map.getMap(floor), floor);
        status = 0;
    }
}
