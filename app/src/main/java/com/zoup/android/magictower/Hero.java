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

    public void draw(Context context, SurfaceHolder surfaceHolder, int floor) {
        Canvas canvas = surfaceHolder.lockCanvas();
        Paint paint = new Paint();
        paint.setAlpha(90);
        paint.setAntiAlias(true);

        Bitmap[][] heroBitmaps = ImageFactory.getHeroBitmaps(context.getResources());
        float itemWidth = GameSurfaceView.MAP_ITEM_WIDTH;
        RectF rectF = new RectF(0.0f, 0.0f, itemWidth, itemWidth);
        canvas.drawBitmap(heroBitmaps[0][0], null, rectF, paint);
        surfaceHolder.unlockCanvasAndPost(canvas);
    }
}
