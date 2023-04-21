package airport;

public class Plane {
    private String make;
    private String model;
    private int capacity;
    private int fuelCapacity;
    private int currentFuel;

    // Constructor
    public Plane(String make, String model, int capacity, int fuelCapacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = fuelCapacity;
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    // Refuel the plane
    public void refuel() {
        currentFuel = fuelCapacity;
    }


}