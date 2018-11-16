package com.zoup.android.magictower.element;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

import com.zoup.android.magictower.common.ConstUtil;

/**
 * Created by zoup on 2018/11/2
 * E-Mail：2479008771@qq.com
 */
public class Enemy extends Element {
    public int attack;
    public int defence;
    public int exp;
    public int gold;
    public int hp;

    public Enemy(int j, int i, Bitmap[] frameBitmaps, int type, int floor) {
        this.i = i;
        this.j = j;
        this.type = type;
        this.floor = floor;
        this.frameBitmaps = frameBitmaps;
        setProperty();
    }

    @Override
    public void draw(Canvas canvas) {
        this.times++;
        if (this.times == 5) {
            this.index++;
            this.times = 0;
            if (this.index == 4) {
                this.index = 0;
            }
        }
        canvas.drawBitmap(frameBitmaps[index],null,new RectF(i*itemWidth,j*itemWidth,(i+1)*itemWidth,(j+1)*itemWidth),paint);
    }


    private void setProperty() {
        switch (this.type) {
            case ConstUtil.ENEMY1 /*10*/:
                this.hp = 100;
                this.attack = 15;
                this.defence = 5;
                this.exp = 4;
                this.gold = 2;
                break;
            case ConstUtil.ENEMY2:
                this.hp = 120;
                this.attack = 20;
                this.defence = 5;
                this.exp = 4;
                this.gold = 3;
                break;
            case ConstUtil.ENEMY3 /*12*/:
                this.hp = 150;
                this.attack = 25;
                this.defence = 10;
                this.exp = 5;
                this.gold = 4;
                break;
            case ConstUtil.ENEMY4 /*13*/:
                this.hp = 360;
                this.attack = 70;
                this.defence = 40;
                this.exp = 10;
                this.gold = 9;
                break;
            case ConstUtil.ENEMY5 /*14*/:
                this.hp = 195;
                this.attack = 30;
                this.defence = 15;
                this.exp = 6;
                this.gold = 5;
                break;
            case 15:
                this.hp = 320;
                this.attack = 55;
                this.defence = 35;
                this.exp = 9;
                this.gold = 8;
                break;
            case ConstUtil.ENEMY7 /*16*/:
                this.hp = 550;
                this.attack = 99;
                this.defence = 65;
                this.exp = 13;
                this.gold = 11;
                break;
            case ConstUtil.ENEMY8 /*17*/:
                this.hp = 5000;
                this.attack = 999;
                this.defence = 800;
                this.exp = 99;
                this.gold = 99;
                break;
            case ConstUtil.ENEMY9 /*18*/:
                this.hp = 220;
                this.attack = 35;
                this.defence = 20;
                this.exp = 7;
                this.gold = 6;
                break;
            case ConstUtil.ENEMY10 /*19*/:
                this.hp = 240;
                this.attack = 45;
                this.defence = 25;
                this.exp = 8;
                this.gold = 7;
                break;
            case ConstUtil.ENEMY11 /*20*/:
                this.hp = 600;
                this.attack = 120;
                this.defence = 75;
                this.exp = 14;
                this.gold = 12;
                break;
            case ConstUtil.ENEMY12 /*21*/:
                this.hp = 2400;
                this.attack = 470;
                this.defence = 455;
                this.exp = 24;
                this.gold = 22;
                break;
            case ConstUtil.ENEMY13 /*22*/:
                this.hp = 500;
                this.attack = 90;
                this.defence = 55;
                this.exp = 12;
                this.gold = 11;
                break;
            case ConstUtil.ENEMY14 /*23*/:
                this.hp = 650;
                this.attack = 130;
                this.defence = 90;
                this.exp = 15;
                this.gold = 14;
                break;
            case ConstUtil.ENEMY15 /*24*/:
                this.hp = 700;
                this.attack = 135;
                this.defence = 100;
                this.exp = 16;
                this.gold = 15;
                break;
            case ConstUtil.ENEMY16 /*25*/:
                this.hp = 1700;
                this.attack = 470;
                this.defence = 440;
                this.exp = 22;
                this.gold = 20;
                break;
            case ConstUtil.ENEMY17 /*26*/:
                this.hp = 450;
                this.attack = 85;
                this.defence = 50;
                this.exp = 11;
                this.gold = 10;
                break;
            case ConstUtil.ENEMY18 /*27*/:
                this.hp = 900;
                this.attack = ConstUtil.SWORD30;
                this.defence = 135;
                this.exp = 18;
                this.gold = 18;
                break;
            case ConstUtil.ENEMY19 /*28*/:
                this.hp = 800;
                this.attack = 145;
                this.defence = 115;
                this.exp = 17;
                this.gold = 16;
                break;
            case ConstUtil.ENEMY20 /*29*/:
                this.hp = 1000;
                this.attack = 200;
                this.defence = ConstUtil.SWORD30;
                this.exp = 19;
                this.gold = 17;
                break;
            case ConstUtil.ENEMY21 /*30*/:
                this.hp = 1100;
                this.attack = 245;
                this.defence = 200;
                this.exp = 20;
                this.gold = 18;
                break;
            case ConstUtil.ENEMY22 /*31*/:
                this.hp = 1300;
                this.attack = 270;
                this.defence = 230;
                this.exp = 20;
                this.gold = 19;
                break;
            case ConstUtil.ENEMY23 /*32*/:
                this.hp = 1500;
                this.attack = 380;
                this.defence = 350;
                this.exp = 21;
                this.gold = 19;
                break;
            case ConstUtil.ENEMY24 /*33*/:
                this.hp = 2000;
                this.attack = 475;
                this.defence = 450;
                this.exp = 23;
                this.gold = 21;
                break;
            case ConstUtil.ENEMY25 /*34*/:
                this.hp = 2800;
                this.attack = 540;
                this.defence = 530;
                this.exp = 24;
                this.gold = 22;
                break;
            case ConstUtil.ENEMY26 /*35*/:
                this.hp = 3200;
                this.attack = 550;
                this.defence = 540;
                this.exp = 25;
                this.gold = 23;
                break;
            case ConstUtil.ENEMY27 /*36*/:
                this.hp = 4500;
                this.attack = 750;
                this.defence = 720;
                this.exp = 99;
                this.gold = 99;
                break;
            case ConstUtil.ENEMY28 /*37*/:
                this.hp = 4000;
                this.attack = 580;
                this.defence = 575;
                this.exp = 25;
                this.gold = 24;
                break;
            default:
                break;
        }
    }

    @Override
    public void over() {
        Element.tempNpcs.add(this);
        Map.setMap(this.floor, this.i, 11 - this.j);
    }
}