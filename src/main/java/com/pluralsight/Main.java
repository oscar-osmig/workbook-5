package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Moped slowRide = new Moped("red", 5, 12, 5, "suv");
//        slowRide.setColor("Red");
        Car car = new Car("blue", 4, 5, 6);
        SemiTruck semiTruck = new SemiTruck("green", 4, 5, 6);
        HoverCraft hoverCraft = new HoverCraft("bluish", 4, 5, 6);

        System.out.println(slowRide.toString());
        System.out.println(car.toString());
        System.out.println(semiTruck.toString());
        System.out.println(hoverCraft.toString());

    }
}