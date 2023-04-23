package net.damian.vehicles;

public class Vehicles {

    String name;
    String colour;
    Double speed;

    public Vehicles(){
        this.colour = colour;
        this.speed = speed;
    }




    public void Output() {
        System.out.println("Nazwa: " + name);
        System.out.println("Prędkość: " + speed + " km/h");
        System.out.println("Kolor: " + colour);
    }
}
