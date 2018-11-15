package com.zoup.android.magictower.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.zoup.android.magictower.R;
import com.zoup.android.magictower.common.ScreenUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        GameSurfaceView gameSurfaceView = new GameSurfaceView(this);
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(ScreenUtils.getScreenH(this)*12/11, ScreenUtils.getScreenH(this));
        gameSurfaceView.setLayoutParams(lp);
        LinearLayout rootView=findViewById(R.id.root_view);
        rootView.addView(gameSurfaceView,0);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, GameInfoFragment.getInstance()).commitNow();
    }
}
