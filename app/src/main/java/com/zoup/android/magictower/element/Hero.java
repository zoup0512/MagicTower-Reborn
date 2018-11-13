package com.zoup.android.magictower.element;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;

import com.zoup.android.magictower.bean.UpDownStairsEvent;
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
