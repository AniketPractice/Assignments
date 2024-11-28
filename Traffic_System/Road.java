package Traffic_System;

// class representing a road with a name and speed limit
public class Road {

    private int speedLimit;                 // speed limit of the road
    private String name;                    // name of the road

    // Constructor to initialize road with name and speed.
    public Road(String name, int speedLimit){

        this.name = name;
        this.speedLimit =speedLimit;

    }

    // method to print details of the road.
    public void details(){

        System.out.println("Road " + name + " has a speed limit of " + speedLimit + " km/h");

    }

    // Getter for the speed limit
    public int getSpeedLimit() {
        return speedLimit;
    }

    public String getName(){
        return name;
    }

}
