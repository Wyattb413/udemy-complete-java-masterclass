package com.wyattb413;

public class Tv {

    private int height;
    private int length;
    private Resolution resolution;
    private boolean isOn;

    public Tv(int height, int length, Resolution resolution, boolean isOn) {
        this.height = height;
        this.length = length;
        this.resolution = resolution;
        this.isOn = isOn;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public boolean isOn() {
        return isOn;
    }

    private void setOn(boolean on) {
        isOn = on;
    }

    public void turnTvOn() {
        System.out.println("Turning TV On...");

        setOn(true);
    }

    public void turnTvOff() {
        System.out.println("Turning TV Off...");

        setOn(false);
    }
}
