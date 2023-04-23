package net.damian.vehicles;

public class Truck extends Vehicles {

    Integer payLoad;

    public Truck(String name, Integer payLoad, String colour, Double speed){
        super();
        this.payLoad = payLoad;
        super.colour = colour;
        super.speed = speed;
        super.name = name;
    }


    @Override
    public void Output(){
        super.Output();
        System.out.println("Ładowność: " + payLoad + " kg");
    }

}
