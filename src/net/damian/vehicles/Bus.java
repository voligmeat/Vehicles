package net.damian.vehicles;

public class Bus extends Vehicles {

    Integer qtyPassenger;

    public Bus(String name, Integer qtyPassenger, String colour, Double speed){
        super();
        this.qtyPassenger = qtyPassenger;
        super.colour = colour;
        super.speed = speed;
        super.name = name;
    }


    @Override
    public void Output(){
        super.Output();
        System.out.println("Ilość pasażerów: " + qtyPassenger);
    }

}
