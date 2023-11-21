class Car extends Vehicle {

    // Constructor to initialize the car properties
    public Car(String make, String model, int maxSpeed, double purchasePrice, double maxDistance) {
        super(make, model, maxSpeed, purchasePrice, maxDistance);
    }

    // Method to perform maintenance specific to regular cars
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the regular car.");
    }
}