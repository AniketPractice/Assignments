package Traffic_System;

import java.util.Random;

enum vehicleType{
    CAR, BIKE, TRUCK, AMBULANCE
}
// Class representing a vehicle.
public class Vehicle {
    private String id;                      // vehicle id
    private int speed;                      // current speed of the vehicle.
    private boolean stopped;                // to check if the vehicle is stopped.
    public String type;

    // constructor
    public Vehicle(String id, String vehicleType) {
        this.id = id;
        this.speed = 0;                     // the vehicle is not moving.
        this.stopped = true;                // the vehicle is stopped.
        this.type = vehicleType;
    }
    // method to start the vehicle on a random speed.
    public void start(int roadSpeedLimit) {
            if (roadSpeedLimit  < 0){
                System.out.println("Error: Speed cannot be negative.");
                roadSpeedLimit = 0;
            }
            stopped = false;
            Random random = new Random();
            speed = random.nextInt(roadSpeedLimit + 1);
            if (speed == 0){
                stopped = true;
                System.out.println(id + " cannot move as speed is 0 km/h.");
            }else {
                System.out.println(id + " has started driving at speed: " + speed + "km/h.");
                System.out.println("-----------------------------------------------");
            }
    }
    // method to stop a vehicle.
    public void stop() {
        stopped = true;
        speed = 0;
        System.out.println(id + " has stopped.");
        System.out.println("-----------------------------------------------");
    }
      // method to change lanes if the vehicle is moving
        public void changeLane (TrafficLight trafficLight){
            if (!stopped && trafficLight.getColor() == Color.GREEN) {
                System.out.println(id + " is changing lanes.");
                System.out.println("-----------------------------------------------");
            }
        }
    }

