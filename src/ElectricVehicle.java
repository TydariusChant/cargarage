class ElectricVehicle extends Vehicle {

    double batteryCapacity;

    // Constructor to initialize the electric vehicle properties
    public ElectricVehicle(String make, String model, int maxSpeed, double purchasePrice, double maxDistance, double batteryCapacity) {
        super(make, model, maxSpeed, purchasePrice, maxDistance);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to perform maintenance specific to electric vehicles
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the electric vehicle. Checking battery.");
    }
}