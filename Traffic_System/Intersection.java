package Traffic_System;

import java.util.ArrayList;
import java.util.List;

// Class represents an intersection where vehicles and traffic lights interact
public class Intersection {

    private TrafficLight trafficLight;          // Traffic light controlling the intersection
    private List<Vehicle> vehicles;             // List of vehicles at the intersection

    // Constructor to initialize traffic light and vehicle list
    public Intersection() {
        this.trafficLight = new TrafficLight();
        this.vehicles = new ArrayList<>();
    }

    // Method to add a vehicle
    public void addVehicle(Vehicle vehicle) {

        vehicles.add(vehicle);

    }

    // Method to simulate traffic behavior based on the traffic light color
    public void simulateTraffic(Road road) {
        trafficLight.cycle();  // Change the traffic light color (cycle)
        int roadSpeedLimit = road.getSpeedLimit();

        for (Vehicle vehicle : vehicles) {
            if (trafficLight.getColor().equals(Color.GREEN)) {
                vehicle.start(roadSpeedLimit);
                vehicle.changeLane(trafficLight);
            }
            if (trafficLight.getColor().equals(Color.YELLOW)) {
                vehicle.start(roadSpeedLimit);
                vehicle.changeLane(trafficLight);
            }
            if (trafficLight.getColor().equals(Color.RED)){
                if( vehicle.type.equals("AMBULANCE")) {
                    vehicle.start(roadSpeedLimit);
                    vehicle.changeLane(trafficLight);
                }else {vehicle.stop();}}
            }
        }
    // Getter method for the traffic light
    public int getVehicleCount() {
        return vehicles.size();
    }



}
