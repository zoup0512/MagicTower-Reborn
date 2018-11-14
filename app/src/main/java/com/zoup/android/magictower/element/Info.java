package com.zoup.android.magictower.element;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import com.zoup.android.magictower.common.ImageFactory;
import com.zoup.android.magictower.ui.GameSurfaceView;

public class Info {
    public static float width = GameSurfaceView.screenWidth;
    public static float height = GameSurfaceView.screenHeight;
    public static float itemWidth = GameSurfaceView.MAP_ITEM_WIDTH;
    private static Bitmap bg;
    private static RectF bgRectF;
    public static RectF[] infoButton;
    private static Bitmap[] infos;
    private static Paint p;

    public static void draw(Canvas canvas, int floor) {
        p = new Paint();
        p.setTextSize(GameSurfaceView.MAP_ITEM_WIDTH * 2f / 5f);
        p.setColor(-1);
        p.setAntiAlias(true);
//        canvas.drawBitmap(bg, null, bgRectF, Info.p);
//        canvas.drawBitmap(infos[4], null, infoButton[1], p);

        float left = itemWidth * 12;

        canvas.drawText("第" + floor + "层", left, itemWidth * 7f / 3f, Info.p);
        canvas.drawText("生命", left, itemWidth * 9f / 3f, Info.p);
        canvas.drawText(new StringBuilder(String.valueOf(Hero.hp)).toString(), left, itemWidth * 9f / 3f, Info.p);
        canvas.drawText("攻击", left, itemWidth * 11f / 3f, Info.p);
        canvas.drawText(new StringBuilder(String.valueOf(Hero.attack)).toString(), left, itemWidth * 11f / 3f, Info.p);
        canvas.drawText("防御", left, itemWidth * 13f / 3f, Info.p);
        canvas.drawText(new StringBuilder(String.valueOf(Hero.defence)).toString(), left, itemWidth * 13f / 3f, Info.p);
        canvas.drawText("金币", left, itemWidth * 15f / 3f, Info.p);
        canvas.drawText(new StringBuilder(String.valueOf(Hero.gold)).toString(), left, itemWidth * 15f / 3f, Info.p);
        canvas.drawText("经验", left, itemWidth * 17f / 3f, Info.p);
//        canvas.drawText(new StringBuilder(String.valueOf(Hero.exp)).toString(), itemWidth * 2f / 5f + v9, itemWidth * 17f / 3f, Info.p);
//        canvas.drawBitmap(Info.infos[0], null, new RectF(v9 - itemWidth * 8f / 5f, itemWidth * 19f / 3f, v9 - itemWidth * 8f / 5f + itemWidth, itemWidth * 19f / 3f + itemWidth), Info.p);
//        canvas.drawText(new StringBuilder(String.valueOf(Hero.yellowKey)).toString(), itemWidth * 2f / 5f + v9, itemWidth * 21f / 3f, Info.p);
//        canvas.drawBitmap(Info.infos[1], null, new RectF(v9 - itemWidth * 8f / 5f, itemWidth * 22f / 3f, v9 - itemWidth * 8f / 5f + itemWidth, itemWidth * 22f / 3f + itemWidth), Info.p);
//        canvas.drawText(new StringBuilder(String.valueOf(Hero.blueKey)).toString(), itemWidth * 2f / 5f + v9, itemWidth * 24f / 3f, Info.p);
//        canvas.drawBitmap(Info.infos[2], null, new RectF(v9 - itemWidth * 8f / 5f, itemWidth * 25f / 3f, v9 - itemWidth * 8f / 5f + itemWidth, itemWidth * 25f / 3f + itemWidth), Info.p);
//        canvas.drawText(new StringBuilder(String.valueOf(Hero.redKey)).toString(), itemWidth * 2f / 5f + v9, itemWidth * 27f / 3f, Info.p);
    }

    public static void init(Resources arg3) {
        p = new Paint();
        p.setTextSize(GameSurfaceView.MAP_ITEM_WIDTH * 2f / 5f);
        p.setColor(Color.WHITE);
        p.setAntiAlias(true);
        infos = ImageFactory.getInfoBitmap(arg3);
        bg = ImageFactory.getBgBitmap(arg3);
        initItemInfo();
    }

    public static void initItemInfo() {
        Info.bgRectF = new RectF(width - 11 * itemWidth, 0, width, height);
        Info.infoButton = new RectF[3];
//        Info.infoButton[0] = new RectF(width-11*itemWidth, itemWidth / 2f, itemWidth + v0, itemWidth / 2f + itemWidth);
//        Info.infoButton[1] = new RectF(width-11*itemWidth * 2f + itemWidth, itemWidth / 2f, v0 * 2f + itemWidth * 2f, itemWidth / 2f + itemWidth);
//        Info.infoButton[2] = new RectF(width-11*itemWidth * 3f + itemWidth * 2f, itemWidth / 2f, v0 * 3f + itemWidth * 3f, itemWidth / 2f + itemWidth);
    }
}

