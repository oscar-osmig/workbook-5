package com.pluralsight;

public class Square  extends Shape{
    private int sideSize;

    public Square() {
        super();

    }

    @Override
    public void calculateArea(int sideSize) {
        System.out.println("area: " + (sideSize*sideSize) + " sq");
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }
}
