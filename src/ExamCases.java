import java.util.Scanner;

public class ExamCases {
    public static void main(String[] args) {

//        //01. Change Bureau
//
//        Scanner scan = new Scanner(System.in);
//        double bitcoin = Double.parseDouble(scan.nextLine());
//        double yuan = Double.parseDouble(scan.nextLine());
//        double bitcoinRate = bitcoin * 1168;
//        double yuanRate = yuan * 0.15 * 1.76;
//        double allBgn = bitcoinRate + yuanRate;
//        double commission = 1 - (Double.parseDouble(scan.nextLine())/100);
//        double finalAmount = allBgn * commission / 1.95;
//
//        System.out.printf("%.2f", finalAmount);


        //01. Supplies for School

//        Scanner scan = new Scanner(System.in);
//
//        int pens = Integer.parseInt(scan.nextLine());
//        int markers = Integer.parseInt(scan.nextLine());
//        double preparat = Double.parseDouble(scan.nextLine());
//        double discount = Double.parseDouble(scan.nextLine())/100;
//
//        double penPrice = 5.8;
//        double markersPrice = 7.20;
//        double preparatPrice =  1.2;
//
//        double totalPrice = penPrice * pens + markers * markersPrice + preparat * preparatPrice;
//        System.out.printf("%.3f", totalPrice * (1 - discount));


        //02. Cat Walking

//        Scanner scan = new Scanner(System.in);
//        int minutesPerWalk = Integer.parseInt(scan.nextLine());
//        int walks = Integer.parseInt(scan.nextLine());
//        int caloriesPerDay = Integer.parseInt(scan.nextLine());
//
//        int burnedCalories = minutesPerWalk * walks * 5;
//
//        if ((double) burnedCalories / (double) caloriesPerDay < 0.5) {
//            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
//        } else {
//            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
//        }


        //02. Mountain Run

//        Scanner scan = new Scanner(System.in);
//
//        double recordInSeconds = Double.parseDouble(scan.nextLine());
//        double range = Double.parseDouble(scan.nextLine());
//        double metersPerSecond = Double.parseDouble(scan.nextLine());
//
//        double slowing = Math.floor((range / 50)) * 30;
//
//        if (recordInSeconds > range * metersPerSecond + slowing) {
//            System.out.printf("Yes! The new record is %.2f seconds.", range * metersPerSecond + slowing);
//        } else {
//            System.out.printf("No! He was %.2f seconds slower.", (range * metersPerSecond + slowing) - recordInSeconds);
//        }

        //03. Energy Booster

//        Scanner scan = new Scanner(System.in);
//
//        String fruit = scan.nextLine();
//        String size = scan.nextLine();
//        int count = Integer.parseInt(scan.nextLine());
//        double price = 0;
//        int small = 2;
//        int big = 5;
//
//        switch (fruit) {
//            case "Watermelon":
//                if (size.equals("small")) {
//                    price = 56 * small;
//                } else {
//                    price = 28.70 * big;
//                }
//                break;
//
//            case "Mango":
//                if (size.equals("small")) {
//                    price = 36.66 * small;
//                } else {
//                    price = 19.60 * big;
//                }
//                break;
//
//            case "Pineapple":
//                if (size.equals("small")) {
//                    price = 42.10 * small;
//                } else {
//                    price = 24.80 * big;
//                }
//                break;
//
//            case "Raspberry":
//                if (size.equals("small")) {
//                    price = 20 * small;
//                } else {
//                    price = 15.20 * big;
//                }
//                break;
//            default:
//                System.out.println("error");
//        }
//        double totalPrice = price * count;
//        double discount = 1;
//        if (totalPrice >= 400 && totalPrice <= 1000) {
//            discount = discount - 0.15;
//        } else if (totalPrice > 1000) {
//            discount = discount - 0.5;
//        }
//
//        System.out.printf("%.2f lv.", totalPrice * discount);

        //04. Food for Pets

//        Scanner scan = new Scanner(System.in);
//
//        int days = Integer.parseInt(scan.nextLine());
//        double totalFood = Double.parseDouble(scan.nextLine());
//        int dogFood = 0;
//        int catFood = 0;
//        double biscuits = 0;
//        int dailyFood = 0;
//        double totalDogFood = 0;
//        double totalCatFood = 0;
//
//        for (int i = 1; i <= days; i++) {
//
//
//                dogFood = Integer.parseInt(scan.nextLine());
//                totalDogFood += dogFood;
//
//
//                catFood = Integer.parseInt(scan.nextLine());
//                totalCatFood += catFood;
//
//            if (i % 3 == 0) {
//               biscuits += (dogFood + catFood) * 0.1;
//            }
//        }
//
//        double totalFoodEaten = ((totalCatFood + totalDogFood) / totalFood) * 100;
//        double totalDogEaten = (totalDogFood / (totalCatFood + totalDogFood)) * 100;
//        double totalCatEaten = (totalCatFood /(totalCatFood + totalDogFood)) * 100;
//
//
//
//        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
//        System.out.printf("%.2f%% of the food has been eaten.%n", totalFoodEaten);
//        System.out.printf("%.2f%% eaten from the dog.%n", totalDogEaten);
//        System.out.printf("%.2f%% eaten from the cat.", totalCatEaten);

        //04. Trekking Mania

//        Scanner scan = new Scanner(System.in);
//        int groups = Integer.parseInt(scan.nextLine());
//        int members = 0;
//        int totalmembers = 0;
//        String where = null;
//        double musala =0;
//        double monblan =0;
//        double kilimanjaro =0;
//        double k2 =0;
//        double everest = 0;
//
//        for (int i = 0; i < groups; i++) {
//
//            members = Integer.parseInt(scan.nextLine());
//            totalmembers += members;
//
//            if (members <= 5) {
//                musala += members;
//            } else if (members > 5 && members <= 12) {
//                monblan += members;
//            } else if (members > 12 && members <= 25) {
//                kilimanjaro += members;
//            } else if (members > 25 && members <= 40) {
//                k2 += members;
//            } else if (members > 40) {
//                everest += members;
//            }
//        }
//
//        System.out.printf("%.2f%%%n", (musala / totalmembers) * 100);
//        System.out.printf("%.2f%%%n", (monblan / totalmembers) * 100);
//        System.out.printf("%.2f%%%n", (kilimanjaro / totalmembers) * 100);
//        System.out.printf("%.2f%%%n", (k2 / totalmembers) * 100);
//        System.out.printf("%.2f%%%n", (everest / totalmembers) * 100);

    }

}
