package com.zoup.android.magictower.database;

import org.litepal.crud.LitePalSupport;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by zoup on 2018/11/21
 * E-Mail：2479008771@qq.com
 */
@Getter
@Setter
public class HeroInfo extends LitePalSupport {
    private int left;
    private int top;
    private int direction;
    private int attack;
    private int defence;
    private int hp;
    private int exp;
    private int gold;
    private int yellow_key;
    private int blue_key;
    private int red_key;
    private boolean is_search;
    private boolean is_fly;
    private int max_floor;
    private int cur_floor;

}
