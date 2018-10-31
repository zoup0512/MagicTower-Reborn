package com.zoup.android.magictower.element;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import android.graphics.RectF;
import android.view.MotionEvent;

import com.zoup.android.magictower.ui.GameSurfaceView;
import com.zoup.android.magictower.common.ImageFactory;
import com.zoup.android.magictower.bean.MoveEvent;
import com.zoup.android.magictower.common.rx.RxBus;

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
        y = itemWidth * 6.0f;
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
        float absX = Math.abs(eventX - x);
        float absY = Math.abs(eventY - y);
        if (absX <= 2 * itemWidth && absY <= 2 * itemWidth) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    break;
                case MotionEvent.ACTION_MOVE:
                    break;
                case MotionEvent.ACTION_UP:
                    MoveEvent moveEvent = new MoveEvent();
                    if (absX >= absY) {
                        if (eventX > x) {
                            moveEvent.setAddX(1);
                            moveEvent.setAddY(0);
                        } else {
                            moveEvent.setAddX(-1);
                            moveEvent.setAddY(0);
                        }
                    } else {
                        if (eventY > y) {
                            moveEvent.setAddX(0);
                            moveEvent.setAddY(1);
                        } else {
                            moveEvent.setAddX(0);
                            moveEvent.setAddY(-1);
                        }
                    }
                    RxBus.getInstance().postSticky(moveEvent);
                    break;
            }
            return true;
        }
        return false;
    }

}
