package FundamentalsSecond.Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfWagons = Integer.parseInt(scan.nextLine());
        int[] wagons = new int[numOfWagons];

        for (int n = 0; n < numOfWagons; n++) {
            int numOfPeople = Integer.parseInt(scan.nextLine());
            wagons[n] = numOfPeople;
        }
        int totalPeople = 0;
        for (int i = 0; i < wagons.length; i++) {
            totalPeople += wagons[i];
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(totalPeople);
    }
}
