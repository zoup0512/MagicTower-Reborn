package com.zoup.android.magictower.bean;

public class MoveEvent {
    public static final int ACTION_UP = 0;
    public static final int ACTION_RIGHT = 1;
    public static final int ACTION_DOWN = 2;
    public static final int ACTION_LEFT = 3;

    private int action;

    public MoveEvent() {
    }

    public MoveEvent(int action) {
        this.action = action;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }
}
