package Fundamentals.ExamsPrep;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double vat = 1.20;
        double total = 0;
        double totalWithVat = total * vat;

        while (!input.equals("regular") && !input.equals("special")) {
            //if input is <0, print Invalid price
            // if total price is 0, print Invalid
            if (Double.parseDouble(input) < 0) {
                System.out.println("Invalid price!");
            } else {
            total += Double.parseDouble(input);
            }

            input = scan.nextLine();
        }
        totalWithVat = total * vat;
        //special client - 10% discount
        if (input.equals("special")) {
            totalWithVat = totalWithVat * 0.90;
        }
        if (total > 0) {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", total);
            System.out.printf("Taxes: %.2f$%n", total * 0.20);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalWithVat);
        } else {
            System.out.println("Invalid order!");
        }



    }
}
