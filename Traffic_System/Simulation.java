package Traffic_System;

import java.util.concurrent.TimeUnit;

// Simulation class to run traffic system
public class Simulation {

    public static void main(String[] args) throws InterruptedException {

        // creating two vehicles.
        Vehicle car = new Vehicle("Car 1- " + vehicleType.CAR,""+ vehicleType.CAR);
        Vehicle ambulance = new Vehicle("Ambulance 1- " + vehicleType.AMBULANCE,""+ vehicleType.AMBULANCE);

        // creating two roads with speed limit
        Road road1 = new Road("Highway 1", 100);
        Road road2 = new Road("Highway 2", 120);

        // printing details of roads
        road1.details();
        road2.details();

        // creating an intersection and add vehicles to it.
        Intersection intersection = new Intersection();

        intersection.addVehicle(car);
        intersection.addVehicle(ambulance);
        System.out.println("\nStarting traffic simulation....\n");

        // simulating traffic for a number of cycles.
        for(int i = 0; i < 4; i++){

            intersection.simulateTraffic(road2);               // Simulate one cycle of traffic light and vehicle behavior
            TimeUnit.SECONDS.sleep(15);               // Pause for 15 seconds before the next cycle

        }

    }
}