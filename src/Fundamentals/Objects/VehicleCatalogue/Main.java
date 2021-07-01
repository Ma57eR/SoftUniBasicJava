package Fundamentals.Objects.VehicleCatalogue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        //String[] input = scan.nextLine().split(" ");

        int countCars = 0;
        int countTrucks = 0;
        double sumCarsHP = 0;
        double sumTrucksHP = 0;
        double averageCarsHP = 0.0;
        double averageTrucksHP = 0.0;
        List<Catalogue> catalogue = new ArrayList<>();

        while (!input.get(0).equals("End")) {
            String type = input.get(0);
            String model = input.get(1);
            String color = input.get(2);
            double power = Double.parseDouble(input.get(3));

            Catalogue newVehicle = new Catalogue(type, model, color, power);
            catalogue.add(newVehicle);
            if (newVehicle.getType().equals("car")) {
                countCars++;
                sumCarsHP += newVehicle.getHorsepower();
            } else {
                countTrucks++;
                sumTrucksHP += newVehicle.getHorsepower();
            }

            input = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        }
        String modelForPrint = scan.nextLine();
        while (!modelForPrint.equals("Close the Catalogue")) {
            for (Catalogue vehicle : catalogue) {
                if (vehicle.getModel().equals(modelForPrint)) {
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f%n", vehicle.getType().substring(0,1).toUpperCase()+vehicle.getType().substring(1), vehicle.getModel(), vehicle.getColor(), vehicle.getHorsepower());
                }
            }
            modelForPrint = scan.nextLine();
        }
//        int countCars = 0;
//        int countTrucks = 0;
//        double sumCarsHP = 0;
//        double sumTrucksHP = 0;
//        double averageCarsHP = 0.0;
//        double averageTrucksHP = 0.0;

//        for (Catalogue vehicle : catalogue) {
//            if (vehicle.getType().equals("car")) {
//                //countCars++;
//                sumCarsHP += vehicle.getHorsepower();
//            } else {
//                //countTrucks++;
//                sumTrucksHP += vehicle.getHorsepower();
//            }
//        }
        averageCarsHP = sumCarsHP / (double) countCars;
        averageTrucksHP = sumTrucksHP / (double) countTrucks;
        if (countCars > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHP);
        } else {
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        }

        if (countTrucks > 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucksHP);
        } else {
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        }


    }

}
