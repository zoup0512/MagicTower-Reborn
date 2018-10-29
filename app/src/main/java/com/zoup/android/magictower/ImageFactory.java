package com.zoup.android.magictower;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;

/**
 * Created by zoup on 2018/10/28
 * E-Mail：2479008771@qq.com
 */
public class ImageFactory {
    public static Bitmap[][] getMapBitmaps(Resources resources) {
        int x = 2, y = 3;
        Bitmap[][] bitmaps = new Bitmap[x][y];
        try {
            Bitmap origin = BitmapFactory.decodeStream(resources.getAssets().open("map.png"));
            int width = origin.getWidth();
            int height = origin.getHeight();
            int itemWidth = width / y;
            int itemHeight = height / x;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    bitmaps[i][j] = Bitmap.createBitmap(origin, itemWidth * j, itemHeight * i, itemWidth, itemHeight);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmaps;
    }
}
