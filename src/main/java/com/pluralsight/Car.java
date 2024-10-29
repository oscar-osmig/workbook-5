package com.pluralsight;

public class Car extends Vehicle{

    public Car() {
        super();
    }

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}
