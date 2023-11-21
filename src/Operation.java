import java.util.Scanner;
class Operation {
    Garage garage = new Garage();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Car Garage Management System");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Sell Vehicle");
            System.out.println("3. List Vehicles");
            System.out.println("4. Perform Maintenance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    sellVehicle();
                    break;
                case 3:
                    garage.listVehicles();
                    break;
                case 4:
                    performMaintenance();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 5.");
            }
        }
    }

    private void addVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Vehicle");
        System.out.println("1. Regular Car");
        System.out.println("2. Electric Vehicle");
        System.out.println("3. AI Car");
        System.out.print("Choose vehicle type: ");
        int vehicleType = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter max speed: ");
        int maxSpeed = scanner.nextInt();
        System.out.print("Enter purchase price: ");
        double purchasePrice = scanner.nextDouble();
        System.out.print("Enter max distance without stopping: ");
        double maxDistance = scanner.nextDouble();

        Vehicle vehicle = null;
        switch (vehicleType) {
            case 1:
                vehicle = new Car(make, model, maxSpeed, purchasePrice, maxDistance);
                break;
            case 2:
                System.out.print("Enter battery capacity: ");
                double batteryCapacity = scanner.nextDouble();
                vehicle = new ElectricVehicle(make, model, maxSpeed, purchasePrice, maxDistance, batteryCapacity);
                break;
            case 3:
                scanner.nextLine(); // consume the remaining newline
                System.out.print("Enter AI system version: ");
                String aiSystemVersion = scanner.nextLine();
                vehicle = new AICar(make, model, maxSpeed, purchasePrice, maxDistance, aiSystemVersion);
                break;
        }

        if (vehicle != null) {
            garage.addVehicle(vehicle);
        } else {
            System.out.println("Invalid vehicle type selected.");
        }
    }

    private void sellVehicle() {
        Scanner scanner = new Scanner(System.in);
        garage.listVehicles();
        System.out.print("Enter the make of the vehicle to sell: ");
        String make = scanner.nextLine();
        System.out.print("Enter the model of the vehicle to sell: ");
        String model = scanner.nextLine();

        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : garage.vehicles) {
            if (vehicle.make.equals(make) && vehicle.model.equals(model)) {
                vehicleToRemove = vehicle;
                break;
            }
        }

        if (vehicleToRemove != null) {
            garage.sellVehicle(vehicleToRemove);
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    private void performMaintenance() {
        Scanner scanner = new Scanner(System.in);
        garage.listVehicles();
        System.out.print("Enter the make of the vehicle to perform maintenance on: ");
        String make = scanner.nextLine();
        System.out.print("Enter the model of the vehicle to perform maintenance on: ");
        String model = scanner.nextLine();

        for (Vehicle vehicle : garage.vehicles) {
            if (vehicle.make.equals(make) && vehicle.model.equals(model)) {
                vehicle.performMaintenance();
                return;
            }
        }

        System.out.println("Vehicle not found.");
    }
}