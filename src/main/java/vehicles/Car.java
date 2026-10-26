
package vehicles;

/**
 * Step 2: Complete the Car subclass.
 * Extends Vehicle.
 */
public class Car extends Vehicle {

    // Private field for encapsulation
    private int fuelLevelPercent;

    public Car(String model, int maxSpeed, int passengerCapacity,
               int fuelLevelPercent) {

        // Constructor chaining
        super(model, maxSpeed, passengerCapacity);

        // Validate fuel level
        if (fuelLevelPercent < 0 || fuelLevelPercent > 100) {
            throw new IllegalArgumentException(
                    "Fuel level must be between 0 and 100"
            );
        }

        this.fuelLevelPercent = fuelLevelPercent;
    }

    // Getter for fuel level
    public int getFuelLevelPercent() {
        return fuelLevelPercent;
    }

    // Refuel the car, capped at 100%
    public void refuel(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Refuel amount must be positive"
            );
        }

        this.fuelLevelPercent =
                Math.min(100, this.fuelLevelPercent + amount);
    }

    @Override
    public double calculateTravelTime(double distanceInKm) {
        if (distanceInKm <= 0) {
            throw new IllegalArgumentException(
                    "Distance must be greater than 0"
            );
        }

        return distanceInKm / getMaxSpeed();
    }
}
