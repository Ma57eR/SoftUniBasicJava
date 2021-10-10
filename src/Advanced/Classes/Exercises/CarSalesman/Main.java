package Advanced.Classes.Exercises.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numOfEngines = Integer.parseInt(scan.nextLine());
        List<Engine> engines = new ArrayList<>();
        List<Car> carModels = new ArrayList<>();
        for (int i = 0; i < numOfEngines; i++) {
            String[] engineData = scan.nextLine().split("\\s+");
            Engine currentEngine = null;
            if (engineData.length == 3) {
                //Ако е цифра, значи е Displacement
                if (engineData[2].charAt(0) > 47 && engineData[2].charAt(0) < 58) {
                    currentEngine = new Engine(engineData[0], Integer.parseInt(engineData[1]), engineData[2], "n/a");
                } else {
                    currentEngine = new Engine(engineData[0], Integer.parseInt(engineData[1]), "n/a",  engineData[2]);
                }

            } else if (engineData.length == 2) {
                currentEngine = new Engine(engineData[0], Integer.parseInt(engineData[1]), "n/a", "n/a");
            } else {
                currentEngine = new Engine(engineData[0], Integer.parseInt(engineData[1]), engineData[2], engineData[3]);
            }
            engines.add(currentEngine);
        }
        int numOfModels = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numOfModels; i++) {
            String[] modelData = scan.nextLine().split("\\s+");
            Car currentModel = null;
            if (modelData.length == 2) {
                currentModel = new Car(modelData[0], modelData[1], "n/a", "n/a");
            }
            else if (modelData.length == 3) {
                //Ако е цифра, значи е тегло
                if (modelData[2].charAt(0) > 47 && modelData[2].charAt(0) < 58) {
                    currentModel = new Car(modelData[0], modelData[1], modelData[2], "n/a");
                } else {
                    currentModel = new Car(modelData[0], modelData[1], "n/a", modelData[2]);
                }
            }
            else {
                currentModel = new Car(modelData[0], modelData[1], modelData[2], modelData[3]);
            }
            carModels.add(currentModel);
        }
        System.out.println();
        for (Car car : carModels) {
            System.out.println(car.getModel() +":");
            System.out.println(car.getEngine()+":");
            for (Engine engine : engines) {
                if (engine.getModel().equals(car.getEngine())) {
                    System.out.println("Power: " + engine.getPower());
                    System.out.println("Displacement: " + engine.getDisplacement());
                    System.out.println("Efficiency: " + engine.getEfficiency());
                    break;
                }
            }
            System.out.println("Weight: " + car.getWeight());
            System.out.println("Color: " + car.getColor());
        }

    }
}
