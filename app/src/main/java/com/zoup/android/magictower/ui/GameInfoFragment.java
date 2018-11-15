package com.zoup.android.magictower.ui;

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
import android.widget.LinearLayout;
import android.widget.Toast;

import com.zoup.android.magictower.R;

/**
 * Created by zoup on 2018/11/14
 * E-Mail：2479008771@qq.com
 */
public class GameInfoFragment extends Fragment {
    private ImageView controlImage;
    private String TAG = "move";

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
        controlImage = parent.findViewById(R.id.control_image);

    }

    private void addListeners() {
//        controlImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                float x = controlImage.getX();
//                float y = controlImage.getY();
//                int width = controlImage.getMeasuredWidth();
//                int height = controlImage.getMeasuredHeight();
//            }
//        });

        controlImage.setOnTouchListener(new View.OnTouchListener() {
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
                        int width = controlImage.getWidth();
                        int height = controlImage.getHeight();
                        int centerX = width / 2;
                        int centerY = height / 2;
                        if (xPos > centerX && Math.abs(xPos - centerX) > Math.abs(yPos - centerY)) {
//                    Toast.makeText(getActivity(), "move right", Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "right");
                        }
                        if (xPos < centerX && Math.abs(xPos - centerX) > Math.abs(yPos - centerY)) {
//                    Toast.makeText(getActivity(), "move left", Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "left");
                        }
                        if (yPos > centerY && Math.abs(yPos - centerY) > Math.abs(xPos - centerX)) {
//                    Toast.makeText(getActivity(), "move down", Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "down");
                        }
                        if (yPos < centerY && Math.abs(yPos - centerY) > Math.abs(xPos - centerX)) {
//                    Toast.makeText(getActivity(), "move up", Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "up");
                        }

                }
                return true;
            }
        });
    }


}
