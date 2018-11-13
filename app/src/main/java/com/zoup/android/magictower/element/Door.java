package com.zoup.android.magictower.element;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

/**
 * Created by zoup on 2018/11/2
 * E-Mail：2479008771@qq.com
 */
public class Door extends Element {


    public Door(int j, int i, Bitmap[] frameBitmaps, int type, int floor) {
        this.i = i;
        this.j = j;
        this.type = type;
        this.floor = floor;
        this.frameBitmaps = frameBitmaps;
    }

    @Override
    public void draw(Canvas canvas) {
        this.times++;
        if (this.times == 5) {
            this.index++;
            this.times = 0;
            if (this.index == 4) {
                this.index = 0;
            }
        }
        canvas.drawBitmap(frameBitmaps[0], null, new RectF(i * itemWidth, j * itemWidth, (i + 1) * itemWidth, (j + 1) * itemWidth), paint);
    }

}