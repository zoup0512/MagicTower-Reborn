package com.zoup.android.magictower.element;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import com.zoup.android.magictower.ui.GameSurfaceView;
import com.zoup.android.magictower.common.ImageFactory;

/**
 * Created by zoup on 2018/10/28
 * E-Mail：2479008771@qq.com
 */
public class Map {
    public static int[][] floor1;
    public static int[][] floor2;
    public static int[][] floor3;
    public static int[][] floor4;
    public static int[][] floor5;
    public static int[][] floor6;
    public static int[][] floor7;
    public static int[][] floor8;
    public static int[][] floor9;
    public static int[][] floor10;
    public static int[][] floor11;
    public static int[][] floor12;
    public static int[][] floor13;
    public static int[][] floor14;
    public static int[][] floor15;

    static {
        floor1 = new int[10][];
        floor1[0] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor1[1] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor1[2] = new int[]{3, 3, 1, 1, 1, 1, 1, 1, 1, 3, 3};
        floor1[3] = new int[]{3, 3, 1, 160, 1, 999, 1, 165, 1, 3, 3};
        floor1[4] = new int[]{3, 3, 1, 103, 1, 102, 1, 103, 1, 3, 3};
        floor1[5] = new int[]{3, 3, 1, 0, 0, 0, 0, 0, 1, 3, 3};
        floor1[6] = new int[]{3, 3, 1, 0, 0, 0, 0, 53, 1, 3, 3};
        floor1[7] = new int[]{3, 3, 1, 1, 1, 1, 1, 1, 1, 3, 3};
        floor1[8] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor1[9] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        floor2 = new int[10][];
        floor2[0] = new int[]{159, 151, 1, 0, 0, 10, 10, 10, 0, 0, 0};
        floor2[1] = new int[]{152, 0, 1, 0, 1, 1, 1, 1, 1, 11, 11};
        floor2[2] = new int[]{0, 19, 1, 0, 0, 0, 0, 0, 1, 169, 11};
        floor2[3] = new int[]{1, 100, 1, 0, 1, 1, 1, 0, 1, 1, 1};
        floor2[4] = new int[]{0, 0, 1, 0, 0, 999, 1, 0, 100, 12, 12};
        floor2[5] = new int[]{0, 18, 101, 0, 1, 1, 1, 0, 1, 1, 101};
        floor2[6] = new int[]{155, 155, 1, 0, 0, 150, 150, 150, 1, 0, 0};
        floor2[7] = new int[]{153, 152, 1, 0, 1, 1, 1, 1, 1, 0, 0};
        floor2[8] = new int[]{1, 1, 1, 0, 1, 156, 154, 153, 1, 0, 18};
        floor2[9] = new int[]{1000, 0, 0, 0, 1, 156, 154, 153, 102, 18, 151};

        floor3 = new int[10][];
        floor3[0] = new int[]{155, 1, 155, 1, 1000, 1, 5, 6, 7, 1, 153};
        floor3[1] = new int[]{153, 1, 154, 1, 0, 1, 1, 0, 1, 1, 153};
        floor3[2] = new int[]{153, 1, 154, 1, 0, 1, 18, 0, 18, 101, 18};
        floor3[3] = new int[]{100, 1, 100, 1, 11, 1, 0, 0, 0, 1, 154};
        floor3[4] = new int[]{0, 12, 0, 1, 11, 1, 155, 0, 155, 1, 154};
        floor3[5] = new int[]{1, 101, 1, 1, 0, 1, 1, 100, 1, 1, 1};
        floor3[6] = new int[]{151, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50};
        floor3[7] = new int[]{1, 100, 1, 1, 1, 1, 1, 14, 1, 100, 1};
        floor3[8] = new int[]{150, 12, 150, 1, 164, 156, 1, 0, 1, 22, 155};
        floor3[9] = new int[]{150, 150, 150, 102, 19, 156, 1, 999, 1, 151, 152};

        floor4 = new int[10][];
        floor4[0] = new int[]{151, 22, 0, 1, 0, 999, 0, 1, 153, 154, 153};
        floor4[1] = new int[]{22, 1, 0, 1, 0, 1, 0, 1, 22, 1, 22};
        floor4[2] = new int[]{0, 0, 0, 1, 0, 13, 0, 1, 0, 15, 0};
        floor4[3] = new int[]{1, 100, 1, 1, 1, 101, 1, 1, 1, 1, 101};
        floor4[4] = new int[]{150, 0, 0, 1, 14, 0, 14, 1, 0, 0, 152};
        floor4[5] = new int[]{1, 1, 15, 100, 0, 1, 0, 100, 26, 1, 1};
        floor4[6] = new int[]{151, 0, 0, 1, 14, 0, 14, 1, 0, 0, 150};
        floor4[7] = new int[]{1, 101, 1, 1, 1, 102, 1, 1, 1, 100, 1};
        floor4[8] = new int[]{153, 15, 153, 1, 0, 0, 0, 1, 154, 19, 154};
        floor4[9] = new int[]{155, 155, 155, 1, 0, 1000, 0, 1, 151, 152, 151};

        floor5 = new int[10][];
        floor5[0] = new int[]{999, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1000};
        floor5[1] = new int[]{1, 1, 1, 1, 1, 101, 1, 1, 1, 1, 1};
        floor5[2] = new int[]{19, 0, 0, 0, 0, 13, 0, 0, 0, 0, 19};
        floor5[3] = new int[]{0, 1, 100, 1, 1, 102, 1, 1, 100, 1, 0};
        floor5[4] = new int[]{0, 1, 20, 156, 1, 14, 1, 156, 20, 1, 0};
        floor5[5] = new int[]{0, 1, 1, 1, 1, 15, 1, 1, 1, 1, 0};
        floor5[6] = new int[]{13, 100, 151, 151, 1, 16, 1, 152, 24, 100, 13};
        floor5[7] = new int[]{0, 1, 1, 1, 1, 155, 1, 1, 1, 1, 0};
        floor5[8] = new int[]{0, 1, 153, 153, 1, 155, 1, 154, 154, 1, 0};
        floor5[9] = new int[]{22, 101, 23, 153, 1, 170, 1, 154, 23, 101, 22};

        floor6 = new int[10][];
        floor6[0] = new int[]{1000, 0, 0, 1, 26, 0, 0, 28, 0, 0, 150};
        floor6[1] = new int[]{1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0};
        floor6[2] = new int[]{0, 0, 0, 1, 150, 1, 155, 23, 150, 1, 0};
        floor6[3] = new int[]{0, 1, 1, 1, 0, 1, 155, 1, 102, 1, 151};
        floor6[4] = new int[]{0, 150, 0, 0, 23, 1, 16, 1, 27, 1, 0};
        floor6[5] = new int[]{1, 1, 1, 1, 1, 1, 102, 1, 52, 1, 20};
        floor6[6] = new int[]{0, 0, 24, 0, 0, 0, 0, 1, 1, 1, 24};
        floor6[7] = new int[]{0, 1, 1, 1, 16, 1, 0, 0, 150, 0, 0};
        floor6[8] = new int[]{0, 1, 154, 1, 27, 1, 1, 1, 1, 1, 1};
        floor6[9] = new int[]{999, 1, 154, 100, 27, 101, 151, 151, 152, 153, 153};

        floor7 = new int[10][];
        floor7[0] = new int[]{171, 153, 153, 150, 150, 1, 157, 1, 155, 155, 155};
        floor7[1] = new int[]{1, 1, 1, 1, 100, 1, 30, 1, 154, 27, 154};
        floor7[2] = new int[]{1, 26, 26, 28, 28, 1, 100, 1, 1, 101, 1};
        floor7[3] = new int[]{1, 102, 1, 1, 1, 1, 0, 0, 0, 0, 999};
        floor7[4] = new int[]{1000, 0, 0, 0, 0, 0, 28, 1, 1, 1, 1};
        floor7[5] = new int[]{1, 1, 100, 1, 1, 1, 0, 1, 0, 100, 154};
        floor7[6] = new int[]{1, 0, 31, 0, 0, 1, 0, 1, 0, 1, 50};
        floor7[7] = new int[]{1, 151, 1, 1, 1, 1, 29, 101, 27, 1, 1};
        floor7[8] = new int[]{1, 0, 1, 152, 152, 1, 153, 1, 0, 1, 51};
        floor7[9] = new int[]{1, 0, 101, 152, 152, 1, 153, 1, 0, 100, 154};

        floor8 = new int[10][];
        floor8[0] = new int[]{999, 1, 161, 1, 5, 6, 7, 1, 166, 1, 1000};
        floor8[1] = new int[]{0, 1, 156, 30, 1, 151, 1, 30, 156, 1, 0};
        floor8[2] = new int[]{0, 1, 1, 101, 1, 102, 1, 101, 1, 1, 0};
        floor8[3] = new int[]{0, 1, 150, 0, 0, 31, 0, 0, 150, 1, 0};
        floor8[4] = new int[]{155, 1, 1, 1, 1, 0, 1, 1, 1, 1, 155};
        floor8[5] = new int[]{0, 1, 153, 153, 1, 0, 1, 154, 154, 1, 0};
        floor8[6] = new int[]{150, 1, 153, 31, 100, 0, 100, 31, 154, 1, 150};
        floor8[7] = new int[]{0, 1, 153, 153, 1, 30, 1, 154, 154, 1, 0};
        floor8[8] = new int[]{155, 1, 1, 1, 1, 101, 1, 1, 1, 1, 155};
        floor8[9] = new int[11];

        floor9 = new int[10][];
        floor9[0] = new int[]{151, 153, 32, 31, 0, 1, 0, 31, 32, 154, 151};
        floor9[1] = new int[]{1, 1, 1, 1, 102, 1, 101, 1, 1, 1, 1};
        floor9[2] = new int[]{1000, 1, 150, 101, 150, 1, 0, 100, 155, 155, 1};
        floor9[3] = new int[]{0, 1, 171, 1, 150, 150, 0, 1, 155, 155, 1};
        floor9[4] = new int[]{0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1};
        floor9[5] = new int[]{100, 1, 0, 0, 0, 0, 28, 0, 0, 0, 1};
        floor9[6] = new int[]{100, 1, 101, 1, 1, 1, 1, 1, 1, 29, 1};
        floor9[7] = new int[]{100, 1, 0, 30, 31, 31, 30, 0, 1, 0, 1};
        floor9[8] = new int[]{0, 1, 1, 1, 1, 1, 1, 102, 1, 0, 1};
        floor9[9] = new int[]{0, 0, 150, 151, 150, 151, 0, 0, 1, 0, 999};

        floor10 = new int[10][];
        floor10[0] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor10[1] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor10[2] = new int[]{3, 3, 3, 162, 3, 158, 3, 167, 3, 3, 3};
        floor10[3] = new int[]{3, 3, 3, 102, 3, 102, 3, 102, 3, 3, 3};
        floor10[4] = new int[]{3, 3, 3, 101, 3, 100, 3, 101, 3, 3, 3};
        floor10[5] = new int[]{3, 3, 3, 0, 0, 0, 0, 0, 3, 3, 3};
        floor10[6] = new int[]{3, 3, 3, 3, 3, 32, 3, 3, 3, 3, 3};
        floor10[7] = new int[]{3, 3, 3, 3, 3, 32, 3, 3, 3, 3, 3};
        floor10[8] = new int[]{3, 3, 3, 3, 3, 32, 3, 3, 3, 3, 3};
        floor10[9] = new int[]{1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 999};

        floor11 = new int[10][];
        floor11[0] = new int[]{33, 0, 0, 151, 0, 0, 25, 0, 0, 1, 999};
        floor11[1] = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 100, 1};
        floor11[2] = new int[]{0, 1, 0, 0, 150, 150, 150, 0, 0, 1, 151};
        floor11[3] = new int[]{156, 1, 0, 1, 1, 1, 1, 1, 1, 1, 100};
        floor11[4] = new int[]{0, 1, 0, 1, 153, 153, 21, 100, 0, 1, 0};
        floor11[5] = new int[]{0, 1, 0, 101, 21, 154, 154, 1, 0, 1, 0};
        floor11[6] = new int[]{25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 21};
        floor11[7] = new int[]{0, 1, 0, 0, 155, 155, 155, 0, 0, 1, 0};
        floor11[8] = new int[]{0, 1, 100, 1, 1, 1, 1, 1, 1, 1, 0};
        floor11[9] = new int[]{1000, 1, 0, 0, 33, 0, 0, 152, 0, 0, 25};

        floor12 = new int[10][];
        floor12[0] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor12[1] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor12[2] = new int[]{3, 3, 0, 0, 0, 999, 0, 0, 0, 3, 3};
        floor12[3] = new int[]{3, 3, 102, 2, 0, 0, 0, 3, 102, 3, 3};
        floor12[4] = new int[]{3, 3, 154, 3, 0, 34, 0, 3, 153, 3, 3};
        floor12[5] = new int[]{3, 3, 154, 3, 3, 101, 3, 3, 153, 3, 3};
        floor12[6] = new int[]{3, 3, 154, 3, 0, 0, 0, 3, 153, 3, 3};
        floor12[7] = new int[]{3, 3, 154, 3, 150, 1000, 150, 3, 153, 3, 3};
        floor12[8] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor12[9] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        floor13 = new int[10][];
        floor13[0] = new int[]{0, 0, 34, 0, 0, 35, 0, 0, 37, 3, 1000};
        floor13[1] = new int[]{37, 3, 3, 3, 3, 3, 3, 3, 3, 0, 3};
        floor13[2] = new int[]{0, 3, 37, 0, 0, 34, 0, 3, 0, 3, 0};
        floor13[3] = new int[]{0, 3, 0, 3, 3, 3, 0, 3, 34, 3, 34};
        floor13[4] = new int[]{35, 3, 0, 35, 999, 3, 35, 3, 0, 3, 0};
        floor13[5] = new int[]{0, 3, 35, 3, 0, 0, 0, 3, 0, 3, 0};
        floor13[6] = new int[]{0, 3, 0, 3, 3, 3, 3, 3, 35, 3, 35};
        floor13[7] = new int[]{34, 3, 0, 34, 0, 0, 37, 0, 0, 3, 0};
        floor13[8] = new int[]{0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0};
        floor13[9] = new int[]{0, 37, 0, 0, 35, 0, 0, 34, 0, 0, 35};

        floor14 = new int[10][];
        floor14[0] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor14[1] = new int[]{3, 0, 0, 0, 3, 999, 3, 0, 0, 0, 10};
        floor14[2] = new int[]{3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3};
        floor14[3] = new int[]{3, 0, 3, 0, 3, 36, 3, 0, 3, 0, 3};
        floor14[4] = new int[]{3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3};
        floor14[5] = new int[]{3, 0, 3, 0, 37, 0, 37, 0, 3, 0, 3};
        floor14[6] = new int[]{3, 0, 3, 3, 3, 0, 3, 3, 3, 0, 3};
        floor14[7] = new int[]{3, 0, 3, 3, 3, 0, 3, 3, 3, 0, 3};
        floor14[8] = new int[]{3, 0, 0, 163, 3, 1000, 3, 168, 0, 0, 3};
        floor14[9] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        floor15 = new int[10][];
        floor15[0] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        floor15[1] = new int[]{3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        floor15[2] = new int[]{3, 2, 36, 0, 2, 17, 2, 0, 36, 2, 3};
        floor15[3] = new int[]{3, 2, 2, 0, 2, 103, 2, 0, 2, 2, 3};
        floor15[4] = new int[]{3, 3, 2, 0, 0, 0, 0, 0, 2, 3, 3};
        floor15[5] = new int[]{3, 3, 2, 0, 0, 0, 0, 0, 2, 3, 3};
        floor15[6] = new int[]{3, 2, 2, 0, 2, 0, 2, 0, 2, 2, 3};
        floor15[7] = new int[]{3, 2, 36, 0, 2, 1000, 2, 0, 36, 2, 3};
        floor15[8] = new int[]{3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        floor15[9] = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    }

    public void draw(Context context, Canvas canvas, int floor) {
        Paint paint = new Paint();
        paint.setAlpha(100);
        paint.setAntiAlias(true);

        Bitmap[][] mapBitmaps = ImageFactory.getMapBitmaps(context.getResources());
        int[][] floorMap = getMap(floor);
        float itemWidth = GameSurfaceView.MAP_ITEM_WIDTH;
        for (int i = floorMap.length - 1; i >= 0; --i) {
            for (int j = floorMap[i].length - 1; j >= 0; --j) {
                Bitmap target;
                if (floorMap[i][j] == 1) {
                    target = mapBitmaps[0][1];
                } else if (floorMap[i][j] == 2) {
                    target = mapBitmaps[0][0];
                } else if (floorMap[i][j] == 3) {
                    target = mapBitmaps[1][0];
                } else if (floorMap[i][j] == 4) {
                    target = mapBitmaps[1][1];
                } else {
                    target = mapBitmaps[1][2];
                }
                RectF rectF = new RectF(j * itemWidth, i * itemWidth, (j + 1) * itemWidth, (i + 1) * itemWidth);
                canvas.drawBitmap(target, null, rectF, paint);
            }
        }
    }

    public static int[][] getMap(int floor) {
        int[][] floorMap;
        switch (floor) {
            case 1: {
                floorMap = floor1;
                break;
            }
            case 2: {
                floorMap = floor2;
                break;
            }
            case 3: {
                floorMap = floor3;
                break;
            }
            case 4: {
                floorMap = floor4;
                break;
            }
            case 5: {
                floorMap = floor5;
                break;
            }
            case 6: {
                floorMap = floor6;
                break;
            }
            case 7: {
                floorMap = floor7;
                break;
            }
            case 8: {
                floorMap = floor8;
                break;
            }
            case 9: {
                floorMap = floor9;
                break;
            }
            case 10: {
                floorMap = floor10;
                break;
            }
            case 11: {
                floorMap = floor11;
                break;
            }
            case 12: {
                floorMap = floor12;
                break;
            }
            case 13: {
                floorMap = floor13;
                break;
            }
            case 14: {
                floorMap = floor14;
                break;
            }
            case 15: {
                floorMap = floor15;
                break;
            }
            default: {
                floorMap = null;
                break;
            }
        }
        return floorMap;
    }
}
