package Fundamentals.Objects.Objects2.SalesMan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfEngines = Integer.parseInt(scan.nextLine());
        List<Engine> engines = new ArrayList<>();

        for (int i = 0; i < numOfEngines; i++) {
            String displacement = "n/a";
            String efficiency = "n/a";
            String[] input = scan.nextLine().split(" ");
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            if (input.length > 2) {
                //Проверяваме дали е тегло на двигателя или цвят
                if (input[2].charAt(0) >= 48 && input[2].charAt(0) <= 57) {
                    displacement = input[2];
                }
            }
            if ((input[input.length-1].charAt(0) <= 48 || input[input.length-1].charAt(0) >= 57) && input.length>2) {
                efficiency = input[input.length-1];
            }
            Engine currentEngine = new Engine(model, power, displacement, efficiency);
            engines.add(currentEngine);
        }

        int numOfCars = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numOfCars; i++) {
            String weight = "n/a";
            String color = "n/a";
            String[] input = scan.nextLine().split(" ");
            String model = input[0];
            String engine = input[1];
            //Проверяваме дали имаме зададен параметър
            if (input.length>2) {
                //Проверяваме дали е тегло на двигателя или цвят
                if (input[2].charAt(0) >= 48 && input[2].charAt(0) <= 57) {
                    weight = input[2];
                }
            }
            //Ако 3тата стойност не е била теглото на двигателя и имаме 3та стойност
            if ((input[input.length-1].charAt(0) <= 48 || input[input.length-1].charAt(0) >= 57) && input.length>2) {
            color = input[input.length-1];
            }
            Car currentCar = new Car(model, engine, weight, color);
            cars.add(currentCar);
        }

        for (Car car : cars) {
            System.out.println(car.getModel() + ":");
            String currentEngine = car.getEngine();
            for (Engine engine : engines) {
                if (currentEngine.equals(engine.getModel())) {
                    System.out.printf("  %s:%n    Power: %s%n    Displacement: %s%n    Efficiency: %s%n",engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency());
                }
            }
            System.out.println("  Weight: " + car.getWeight());
            System.out.println("  Color: " + car.getColor());
        }

    }
}
