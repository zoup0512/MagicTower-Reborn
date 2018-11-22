package com.zoup.android.magictower.database;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zoup on 2018/11/22
 * E-Mail：2479008771@qq.com
 */
public class EnemyData {
    //    private static List<EnemyBean> enemyBeanList=new ArrayList<>();
    public static void init() {
//        final EnemyBean enemyBean = new EnemyBean();
//        enemyBean.setEnemyId("0101");
//        enemyBean.setName("骷髅兵");
//        enemyBean.setAttack(10);
//        enemyBean.setDefence(10);
//        enemyBean.setHp(1000);
//        enemyBean.setExp(40);
//        enemyBean.setGold(20);
//        enemyBean.setType(2);

        List<EnemyBean> enemyBeanList = new ArrayList<EnemyBean>() {
            {
                add(EnemyBean.builder().enemyId("0101").name("骷髅人").hp(1000).attack(15).defence(10).exp(10).gold(10).type(2).build());
                add(EnemyBean.builder().enemyId("01012").name("骷髅士兵").hp(1000).attack(15).defence(10).exp(10).gold(10).type(2).build());
            }
        };
        LitePal.saveAll(enemyBeanList);
    }
}
