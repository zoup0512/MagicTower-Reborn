package com.zoup.android.magictower.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.orhanobut.logger.Logger;
import com.zoup.android.magictower.R;
import com.zoup.android.magictower.bean.MoveEvent;
import com.zoup.android.magictower.common.rx.RxBus;

/**
 * Created by zoup on 2018/11/14
 * E-Mail：2479008771@qq.com
 */
public class GameInfoFragment extends Fragment {
    private ImageView virtualController;

    public static GameInfoFragment getInstance() {
        return new GameInfoFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game_info, container, false);
        initViews(view);
        addListeners();
        return view;
    }

    private void initViews(View parent) {
        virtualController = parent.findViewById(R.id.virtual_controller);

    }

    @SuppressLint("ClickableViewAccessibility")
    private void addListeners() {
        virtualController.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                    case MotionEvent.ACTION_UP:
                        float xPos = event.getX();
                        float yPos = event.getY();
                        int width = virtualController.getWidth();
                        int height = virtualController.getHeight();
                        int centerX = width / 2;
                        int centerY = height / 2;

                        if (Math.abs(xPos - centerX) > Math.abs(yPos - centerY)) {
                            if (xPos > centerX) {
                                Logger.d("right");
                                postMoveEvent(MoveEvent.ACTION_RIGHT);
                            } else {
                                Logger.d("left");
                                postMoveEvent(MoveEvent.ACTION_LEFT);
                            }
                        } else {
                            if (yPos > centerY) {
                                Logger.d("down");
                                postMoveEvent(MoveEvent.ACTION_DOWN);
                            } else {
                                Logger.d("up");
                                postMoveEvent(MoveEvent.ACTION_UP);
                            }
                        }
                        break;
                }
                return true;
            }
        });
    }

    private void postMoveEvent(int action) {
        MoveEvent moveEvent = new MoveEvent(action);
        RxBus.getInstance().postSticky(moveEvent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
