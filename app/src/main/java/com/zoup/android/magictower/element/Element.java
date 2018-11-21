package com.zoup.android.magictower.element;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.zoup.android.magictower.ui.GameSurfaceView;

import java.util.ArrayList;
import java.util.List;

public abstract class Element {
    protected float itemWidth = GameSurfaceView.MAP_ITEM_WIDTH;
    public int floor = 0;
    public int i;
    public int j;
    public int type;
    public int index = 0;
    public int times = 0;
    public Paint paint = new Paint();
    public Bitmap[] frameBitmaps = new Bitmap[4];
    public static List<Element> npcs = new ArrayList<>();
    public static List<Element> tempNpcs = new ArrayList<>();
    public boolean isDead = false;
    public boolean isOver = false;


    public Element() {
        paint.setAntiAlias(true);
        npcs.add(this);
    }

    public abstract void draw(Canvas canvas);

    public static Element getElementByType(int type) {
        for (Element npc : npcs) {
            if (npc.type == type) {
                return npc;
            }
        }
        return null;
    }

    public void over(){

    }

}
