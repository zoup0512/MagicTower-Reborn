package com.zoup.android.magictower.bean;

public class MoveEvent {
    private int addX;
    private int addY;

    public MoveEvent() {
    }

    public MoveEvent(int addX, int addY) {
        this.addX = addX;
        this.addY = addY;
    }

    public int getAddX() {
        return addX;
    }

    public void setAddX(int addX) {
        this.addX = addX;
    }

    public int getAddY() {
        return addY;
    }

    public void setAddY(int addY) {
        this.addY = addY;
    }
}
