
package vehicles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Step 3: Implement the Polymorphic FleetManager.
 */
public class FleetManager {

    private final List<Vehicle> vehicles = new ArrayList<>();

    /**
     * Adds a vehicle to the fleet.
     *
     * @param vehicle vehicle to add (must not be null)
     */
    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException(
                    "Vehicle cannot be null"
            );
        }

        vehicles.add(vehicle);
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    /**
     * Calculates total passenger capacity across all vehicles.
     *
     * @return total passenger capacity
     */
    public int getTotalPassengerCapacity() {
        int totalCapacity = 0;

        for (Vehicle vehicle : vehicles) {
            totalCapacity += vehicle.getPassengerCapacity();
        }

        return totalCapacity;
    }

    /**
     * Finds the fastest vehicle based on maxSpeed.
     *
     * @return fastest vehicle, or null if fleet is empty
     */
    public Vehicle findFastestVehicle() {
        if (vehicles.isEmpty()) {
            return null;
        }

        Vehicle fastest = vehicles.get(0);

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMaxSpeed() > fastest.getMaxSpeed()) {
                fastest = vehicle;
            }
        }

        return fastest;
    }

    public List<Vehicle> getVehicles() {
        return Collections.unmodifiableList(vehicles);
    }
}
