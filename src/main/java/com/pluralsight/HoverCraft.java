package com.pluralsight;

public class HoverCraft extends Vehicle{

    public HoverCraft() {
        super();
    }

    public HoverCraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    @Override
    public String toString() {
        return "HoverCraft{" +
                "color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}
