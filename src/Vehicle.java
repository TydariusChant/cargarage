abstract class Vehicle {
    String make;
    String model;
    int maxSpeed;
    double purchasePrice;
    double maxDistance;
    boolean isRunning;

    // Constructor to initialize the vehicle properties
    public Vehicle(String make, String model, int maxSpeed, double purchasePrice, double maxDistance) {
        this.make = make;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.purchasePrice = purchasePrice;
        this.maxDistance = maxDistance;
        this.isRunning = false;
    }

    // Method to start the vehicle
    public void startVehicle() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Vehicle is now running.");
        } else {
            System.out.println("Vehicle is already running.");
        }
    }

    // Method to drive the vehicle
    public void driveVehicle() {
        if (isRunning) {
            System.out.println("Driving the vehicle...");
        } else {
            System.out.println("Vehicle is not running. Please start the vehicle first.");
        }
    }

    // Method to get maximum speed of the vehicle
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Method to get purchase price of the vehicle
    public double getPurchasePrice() {
        return purchasePrice;
    }

    // Method to get maximum distance without stopping for the vehicle
    public double getMaxDistance() {
        return maxDistance;
    }

    // Abstract method for performing maintenance, to be implemented by subclasses
    public abstract void performMaintenance();
}