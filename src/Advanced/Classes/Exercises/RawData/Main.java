package Advanced.Classes.Exercises.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Car> carPark = new LinkedList<>();

        while (n-- > 0) {
            addCarInfo(scan, carPark);
        }

        String cargoType = scan.nextLine();
        for (Car car : carPark) {
            switch (cargoType) {
                case "fragile":
                    if (car.getCargo().getCargoType().equals(cargoType)) {
                        if (car.getTires().getTirePressure1() < 1
                                || car.getTires().getTirePressure2() < 1
                                || car.getTires().getTirePressure3() < 1
                                || car.getTires().getTirePressure4() < 1) {
                            System.out.println(car.getModel());
                        }
                    }
                    break;

                case "flamable":
                    if (car.getCargo().getCargoType().equals(cargoType) && car.getEngine().getEnginePower() > 250) {
                        System.out.println(car.getModel());
                    }
                    break;
            }
        }


    }

    private static void addCarInfo(Scanner scan, List<Car> carPark) {
        String[] token = scan.nextLine().split("\\s+");
        String model = token[0];

        //1. Engine Speed, 2. Engine Power
        Engine currentEngine = new Engine(Integer.parseInt(token[1]), Integer.parseInt(token[2]));

        //3. Cargo weight, 4. Cargo type
        Cargo currentCargo = new Cargo(Integer.parseInt(token[3]), token[4]);

        Tires currentTires = new Tires(Double.parseDouble(token[5]), Double.parseDouble(token[7]), Double.parseDouble(token[9]), Double.parseDouble(token[11])
                , Integer.parseInt(token[6]), Integer.parseInt(token[8]), Integer.parseInt(token[10]), Integer.parseInt(token[12]));

        Car currentCar = new Car(model, currentEngine, currentCargo, currentTires);

        carPark.add(currentCar);
    }
}
