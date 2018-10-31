package com.zoup.android.magictower;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import android.graphics.RectF;
import android.view.MotionEvent;

public class Control {
    private float x;
    private float y;
    private Paint paint;
    private Bitmap[] bitmaps;
    private int index = 0;
    private RectF rect;
    private float itemWidth;

    public Control(Resources res) {
        itemWidth = GameSurfaceView.MAP_ITEM_WIDTH;
        x = itemWidth * 14.0f;
        y = itemWidth * 9.0f;
        paint = new Paint();
        paint.setAntiAlias(true);
        bitmaps = ImageFactory.getCtrlBitmap(res);
        rect = new RectF(x - (itemWidth * 2.0f), y - (itemWidth * 2.0f), x + (itemWidth * 2.0f), y + (itemWidth * 2.0f));
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.bitmaps[this.index], null, this.rect, this.paint);
    }

    public boolean onTouchEvent(MotionEvent event) {
        float eventX = event.getX();
        float eventY = event.getY();
        if (Math.abs(eventX - x) <= 2 * itemWidth && Math.abs(eventY - y) <= 2 * itemWidth) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    break;
                case MotionEvent.ACTION_MOVE:
                    break;
                case MotionEvent.ACTION_UP:
                    MoveEvent moveEvent=new MoveEvent();
                    if(eventX>=x){
                        moveEvent.setAddX(1);
                    }else {
                        moveEvent.setAddX(-1);
                    }
                    if(eventY>=y){
                        moveEvent.setAddY(1);
                    }else {
                        moveEvent.setAddY(-1);
                    }
                    RxBus.getIntanceBus().post(moveEvent);
                    break;
            }
            return true;
        }
        return false;
    }

}
