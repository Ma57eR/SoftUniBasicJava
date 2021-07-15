package Fundamentals.Objects.Objects2.VehicleCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split(" ")[0].substring(0, 1).toUpperCase() + input.split(" ")[0].substring(1);
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsePower = Integer.parseInt(input.split(" ")[3]);

            Vehicle currentVehicle = new Vehicle(type, model, color, horsePower);
            vehicles.add(currentVehicle);

            input = scan.nextLine();
        }
        input = scan.nextLine();

        while (!input.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (input.equals(vehicle.getModel())) {
                    System.out.println(vehicle.printVehicle());
                }
            }
            input = scan.nextLine();
        }
        int countCars = 0;
        int countTrucks = 0;
        double carsAveragePower = 0;
        double trucksAveragePower = 0;
        countVehicles(countCars, countTrucks, vehicles,carsAveragePower, trucksAveragePower);
    }

    private static void countVehicles(int countCars, int countTrucks, List<Vehicle> vehicles, double carsPower, double trucksPower) {
        double totalCarPower = 0;
        double totalTruckPower = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("Car")) {
                totalCarPower += vehicle.getHorsePower();
                countCars++;
            } else {
                countTrucks++;
                totalTruckPower += vehicle.getHorsePower();
            }
        }
        carsPower = totalCarPower / (double) countCars;
        trucksPower = totalTruckPower / (double) countTrucks;

        if (countCars>0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsPower);
        } else {
            System.out.println("Cars have average horsepower of: 0.00.%n");
        }

        if (countTrucks > 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksPower);
        } else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }
    }
}
