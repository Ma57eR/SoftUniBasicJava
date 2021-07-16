package Fundamentals.Objects.Objects2.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfCars = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numOfCars; i++) {
            String[] tokens = scan.nextLine().split(" ");

            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double t1Pressure = Double.parseDouble(tokens[5]);
            int t1Age = Integer.parseInt(tokens[6]);
            double t2Pressure = Double.parseDouble(tokens[7]);
            int t2Age = Integer.parseInt(tokens[8]);
            double t3Pressure = Double.parseDouble(tokens[9]);
            int t3Age = Integer.parseInt(tokens[10]);
            double t4Pressure = Double.parseDouble(tokens[11]);
            int t4Age = Integer.parseInt(tokens[12]);

            Engine currentEngine = new Engine(engineSpeed, enginePower);
            Cargo currentCargo = new Cargo(cargoWeight, cargoType);
            Tires currentTires = new Tires(t1Pressure, t1Age, t2Pressure,t2Age, t3Pressure, t3Age, t4Pressure, t4Age);
            Car currentCar = new Car(model, currentEngine, currentCargo, currentTires);
            cars.add(currentCar);
        }
        String command = scan.nextLine();

                for (Car car : cars) {
                    if (car.getCargo().getCargoType().equals(command)) {
                        if (car.getTires().getTirePressure1() < 1 || car.getTires().getTirePressure2() < 1 || car.getTires().getTirePressure3() < 1 || car.getTires().getTirePressure4() < 1) {
                            System.out.println(car.printFragile());
                        }
                    }
                    if (car.getCargo().getCargoType().equals(command) && car.getEngine().getEnginePower() > 250) {
                        System.out.println(car.printFlamable());
                    }
                }


    }

}
