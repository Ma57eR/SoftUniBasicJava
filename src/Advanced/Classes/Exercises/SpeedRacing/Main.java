package Advanced.Classes.Exercises.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfCars = Integer.parseInt(scan.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        //Добавяне на колите
        for (int i = 0; i < numOfCars; i++) {

            String[] carData = scan.nextLine().split("\\s+");
            String model = carData[0];
            double fuel = Double.parseDouble(carData[1]);
            double fuelCost = Double.parseDouble(carData[2]);
            Car currentCar = new Car(model, fuel, fuelCost);
            cars.put(model, currentCar);

        }

        String[] driveCommands = scan.nextLine().split("\\s+");

        while (!driveCommands[0].equals("End")) {
            String model = driveCommands[1];
            double amountOfKm = Double.parseDouble(driveCommands[2]);
            Car car = cars.get(model);
            if (!car.drive(amountOfKm)) {
                System.out.println("Insufficient fuel for the drive");
            }

            driveCommands = scan.nextLine().split("\\s+");
        }

        cars.values().forEach(System.out::println);

    }
}
