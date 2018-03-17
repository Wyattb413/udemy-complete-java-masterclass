package com.wyattb413;

public class Room {

    private int walls;
    private boolean doorOpen;
    private boolean windowOpen;

    public Room(int walls, boolean doorOpen, boolean windowOpen) {
        this.walls = walls;
        this.doorOpen = doorOpen;
        this.windowOpen = windowOpen;
    }

    public int getWalls() {
        return walls;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    private void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public boolean isWindowOpen() {
        return windowOpen;
    }

    private void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

    public void openDoor() {
        System.out.println("Opening Door...");

        setDoorOpen(true);
    }

    public void closeDoor() {
        System.out.println("Closing Door...");

        setDoorOpen(false);
    }

    public void openWindow() {
        System.out.println("Opening Window...");

        setWindowOpen(true);
    }

    public void closeWindow() {
        System.out.println("Closing Window...");

        setWindowOpen(false);
    }
}
