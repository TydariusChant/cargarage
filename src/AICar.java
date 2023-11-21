class AICar extends Vehicle {

    String aiSystemVersion;

    // Constructor to initialize the AI car properties
    public AICar(String make, String model, int maxSpeed, double purchasePrice, double maxDistance, String aiSystemVersion) {
        super(make, model, maxSpeed, purchasePrice, maxDistance);
        this.aiSystemVersion = aiSystemVersion;
    }

    // Method to perform maintenance specific to AI cars
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the AI car. Updating AI system to version " + aiSystemVersion);
    }
}