package com.zoup.android.magictower.element;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;

import com.zoup.android.magictower.ui.GameSurfaceView;
import com.zoup.android.magictower.common.ImageFactory;
import com.zoup.android.magictower.bean.MoveEvent;
import com.zoup.android.magictower.common.rx.RxBus;
import com.zoup.android.magictower.common.rx.RxDisposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by zoup on 2018/10/30
 * E-Mail：2479008771@qq.com
 */
public class Hero {
    public static int attack;
    public static int blueKey;
    public static int defence;
    public static int direction;
    private float distance;
    private float distanceSum;
    private static Enemy e;
    public static int exp;
    public static int gold;
    public Bitmap[][] heroFrame;
    public static int hp;
    private int index;
    private float[][] infoDown;
    private static String infoStr;
    private float[][] infoUP;
    public static boolean isChoiceFloor;
    public static boolean isDialog;
    public static boolean isEnemyInfo;
    public static boolean isExp;
    public static boolean isFly;
    public static boolean isHero;
    public static boolean isInfo;
    private boolean isInit;
    public static boolean isItem;
    private boolean isMove;
    public static boolean isSearch;
    public static boolean isStore;
    public static float left;
    private static String lostMsg;
    public static int maxFloor;
    private String[] message;
    private Paint p;
    public static int redKey;
    private int screenWidth;
    private float speed;
    private static Bitmap tempImage;
    public static float top;
    public static int yellowKey;

    static {
        Hero.left = -1f;
        Hero.top = -1f;
        Hero.tempImage = null;
        Hero.maxFloor = 0;
        Hero.direction = 1;
        Hero.isDialog = false;
        Hero.isItem = false;
        Hero.isHero = false;
        Hero.isInfo = false;
        Hero.isChoiceFloor = false;
        Hero.infoStr = "";
        Hero.attack = 20;
        Hero.defence = 15;
        Hero.hp = 1000;
        Hero.exp = 0;
        Hero.gold = 0;
        Hero.yellowKey = 1;
        Hero.blueKey = 1;
        Hero.redKey = 1;
        Hero.isSearch = false;
        Hero.isFly = false;
        Hero.isExp = false;
        Hero.isStore = false;
        Hero.isEnemyInfo = false;
    }

    private volatile int xPosition = 0;
    private volatile int yPosition = 0;
    private float itemWidth;

    public Hero(int floor) {
        addMoveListener();
        setInitPosition(floor);
    }

    public void draw(Context context, Canvas canvas, int floor) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap[][] heroBitmaps = ImageFactory.getHeroBitmaps(context.getResources());
        itemWidth = GameSurfaceView.MAP_ITEM_WIDTH;
        RectF rectF = new RectF(xPosition * itemWidth, yPosition * itemWidth, (xPosition + 1) * itemWidth, (yPosition + 1) * itemWidth);
        canvas.drawBitmap(heroBitmaps[0][0], null, rectF, paint);
    }

    public void move(MoveEvent moveEvent) {
        xPosition += moveEvent.getAddX();
        yPosition += moveEvent.getAddY();
        execEvent(xPosition, yPosition);
    }

    public void execEvent(int xPosition, int yPosition) {
        for (Element e : Element.npcs) {
            if (e.i == xPosition && e.j == yPosition) {
                if (e.type == 999) {
                    GameSurfaceView.status = 1;
                    return;
                } else if (e.type == 1000) {
                    GameSurfaceView.status = -1;
                    return;
                }
            }
        }
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

    public void addMoveListener() {
        Disposable disposable = RxBus.getInstance().toObservableSticky(MoveEvent.class).subscribe(new Consumer<MoveEvent>() {
            @Override
            public void accept(MoveEvent moveEvent) {
                Log.d("move", "x=" + moveEvent.getAddX() + ",y=" + moveEvent.getAddY());
                move(moveEvent);
            }
        });
        RxDisposables.add(disposable);
    }

}
