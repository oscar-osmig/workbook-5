package com.pluralsight;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        clear();
        Moped slowRide = new Moped("red", 5, 12, 5, "suv");
//        slowRide.setColor("Red");
        Car car = new Car("blue", 4, 5, 6);
        SemiTruck semiTruck = new SemiTruck("green", 4, 5, 6);
        HoverCraft hoverCraft = new HoverCraft("bluish", 4, 5, 6);

//        System.out.println(slowRide.toString());
//        System.out.println(car.toString());
//        System.out.println(semiTruck.toString());
//        System.out.println(hoverCraft.toString());
        shapeMain();
    }

    public static void shapeMain() throws InterruptedException {
        Shape s1 = new Shape();
        Shape s2 = new Square();
        Shape s3 = new Circle();

        s1.calculateCircumference(3);
        ((Square) s2).calculateArea(5);
        ((Circle) s3).calculateCircumference(8);
        Thread.sleep(1500);
        clear();


    }

    public static void clear(){
        System.out.print("\033[H\033[2J");
    }

    public static void clearTerminal(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}