package com.wyattb413;

public class Dresser {

    private int height;
    private int length;
    private int width;
    private int numberOfDrawers;

    public Dresser(int height, int length, int width, int numberOfDrawers) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.numberOfDrawers = numberOfDrawers;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }
}
