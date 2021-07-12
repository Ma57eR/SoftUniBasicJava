package Exams.July2021;

import java.util.Scanner;

public class Cooking1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine()); //1
        int students = Integer.parseInt(scan.nextLine()); //2
        double flourPrice = Double.parseDouble(scan.nextLine()); //3
        double eggPrice = Double.parseDouble(scan.nextLine()); //4
        double apronPrice = Double.parseDouble(scan.nextLine()); //5
        double totalApron = Math.ceil(students * 1.20);
        int freeFlour = students / 5;
        double totalFlour = 0;

        double finalFlour = ((students - freeFlour) * flourPrice);
        double finalEgg = students * (eggPrice * 10);
        double finalApron = apronPrice * Math.ceil(students * 1.20);

        double total = finalApron + finalEgg + finalFlour;

        if (budget < total) {
            System.out.printf("%.2f$ more needed.", total - budget);
        } else {
            System.out.printf("Items purchased for %.2f$.", total);
        }

    }
}
