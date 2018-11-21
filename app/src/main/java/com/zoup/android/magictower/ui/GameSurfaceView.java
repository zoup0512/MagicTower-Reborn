package com.zoup.android.magictower.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.zoup.android.magictower.common.ConstUtil;
import com.zoup.android.magictower.element.Element;
import com.zoup.android.magictower.element.Hero;
import com.zoup.android.magictower.element.ItemFactory;
import com.zoup.android.magictower.element.Map;

import java.util.Iterator;

/**
 * Created by zoup on 2018/10/27
 * E-Mail：2479008771@qq.com
 */
public class GameSurfaceView extends SurfaceView implements Runnable, SurfaceHolder.Callback2 {
    private Context context;
    private SurfaceHolder surfaceHolder;
    private Canvas canvas;
    private volatile boolean flag;
    public static int screenWidth;
    public static int screenHeight;
    public static int floor = 1;
    public static float MAP_ITEM_WIDTH = 0.0f;
    private Map map;
    private Hero hero;
    private DMessageView messageView;
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
        ConstUtil.MAPITEMWIDTH = MAP_ITEM_WIDTH;
        map = new Map();
        hero = new Hero(floor);
        hero.initPosition(floor);
        hero.initFloorHero();
        messageView = new DMessageView();
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
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void init(Context context) {
        this.context = context;
        surfaceHolder = getHolder();
        setZOrderOnTop(true);
//        setZOrderMediaOverlay(true);
        surfaceHolder.setFormat(PixelFormat.TRANSLUCENT);
        surfaceHolder.addCallback(this);
        setFocusable(true);

    }

    private void draw() {
        try {
            canvas = surfaceHolder.lockCanvas();
            if (status == 0) {
                if (canvas != null) {
                    map.draw(context, canvas, floor);
                    hero.draw(context, canvas, floor);
//                    messageView.draw(context,canvas);
                    Iterator iterator = Element.npcs.iterator();
                    while (iterator.hasNext()) {
                        ((Element) iterator.next()).draw(canvas);
                    }
                    Element.npcs.removeAll(Element.tempNpcs);
                    Element.tempNpcs.clear();
                }
            } else {
                setFloor();
            }
        } catch (Exception e) {
            if (canvas != null) {
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        } finally {
            if (canvas != null) {
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
    }

    public void setFloor() {
        floor += status;
        ItemFactory.setElement(this.getResources(), Map.getMap(floor), floor);
        hero.setPosition(floor);
        status = 0;
    }
}
