package com.wyattb413;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(4, false, false);
        Bed bed = new Bed(4, 6, 4);
        Dresser dresser = new Dresser(6, 8, 3, 16);
        Tv tv = new Tv(2, 4, new Resolution(1080, 1440), false);

        Bedroom myBedroom = new Bedroom(room, bed, dresser, tv);

        myBedroom.getRoom().openDoor();
        myBedroom.getRoom().closeDoor();

        myBedroom.turnOnTV();
        myBedroom.turnOffTV();
    }
}
