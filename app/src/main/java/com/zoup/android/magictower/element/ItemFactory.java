package com.zoup.android.magictower.element;

import android.content.res.Resources;

import com.zoup.android.magictower.common.ImageFactory;

/**
 * Created by zoup on 2018/11/2
 * E-Mail：2479008771@qq.com
 */
public class ItemFactory {

    public static void setElement(Resources resources, int[][] map, int floor) {
        Element.npcs.clear();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                switch (map[i][j]) {
                    case 10: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 10), 10, floor);
                        break;
                    }
                    case 11: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 11), 11, floor);
                        break;
                    }
                    case 12: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 12), 12, floor);
                        break;
                    }
                    case 13: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 13), 13, floor);
                        break;
                    }
                    case 14: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 14), 14, floor);
                        break;
                    }
                    case 15: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 15), 15, floor);
                        break;
                    }
                    case 16: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 16), 16, floor);
                        break;
                    }
                    case 17: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 17), 17, floor);
                        break;
                    }
                    case 18: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 18), 18, floor);
                        break;
                    }
                    case 19: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 19), 19, floor);
                        break;
                    }
                    case 20: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 20), 20, floor);
                        break;
                    }
                    case 21: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 21), 21, floor);
                        break;
                    }
                    case 22: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 22), 22, floor);
                        break;
                    }
                    case 23: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 23), 23, floor);
                        break;
                    }
                    case 24: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 24), 24, floor);
                        break;
                    }
                    case 25: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 25), 25, floor);
                        break;
                    }
                    case 26: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 26), 26, floor);
                        break;
                    }
                    case 27: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 27), 27, floor);
                        break;
                    }
                    case 28: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 28), 28, floor);
                        break;
                    }
                    case 29: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 29), 29, floor);
                        break;
                    }
                    case 30: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 30), 30, floor);
                        break;
                    }
                    case 31: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 31), 31, floor);
                        break;
                    }
                    case 32: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 32), 32, floor);
                        break;
                    }
                    case 33: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 33), 33, floor);
                        break;
                    }
                    case 34: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 34), 34, floor);
                        break;
                    }
                    case 35: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 35), 35, floor);
                        break;
                    }
                    case 36: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 36), 36, floor);
                        break;
                    }
                    case 37: {
                        new Enemy(i, j, ImageFactory.getEnemyBitmap(resources, 37), 37, floor);
                        break;
                    }
                    case 999: {
                        new Stair(i, j, ImageFactory.getStairBitmap(resources, 999)[0], 999, floor);
                        break;
                    }
                    case 1000: {
                        new Stair(i, j, ImageFactory.getStairBitmap(resources, 1000)[0], 1000, floor);
                        break;
                    }
                    default:
                        break;
                }
            }
        }
    }
}
