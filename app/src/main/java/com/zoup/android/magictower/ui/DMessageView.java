package com.zoup.android.magictower.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.zoup.android.magictower.common.ImageFactory;

/**
 * Created by Administrator on 2017/7/10.
 */

public class DMessageView {
    Bitmap bitmapBg;
    //    public Handler handler=null;
    Paint paint;
    private String title = "title";
    private String content = "content";
    //窗口透明度
    int alpha = 0;
    //短消息播放 状态
    public int visiIndex = 1;

    public void draw(Context context, Canvas canvas) {
        bitmapBg = ImageFactory.getDialogBitmap(context.getResources());
        paint = new Paint();
        if (visiIndex == 0) {
            alpha += 30;
            paint.setAlpha(alpha);
            canvas.drawBitmap(bitmapBg, 0, 0, paint);
            visiIndex = alpha > 220 ? 1 : 0;
            if (alpha > 220) {
                drawTextInfo(canvas);
            }
        } else if (visiIndex == 1) {
            canvas.drawBitmap(bitmapBg, 0, 0, null);
            drawTextInfo(canvas);
        }
    }

    private void drawTextInfo(Canvas canvas) {
        int x = 20;
        int y = 20;
        paint.setColor(Color.LTGRAY);
        if ("".equals(this.content)) {
            paint.setTextSize(32);
            canvas.drawText(title, x, y, paint);
        } else {
            paint.setTextSize(32);
            canvas.drawText(title, x, y, paint);
            paint.setTextSize(24);
            canvas.drawText(content, x, y, paint);
        }
    }

//    @Override
//    protected void onVisibilityChanged(@NonNull View changedView, int visibility) {
//        super.onVisibilityChanged(changedView, visibility);
//        if (visibility==View.VISIBLE){
//            if (this.handler==null){
//                return;
//            }
//          if (this.getVisibility()==VISIBLE){
//          visiIndex=0;
//          }
//            this.handler.post(runnable);
//            this.alpha=0;
//        }else if (visibility==View.INVISIBLE){
//        }
//    }

//    private void move() {
//        EventBus.getDefault().postSticky(new DataSynEvent("5",5));
//    }

//    Runnable runnable=new Runnable() {
//        @Override
//        public void run() {
//            try{
//                if(visiIndex==0){
//                    handler.postDelayed(runnable, 100);
//                }else	if(visiIndex==1){
//                    invisiblethis();
//                    handler.removeCallbacks(runnable);
//
//                    Log.e("-------sssssss---","---------------");
//                }
//            }catch (Exception e) {
//                e.printStackTrace();
//            }
//            postInvalidate();
//        }
//    };
//    public void invisiblethis(){
//        Log.e("----------","---------------");
//        this.setVisibility(INVISIBLE);
//    }

    public Bitmap getBitmapBg() {
        return bitmapBg;
    }

    public void setBitmapBg(Bitmap bitmapBg) {
        this.bitmapBg = bitmapBg;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public int getVisiIndex() {
        return visiIndex;
    }

    public void setVisiIndex(int visiIndex) {
        this.visiIndex = visiIndex;
    }
}
