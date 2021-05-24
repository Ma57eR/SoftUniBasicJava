import java.util.Scanner;

public class PremExcercise {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        double pagePrice = Double.parseDouble(scan.nextLine());
//        double koricaPrice = Double.parseDouble(scan.nextLine());
//        int discountPercent = Integer.parseInt(scan.nextLine());
//        double designer = Double.parseDouble(scan.nextLine());
//        int teamPercent = Integer.parseInt(scan.nextLine());
//        int pages = 899;
//        double knigaPrice = ((pages * pagePrice) + 2 * koricaPrice) * (100 - discountPercent) / 100;
//
//
//        System.out.printf("Avtonom should pay %.2f BGN.", (knigaPrice + designer) * (100 - teamPercent) / 100);


        //2

//        Scanner scan = new Scanner(System.in);
//        double shirochina = Double.parseDouble(scan.nextLine()) * 100;
//        double duljina = Double.parseDouble(scan.nextLine()) * 100;
//        double visochina = Double.parseDouble(scan.nextLine()) * 100;
//        double srednaVisochina = Double.parseDouble(scan.nextLine()) * 100;
//
//
//        double obemKorab = shirochina * duljina * visochina;
//        double visochinaStaq = srednaVisochina + 40;
//        double staq = 200 * 200 * visochinaStaq;
//        double mqsto = Math.floor(obemKorab / staq);
//
//
//        if (mqsto >= 3 && mqsto <= 10) {
//            System.out.printf("The spacecraft holds %.0f astronauts.", mqsto);
//        } else if (mqsto < 3) {
//            System.out.println("The spacecraft is too small.");
//        } else {
//            System.out.println("The spacecraft is too big.");
//        }

        //3

//        Scanner scan = new Scanner(System.in);
//        String sladkish = scan.nextLine();
//        double price = 0;
//        int poruchki = Integer.parseInt(scan.nextLine());
//        int den = Integer.parseInt(scan.nextLine());
//        double finalPrice = 0;
//        int discount = 0;
//
//        switch (sladkish) {
//            case "Cake":
//                if (den <= 15) {
//                    price = 24;
//                } else {
//                    price = 28.70;
//                }
//                break;
//            case "Souffle":
//                if (den <= 15) {
//                    price = 6.66;
//                } else {
//                    price = 9.80;
//                }
//                break;
//
//            case "Baklava":
//                if (den <= 15) {
//                    price = 12.60;
//                } else {
//                    price = 16.98;
//                }
//                break;
//        }
//        if (den <= 22) {
//            finalPrice = poruchki * price;
//            if (finalPrice > 200) {
//                finalPrice *= 0.75;
//            }else if (finalPrice >= 100 && finalPrice <= 200) {
//                finalPrice *=0.85;
//            }
//
////            if (den <= 15) {
////                finalPrice *= 0.9;
////            }
//
//        } else finalPrice = price * poruchki;
//            if (den <= 15) {
//            finalPrice *= 0.9;
//        }
//
//        System.out.printf("%.2f",finalPrice);

        //4
//        Scanner scan = new Scanner(System.in);
//        double kgFood = 12.45;
//        //double hundredGrFood = kgFood / 10;
//        int cats = Integer.parseInt(scan.nextLine());
//        //double eatenFood = Double.parseDouble(scan.nextLine());
//        double totalEaten = 0;
//        double finalPrice = 0;
//        int group1 = 0;
//        int group2 = 0;
//        int group3 = 0;
//
//        for (int i = 1; i <= cats; i++) {
//            double eatenFood = Double.parseDouble(scan.nextLine());
//            totalEaten += eatenFood;
//            if (eatenFood >= 100 && eatenFood < 200) {
//                group1++;
//            } else if (eatenFood >= 200 && eatenFood < 300) {
//                group2++;
//            } else if (eatenFood >= 300 && eatenFood < 400) {
//                group3++;
//            }
//
//        }
//        finalPrice = (totalEaten / 1000) * kgFood;
//
//        System.out.printf("Group 1: %d cats.%n", group1);
//        System.out.printf("Group 2: %d cats.%n", group2);
//        System.out.printf("Group 3: %d cats.%n", group3);
//        System.out.printf("Price for food per day: %.2f lv.", finalPrice);

        //5

//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        int adults = 0;
//        int kids = 0;
//        int toysMoney = 0;
//        int sweatMoney = 0;
//
//        while (!input.equals("Christmas")) {
//            int age = Integer.parseInt(input);
//
//            if (age <= 16) {
//                kids++;
//                toysMoney += 5;
//            } else {
//                adults++;
//                sweatMoney += 15;
//            }
//
//
//            input = scan.nextLine();
//        }
//
//        System.out.printf("Number of adults: %d%n", adults);
//        System.out.printf("Number of kids: %d%n", kids);
//        System.out.printf("Money for toys: %d%n", toysMoney);
//        System.out.printf("Money for sweaters: %d", sweatMoney);

        //6

        Scanner scan = new Scanner(System.in);

        int locations = Integer.parseInt(scan.nextLine());
        int averageGold = 0;
        int daysPerLocation = 0;
        double dailyGold = 0;
        double totalGoldPerLocation = 0;
        double realAveragePerDay = 0;


        for (int i = 1; i <= locations; i++) {

            averageGold = Integer.parseInt(scan.nextLine());
            daysPerLocation = Integer.parseInt(scan.nextLine());


            for (int j = 1; j <= daysPerLocation; j++) {
                dailyGold = Double.parseDouble(scan.nextLine());
               totalGoldPerLocation += dailyGold;

            }
            realAveragePerDay = totalGoldPerLocation / daysPerLocation;
            if (realAveragePerDay >= averageGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", realAveragePerDay);
            } else {
                System.out.printf("You need %.2f gold.%n", averageGold - realAveragePerDay);
            }

            totalGoldPerLocation =0;
        }



    }
}
