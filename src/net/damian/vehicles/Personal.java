package net.damian.vehicles;

import java.io.Console;

public class Personal extends Vehicles {

    Integer qtyDoors;

    public Personal(String name, Integer qtyDoors, String colour, Double speed){
        super();
        this.qtyDoors = qtyDoors;
        super.colour = colour;
        super.speed = speed;
        super.name = name;
    }


    @Override
    public void Output(){
        super.Output();
        System.out.println("Ilość drzwi: " + qtyDoors);
    }

}
