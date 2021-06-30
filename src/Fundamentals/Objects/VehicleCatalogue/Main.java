package Fundamentals.Objects.VehicleCatalogue;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");


        List<Catalogue> catalogue = new ArrayList<>();

        while (!input[0].equals("End")) {
            String type = input[0];
            String model = input[1];
            String color = input[2];
            double power = Double.parseDouble(input[3]);

            Catalogue newVehicle = new Catalogue(type, model, color, power);
            catalogue.add(newVehicle);

            input = scan.nextLine().split(" ");
        }
        String modelForPrint = scan.nextLine();
        while (!modelForPrint.equals("Close the Catalogue")) {
            for (Catalogue vehicle : catalogue) {
                if (vehicle.getModelOfVehicle().equals(modelForPrint)) {
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %s%n", vehicle.getTypeOfVehicle().substring(0,1).toUpperCase()+vehicle.getTypeOfVehicle().substring(1), vehicle.getModelOfVehicle(), vehicle.getColor(), vehicle.getHorsePower());
                }
            }
            modelForPrint = scan.nextLine();
        }
        int countCars = 0;
        int countTrucks = 0;
        double sumCarsHP = 0;
        double sumTrucksHP = 0;
        double averageCarsHP = 0.0;
        double averageTrucksHP = 0.0;

        for (Catalogue vehicle : catalogue) {
            if (vehicle.getTypeOfVehicle().equals("car")) {
                countCars++;
                sumCarsHP += vehicle.getHorsePower();
            } else {
                countTrucks++;
                sumTrucksHP += vehicle.getHorsePower();
            }
        }
        averageCarsHP = sumCarsHP / countCars;
        averageTrucksHP = sumTrucksHP / countTrucks;
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHP);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucksHP);
    }

}
