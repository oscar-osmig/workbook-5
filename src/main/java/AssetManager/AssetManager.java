package AssetManager;

import java.util.ArrayList;
import java.util.List;

public class AssetManager {

    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();

        House house = new House("My regular house", "2023-10-03",
                100000.0, "12 w tennyson",1, 10000, 1000 );
        House house2 = new House("My camping house", "2023-03-23",
                100000.0, "24 long beach",1, 15000, 4000 );

        VehicleTwo vehicle = new VehicleTwo("My Honda", "2024-10-22",
                10000, "Honda/civic", 2013, 90000);

        VehicleTwo vehicleTwo = new VehicleTwo("My Supra", "2024-06-12",
                20000, "Toyota/supra", 2023, 99000);

        Cash cash = new Cash("Bonus", "2024-05-04", 500, 500);


        assets.add(house);
        assets.add(house2);
        assets.add(vehicle);
        assets.add(vehicleTwo);
        assets.add(cash);

/*
        System.out.println(house.getValue());
        System.out.println(vehicleTwo.getValue());
*/
         for (int i = 0; i < assets.size(); i++) {
             String message = "";
             if (assets.get(i) instanceof House){
                 House house1 = (House) assets.get(i);
                 message = "House at " + house1.getAddress();
                 System.out.println(message);
             }else if (assets.get(i) instanceof VehicleTwo){
                 VehicleTwo vehicleTwo1 = (VehicleTwo) assets.get(i);
                 message = "Vehicle:  " + vehicleTwo1.getYear() + " " + vehicleTwo1.getMakeModel().toLowerCase();
                 System.out.println(message);
             }else if (assets.get(i) instanceof Cash){
                 Cash cash1 = (Cash) assets.get(i);
                 message = "Cash: " + cash1.getCash();
                 System.out.println(message);
             }
        }



    }
}
