package com.wyattb413;

public class Bedroom {

    private Room room;
    private Bed bed;
    private Dresser dresser;
    private Tv tv;

    public Bedroom(Room room, Bed bed, Dresser dresser, Tv tv) {
        this.room = room;
        this.bed = bed;
        this.dresser = dresser;
        this.tv = tv;
    }

    public Room getRoom() {
        return room;
    }

    public Bed getBed() {
        return bed;
    }

    public Dresser getDresser() {
        return dresser;
    }

    private Tv getTv() {
        return tv;
    }

    public void turnOnTV() {
        getTv().turnTvOn();
    }

    public void turnOffTV() {
        getTv().turnTvOff();
    }
}
