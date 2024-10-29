package com.pluralsight;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle extends Shape{
    private int radius;

    public Circle() {
        super();

    }


    @Override
    public void calculateCircumference(int radius) {
        Double circumference = ((radius * 2) * Math.PI);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println("circumference: " + decimalFormat.format(circumference) );
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
