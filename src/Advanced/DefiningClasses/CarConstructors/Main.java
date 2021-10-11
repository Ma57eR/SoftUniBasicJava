package Advanced.DefiningClasses.CarConstructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfCars = Integer.parseInt(scan.nextLine());
        String[] carData = scan.nextLine().split("\\s+");

        for (int i = 0; i < numOfCars; i++) {
            String currentBrand = null;
            String currentModel = null;
            int currentHorsePower = 0;
            if (carData.length == 1) {
                currentBrand = carData[0];
                Car car = new Car(currentBrand);
                System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(), car.getModel(), car.getHorsePower());
            } else  {
                currentBrand = carData[0];
                currentModel = carData[1];
                currentHorsePower = Integer.parseInt(carData[2]);
                Car car = new Car(currentBrand, currentModel, currentHorsePower);
                System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(), car.getModel(), car.getHorsePower());
            }

            carData = scan.nextLine().split("\\s+");
        }
    }
}
