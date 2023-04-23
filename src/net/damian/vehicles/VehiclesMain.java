package net.damian.vehicles;

import java.util.ArrayList;
import java.util.List;

public class VehiclesMain {
    public static void main(String[] args) {
        List<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(new Personal("Fiat", 5, "Blue", 25.75));
        vehicles.add(new Personal("Skoda", 4, "Gray", 110.00));
        vehicles.add(new Personal("Opel", 5, "Moon", 87.40));
        vehicles.add(new Bus("Ikarus", 5, "Red", 100.00));
        vehicles.add(new Truck("Star", 150, "White", 112.00));
        vehicles.add(new Truck("Iveco", 250, "Black", 58.81));
        vehicles.add(new Motorbike("Honda", true, "Black", 58.81));
        vehicles.add(new Motorbike("Kawasaki", false, "Black", 58.81));


        for (Vehicles v : vehicles ) {
           v.Output();
           System.out.println("---");
        }


    }
}