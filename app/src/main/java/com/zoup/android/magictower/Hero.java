package com.zoup.android.magictower;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.SurfaceHolder;

/**
 * Created by zoup on 2018/10/30
 * E-Mail：2479008771@qq.com
 */
public class Hero {
    private float xPosition = 0.0f;
    private float yPosition = 0.0f;
    private float itemWidth;

    public void draw(Context context, Canvas canvas, int floor) {
        Paint paint = new Paint();
        paint.setAlpha(90);
        paint.setAntiAlias(true);
        setInitPosition(floor);
        Bitmap[][] heroBitmaps = ImageFactory.getHeroBitmaps(context.getResources());
        itemWidth = GameSurfaceView.MAP_ITEM_WIDTH;
        RectF rectF = new RectF(xPosition*itemWidth, yPosition*itemWidth, (xPosition+1)*itemWidth, (yPosition+1)*itemWidth);
        canvas.drawBitmap(heroBitmaps[0][0], null, rectF, paint);
    }

    public void move() {

    }

    private void setInitPosition(int floor) {
        switch (floor) {
            case 1:
                xPosition = 3;
                yPosition = 6;
                break;
            case 2:
                xPosition = 4;
                yPosition = 7;
                break;
            case 3:
                xPosition = 4;
                yPosition = 7;
                break;
            default:
                break;
        }

    }
}
