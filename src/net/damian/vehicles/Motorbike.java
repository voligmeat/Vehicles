package net.damian.vehicles;

public class Motorbike extends Vehicles {

    Boolean trunk;
    String trunkWord;

    public Motorbike(String name, Boolean trunk, String colour, Double speed){
        super();
        this.trunk = trunk;
        super.colour = colour;
        super.speed = speed;
        super.name = name;
    }

    @Override
    public void Output(){
        super.Output();
        if(trunk == false){
            trunkWord = "Nie";
        } else {
            trunkWord = "Tak";
        }
        System.out.println("Kufer: " + trunkWord);
    }

}
