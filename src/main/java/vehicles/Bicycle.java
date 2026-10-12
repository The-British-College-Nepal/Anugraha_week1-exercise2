package vehicles;

/**
 * Step 1: Complete the Bicycle subclass.
 * Extends {@link Vehicle}.
 *
 * Requirements:
 * 1. Constructor: Bicycle(String model, int maxSpeed, int gearCount)
 *    - Must chain to super constructor with (model, maxSpeed, 1) because a standard bike has 1 passenger capacity.
 *    - Must check that gearCount > 0; throw IllegalArgumentException if gearCount <= 0.
 *    - Store gearCount in the private field.
 * 2. getGearCount(): Return the gearCount.
 * 3. calculateTravelTime(double distanceInKm):
 *    - Must throw IllegalArgumentException if distanceInKm <= 0.
 *    - Must return distanceInKm / getMaxSpeed().
 */
public class Bicycle extends Vehicle {

    private int gearCount;

    public Bicycle(String model, int maxSpeed, int gearCount) {
        super(model, maxSpeed, 1);
        if (gearCount <= 0) {
            throw new IllegalArgumentException("Gear count must be positive");

        }
        this.gearCount=gearCount;


        // TODO [Step 1.2]: Assign gearCount to this.gearCount
    }

    public int getGearCount() {
        // TODO [Step 1.3]: Return gearCount
        return gearCount;
    }

    @Override
    public double calculateTravelTime(double distanceInKm) {
        if (distance<=0){
            throw new IllegalArgumentException("Distance nust be greater than 0")
        }
        return distance /this.getMaxSpeed();
    }
}
