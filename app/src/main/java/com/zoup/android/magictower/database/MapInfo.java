package com.zoup.android.magictower.database;

import org.litepal.crud.LitePalSupport;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by zoup on 2018/11/21
 * E-Mail：2479008771@qq.com
 */
@Setter
@Getter
public class MapInfo extends LitePalSupport {
    private int floor;
    private String text;
}
