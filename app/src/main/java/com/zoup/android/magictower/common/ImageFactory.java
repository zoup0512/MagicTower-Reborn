package com.zoup.android.magictower.common;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;

/**
 * Created by zoup on 2018/10/28
 * E-Mail：2479008771@qq.com
 */
public class ImageFactory {

    /**
     *
     * @param resources
     * @param fileName 文件名
     * @param rows 原始图片的行数
     * @param columns 原始图片的列数
     * @return
     */
    public static Bitmap[][] getBitmaps(Resources resources, String fileName, int rows, int columns) {
        Bitmap[][] bitmaps = new Bitmap[rows][columns];
        try {
            Bitmap origin = BitmapFactory.decodeStream(resources.getAssets().open(fileName));
            int width = origin.getWidth();
            int height = origin.getHeight();
            int itemWidth = width / columns;
            int itemHeight = height / rows;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    bitmaps[i][j] = Bitmap.createBitmap(origin, itemWidth * j, itemHeight * i, itemWidth, itemHeight);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmaps;
    }

    public static Bitmap[][] getMapBitmaps(Resources resources) {
        return getBitmaps(resources, "map.png", 2, 3);
    }

    public static Bitmap[][] getHeroBitmaps(Resources resources) {
        return getBitmaps(resources, "hero.png", 4, 4);
    }

    public static Bitmap[][] getDoorBitmaps(Resources resources) {
        return getBitmaps(resources, "door.png", 4, 4);
    }

    public static Bitmap[] getCtrlBitmap(Resources resources) {
        Bitmap[] bitmaps = new Bitmap[5];
        String[] strings = new String[]{"default.png", "default_up.png", "default_down.png", "default_left.png", "default_right.png"};
        try {
            for (int i = 0; i < bitmaps.length; i++) {
                bitmaps[i] = BitmapFactory.decodeStream(resources.getAssets().open(strings[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmaps;
    }
}
