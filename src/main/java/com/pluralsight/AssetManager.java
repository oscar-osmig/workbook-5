package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class AssetManager {

    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();

        House house = new House("My house", "2023-10-03",
                100000.0, "12 w tennyson",1, 10000, 1000 );
        House house2 = new House("My house", "2023-10-03",
                100000.0, "12 w tennyson",1, 10000, 1000 );

        VehicleTwo vehicle = new VehicleTwo("My car", "2024-10-22",
                10000, "honda/civic", 2013, 90000);

        VehicleTwo vehicleTwo = new VehicleTwo("My car", "2024-10-22",
                10000, "honda/civic", 2013, 90000);


        assets.add(house);
        assets.add(house2);
        assets.add(vehicle);
        assets.add(vehicleTwo);

/*
        System.out.println(house.getValue());
        System.out.println(vehicleTwo.getValue());
*/



    }
}
