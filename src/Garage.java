import java.util.ArrayList;
import java.util.List;
class Garage {
    List<Vehicle> vehicles = new ArrayList<>();

    // Method to add a vehicle to the garage
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added to the garage.");
    }

    // Method to remove a vehicle from the garage
    public boolean sellVehicle(Vehicle vehicle) {
        if (vehicles.remove(vehicle)) {
            System.out.println("Vehicle sold.");
            return true;
        } else {
            System.out.println("Vehicle not found in the garage.");
            return false;
        }
    }

    // Method to list all vehicles in the garage
    public void listVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("The garage is empty.");
        } else {
            System.out.println("Vehicles in the garage:");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.make + " " + vehicle.model);
            }
        }
    }
}