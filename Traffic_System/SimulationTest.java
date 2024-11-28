//package Traffic_System;
//
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class SimulationTest {
//
//    @Test
//    void testMainSimulationOutput() throws InterruptedException {
//        // Set up to capture system output
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        PrintStream originalOut = System.out; // Save the original System.out
//        System.setOut(new PrintStream(outputStream));
//
//        try {
//            // Run the main method
//            Simulation.main(new String[]{});
//
//            // Convert the output to a String
//            String output = outputStream.toString();
//
//            // Assert that the output contains expected messages
//            // Road details
//            assertTrue(output.contains("Highway 1 has a speed limit of 100 km/h"),
//                    "Road 1 details missing");
//            assertTrue(output.contains("Highway 2 has a speed limit of 120 km/h"),
//                    "Road 2 details missing");
//
//            // Vehicle behavior
//            assertTrue(output.contains("Car 1- CAR has started driving"),
//                    "Car start behavior not printed");
//            assertTrue(output.contains("Ambulance 1- AMBULANCE is driving with priority"),
//                    "Ambulance priority behavior not printed");
//
//            // Traffic light cycling
//            assertTrue(output.contains("Traffic light is cycling"),
//                    "Traffic light cycling behavior not printed");
//
//            // Simulation start message
//            assertTrue(output.contains("Starting traffic simulation...."),
//                    "Simulation start message missing");
//
//        } finally {
//            // Restore the original System.out
//            System.setOut(originalOut);
//        }
//    }
//}
//

package Traffic_System;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimulationTest {

    @Test
    void testTrafficSimulation() throws InterruptedException {
        // Arrange: Set up vehicles, roads, and intersection
        Vehicle car = new Vehicle("Car 1- " + vehicleType.CAR, "" + vehicleType.CAR);
        Vehicle ambulance = new Vehicle("Ambulance 1- " + vehicleType.AMBULANCE, "" + vehicleType.AMBULANCE);

        Road road1 = new Road("Highway 1", 100);
        Road road2 = new Road("Highway 2", 120);

        Intersection intersection = new Intersection();
        intersection.addVehicle(car);
        intersection.addVehicle(ambulance);

        // Act: Simulate traffic
        for (int i = 0; i < 2; i++) { // Run 2 cycles instead of 4 for testing purposes
            intersection.simulateTraffic(road2);
            TimeUnit.MILLISECONDS.sleep(500); // Use shorter delay for testing
        }

        // Assert: Verify simulation state (example checks)
        assertEquals(2, intersection.getVehicleCount(), "Intersection should have 2 vehicles");
        assertTrue(road1.getSpeedLimit() <= 120, "Road 1 speed limit should be within normal bounds");
        assertTrue(road2.getSpeedLimit() <= 120, "Road 2 speed limit should be within normal bounds");
    }
}
