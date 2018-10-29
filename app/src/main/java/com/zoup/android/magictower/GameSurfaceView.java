package com.zoup.android.magictower;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by zoup on 2018/10/27
 * E-Mail：2479008771@qq.com
 */
public class GameSurfaceView extends SurfaceView implements Runnable, SurfaceHolder.Callback2 {
    private Context context;
    private SurfaceHolder surfaceHolder;
    private volatile boolean flag;
    private GameMap gameMap;
    private int screenWidth;
    private int screenHeight;

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

    public GameSurfaceView(Context context,int width,int height) {
        super(context);
        Const.MAP_ITEM_WIDTH=height/10;
        init(context);
    }

    @Override
    public void surfaceRedrawNeeded(SurfaceHolder holder) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
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
                synchronized (surfaceHolder) {
                    Thread.sleep(100);
                    gameMap.draw(context,surfaceHolder,2);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

            }
        }

    }

    private void init(Context context) {
        this.context=context;
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
        setFocusable(true);
        gameMap = new GameMap();
        screenWidth=getWidth();
        screenHeight=getHeight();
    }
}
