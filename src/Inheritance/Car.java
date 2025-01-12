package Inheritance;

public class Car extends Vehicle {
    final int numOfDoors;
    final boolean hasAirConditioning;

    public Car(String make,String model, int year, int numOfDoors, boolean hasAirConditioning) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Number of Doors: " + numOfDoors +
                ", Air Conditioning: " + (hasAirConditioning ? "Yes" : "No");
    }

    // Additional methods specific to Car
    public boolean isFamilyCar() {
        return numOfDoors >= 4;
    }
}
