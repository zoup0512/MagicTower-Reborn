package com.zoup.android.magictower.element;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

public class Item extends Element {
    private Bitmap bitmap;

    public Item(int j, int i, Bitmap bitmap, int type, int floor) {
        this.i = i;
        this.j = j;
        this.type = type;
        this.floor = floor;
        this.bitmap = bitmap;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap, null, new RectF(i * itemWidth, j * itemWidth, (i + 1) * itemWidth, (j + 1) * itemWidth), paint);
    }
}
