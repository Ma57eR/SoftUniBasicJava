package Fundamentals.Methods;

import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        totalPrice(product, quantity);

    }

    private static void totalPrice(String prod, int quantity) {
        double productPrice = 0;
        double totalPrice = 0;
        switch (prod) {
            case "coffee":
                productPrice = 1.50;
                break;
            case "water":
                productPrice = 1.00;
                break;
            case "coke":
                productPrice = 1.40;
                break;
            case "snacks":
                productPrice = 2.00;
                break;
        }
        totalPrice = productPrice * quantity;
        System.out.printf("%.2f",totalPrice);
    }

}
