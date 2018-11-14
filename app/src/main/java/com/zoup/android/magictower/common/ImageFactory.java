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
     * @param resources
     * @param fileName  文件名
     * @param rows      原始图片的行数
     * @param columns   原始图片的列数
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

    public static Bitmap[] getEnemyBitmap(Resources arg9, int arg10) {
        Bitmap[] v3 = new Bitmap[4];
        Bitmap v1 = null;
        switch (arg10) {
            case 10:
            case 11:
            case 12:
            case 13: {
                try {
                    v1 = BitmapFactory.decodeStream(arg9.getAssets().open("enemy01.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 14:
            case 15:
            case 16:
            case 17: {
                try {
                    v1 = BitmapFactory.decodeStream(arg9.getAssets().open("enemy02.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 18:
            case 19:
            case 20:
            case 21: {
                try {
                    v1 = BitmapFactory.decodeStream(arg9.getAssets().open("enemy03.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 22:
            case 23:
            case 24:
            case 25: {
                try {
                    v1 = BitmapFactory.decodeStream(arg9.getAssets().open("enemy04.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 26:
            case 27:
            case 28:
            case 29: {
                try {
                    v1 = BitmapFactory.decodeStream(arg9.getAssets().open("enemy05.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 30:
            case 31:
            case 32:
            case 33: {
                try {
                    v1 = BitmapFactory.decodeStream(arg9.getAssets().open("enemy06.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 34:
            case 35:
            case 36:
            case 37: {
                try {
                    v1 = BitmapFactory.decodeStream(arg9.getAssets().open("enemy07.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            default:
                break;
        }

        for (int i = 0; i < 4; i++) {
            v3[i] = Bitmap.createBitmap(v1, v1.getHeight() * i / 4, logic(arg10) * v1.getHeight() / 4, v1.getWidth() / 4, v1.getHeight() / 4);
        }

        return v3;
    }

    public static int logic(int arg5) {
        int v4 = 4;
        int v3 = 3;
        int v2 = 2;
        int v0 = 0;
        switch (arg5) {
            case 11:
            case 15:
            case 19:
            case 23:
            case 27:
            case 31:
            case 35: {
                v0 = 1;
                break;
            }
            case 12:
            case 16:
            case 20:
            case 24:
            case 28:
            case 32:
            case 36: {
                v0 = v2;
                break;
            }
            case 13:
            case 17:
            case 21:
            case 25:
            case 29:
            case 33:
            case 37: {
                v0 = v3;
                break;
            }
            case 51: {
                v0 = 1;
                break;
            }
            case 52: {
                v0 = v2;
                break;
            }
            case 53: {
                v0 = v3;
                break;
            }
            case 101: {
                v0 = 1;
                break;
            }
            case 102: {
                v0 = v2;
                break;
            }
            case 103: {
                v0 = v3;
                break;
            }
            case 151: {
                v0 = 1;
                break;
            }
            case 152: {
                v0 = v2;
                break;
            }
            case 154: {
                v0 = 1;
                break;
            }
            case 155: {
                v0 = v2;
                break;
            }
            case 156: {
                v0 = v3;
                break;
            }
            case 157: {
                v0 = v4;
                break;
            }
            case 158: {
                v0 = 5;
                break;
            }
            case 160: {
                v0 = 1;
                break;
            }
            case 161: {
                v0 = v2;
                break;
            }
            case 162: {
                v0 = v3;
                break;
            }
            case 163: {
                v0 = v4;
                break;
            }
            case 164: {
                v0 = 8;
                break;
            }
            case 165: {
                v0 = 9;
                break;
            }
            case 166: {
                v0 = 10;
                break;
            }
            case 167: {
                v0 = 11;
                break;
            }
            case 168: {
                v0 = 12;
                break;
            }
            case 169: {
                v0 = v4;
                break;
            }
            case 170: {
                v0 = 6;
                break;
            }
            case 171: {
                v0 = 7;
                break;
            }
            default:
                break;
        }
        return v0;
    }

    public static Bitmap[] getStairBitmap(Resources res, int type) {
        Bitmap[] mapBitmap = new Bitmap[4];
        if (type == 999) {
            try {
                mapBitmap[0] = BitmapFactory.decodeStream(res.getAssets().open("up.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (type == 1000) {
            try {
                mapBitmap[0] = BitmapFactory.decodeStream(res.getAssets().open("down.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mapBitmap;
    }

    public static Bitmap getStoneAndHPBitmap(Resources arg7, int arg8) {
        Bitmap v3_1 = null;
        try {
            Bitmap v1 = BitmapFactory.decodeStream(arg7.getAssets().open("item1.png"));
            v3_1 = Bitmap.createBitmap(v1, logic(arg8) % 2 * v1.getWidth() / 2, logic(arg8) / 2 * v1.getHeight() / 3, v1.getWidth() / 2, v1.getHeight() / 3);
        } catch (IOException v3) {
            v3.printStackTrace();
        }
        return v3_1;
    }

    public static Bitmap[] getStoreBitmap(Resources arg9) {
        int v8 = 4;
        Bitmap[] v3 = new Bitmap[v8];
        try {
            Bitmap v2 = BitmapFactory.decodeStream(arg9.getAssets().open("store.png"));
            for (int v1 = 0; v1 < v8; v1++) {
                v3[v1] = Bitmap.createBitmap(v2, v2.getWidth() * v1 / 4, 0, v2.getWidth() / 4, v2.getHeight());
            }
            return v3;
        } catch (IOException v4) {
            v4.printStackTrace();
            return v3;
        }
    }

    public static Bitmap getSwordAndShieldBitmap(Resources arg7, int arg8) {
        Bitmap v3_1 = null;
        try {
            Bitmap v1 = BitmapFactory.decodeStream(arg7.getAssets().open("item2.png"));
            v3_1 = Bitmap.createBitmap(v1, logic(arg8) % 4 * v1.getWidth() / 4, logic(arg8) / 4 * v1.getHeight() / 4, v1.getWidth() / 4, v1.getHeight() / 4);
        } catch (IOException v3) {
            v3.printStackTrace();
        }
        return v3_1;
    }

    public static Bitmap getTitle(Resources arg4) {
        Bitmap v2_1 = null;
        try {
            v2_1 = BitmapFactory.decodeStream(arg4.getAssets().open("title.png"));
        } catch (IOException v2) {
            v2.printStackTrace();
        }
        return v2_1;
    }

    public static Bitmap getKeyFlyGoldBitmap(Resources arg7, int arg8) {
        Bitmap v3_1 = null;
        try {
            Bitmap v1 = BitmapFactory.decodeStream(arg7.getAssets().open("info.png"));
            v3_1 = Bitmap.createBitmap(v1, logic(arg8) % 4 * v1.getWidth() / 4, logic(arg8) / 4 * v1.getHeight() / 2, v1.getWidth() / 4, v1.getHeight() / 2);
        } catch (IOException v3) {
            v3.printStackTrace();
        }

        return v3_1;
    }

    public static Bitmap[] getNPCBitmap(Resources arg9, int arg10) {
        int v8 = 4;
        Bitmap[] v3 = new Bitmap[v8];
        try {
            Bitmap v1 = BitmapFactory.decodeStream(arg9.getAssets().open("npc.png"));
            int v2;
            for (v2 = 0; v2 < v8; ++v2) {
                v3[v2] = Bitmap.createBitmap(v1, v1.getHeight() * v2 / 4, logic(arg10) * v1.getHeight() / 4, v1.getWidth() / 4, v1.getHeight() / 4);
            }

            return v3;
        } catch (Exception v4) {
            v4.printStackTrace();
            return v3;
        }
    }

    public static Bitmap[] getDoorBitmap(Resources arg9, int arg10) {
        Bitmap[] v3 = new Bitmap[4];
        try {
            Bitmap v1 = BitmapFactory.decodeStream(arg9.getAssets().open("door.png"));
            for (int i = 0; i < 4; i++) {
                v3[i] = Bitmap.createBitmap(v1, logic(arg10) * v1.getHeight() / 4, v1.getHeight() * i / 4, v1.getWidth() / 4, v1.getHeight() / 4);
            }
        } catch (IOException v4) {
            v4.printStackTrace();
        }
        return v3;
    }

    public static Bitmap[] getInfoBitmap(Resources arg9) {
        int v8 = 8;
        Bitmap[] v3 = new Bitmap[v8];
        try {
            Bitmap v2 = BitmapFactory.decodeStream(arg9.getAssets().open("info.png"));
            for (int v1 = 0; v1 < v8; ++v1) {
                v3[v1] = Bitmap.createBitmap(v2, v1 % 4 * v2.getWidth() / 4, v1 / 4 * v2.getHeight() / 2, v2.getWidth() / 4, v2.getHeight() / 2);
            }
        } catch (IOException v4) {
            v4.printStackTrace();
        }
        return v3;
    }

    public static Bitmap getBgBitmap(Resources arg4) {
        Bitmap v2_1 = null;
        try {
            v2_1 = BitmapFactory.decodeStream(arg4.getAssets().open("bg.png"));
        } catch (IOException v2) {
            v2.printStackTrace();
        }
        return v2_1;
    }

}
