package com.zoup.android.magictower.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.zoup.android.magictower.element.Control;
import com.zoup.android.magictower.element.Hero;
import com.zoup.android.magictower.element.Map;

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
    private int floor = 1;
    public static float MAP_ITEM_WIDTH = 0.0f;
    private Map map;
    private Hero hero;
    private Control control;

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
        hero = new Hero(floor);
        control = new Control(context.getResources());
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
                Thread.sleep(100);
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
            map.draw(context, canvas, floor);
            hero.draw(context, canvas, floor);
            control.draw(canvas);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (canvas != null) {
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }

    }
}
