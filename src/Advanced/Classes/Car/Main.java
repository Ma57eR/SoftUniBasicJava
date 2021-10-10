package Advanced.Classes.Car;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car car = new Car();

        car.setBrand("Chevrolet");
        car.setModel("Impala");
        car.setHorsePower(390);

        System.out.printf("This car is %s %s - %d HP%n",
                car.getBrand(), car.getModel(), car.getHorsePower()
                );

    }
}
