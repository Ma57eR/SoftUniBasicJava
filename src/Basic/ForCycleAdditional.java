package Basic;

import java.util.Scanner;

public class ForCycleAdditional {
    public static void main(String[] args) {

        //01. Back To The Past

//        Scanner scan = new Scanner(System.in);
//
//        double money = Double.parseDouble(scan.nextLine());
//        int endYear = Integer.parseInt(scan.nextLine());
//        int thisYear = 1800;
//        int years = 18;
//        double costToLive = 0;
//        double totalCostToLive = 0;
//        double yearCosts = 12000;
//
//        for (int i = 0; thisYear <= endYear; thisYear++) {
//            if (thisYear % 2 != 0) {
//                yearCosts = yearCosts + (years * 50);
//
//            } else {
//                yearCosts = 12000;
//            }
//
//            money -= yearCosts;
//            years += 1;
//
//        }
//
//        if (money >= 0) {
//            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
//        } else {
//            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
//        }

        //02. Hospital
//
//        Scanner scan = new Scanner(System.in);
//        int days = Integer.parseInt(scan.nextLine());
//        int patiences = 0;
//        int doctors = 7;
//        int treatedPatiences = 0;
//        int untratedPatiences = 0;
//        int totalUntreated = 0;
//
//        for (int i = 1; i <= days; i++) {
//            if (i % 3 == 0 && totalUntreated > treatedPatiences) {
//                doctors += 1;
//            }
//            patiences = Integer.parseInt(scan.nextLine());
//            if (patiences > doctors) {
//                totalUntreated += patiences - doctors;
//                untratedPatiences = patiences - doctors;
//            }
//                treatedPatiences += patiences - untratedPatiences;
//                untratedPatiences =0;
//
//
//        }
//        System.out.printf("Treated patients: %d.%n", treatedPatiences);
//        System.out.printf("Untreated patients: %d.", totalUntreated);


        //09. Clock

//        int hours = 0;
//        int minutes = 0;
//        int seconds = 0;
//
//        for (hours = 0; hours <= 23; hours++) {
//
//            for (minutes = 0; minutes <= 59; minutes++) {
//
//                for (seconds = 0; seconds <= 59; seconds++) {
//                    System.out.printf("%d : %d : %d%n", hours, minutes, seconds);
//                }
//            }
//        }




    }
}
