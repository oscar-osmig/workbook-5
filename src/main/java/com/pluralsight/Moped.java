package com.pluralsight;

public class Moped extends Vehicle{

    private String type;

    public Moped() {
        super();
    }

    public Moped(String color) {
        super(color);
    }

    public Moped(String color, String type) {
        super(color);
        this.type = type;
    }

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String type) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Moped{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}
