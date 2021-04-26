package FundamentalsBasic2;

import java.util.Scanner;

public class FundamentalsBacis2 {
    public static void main(String[] args) {

        //1.	Ages

//        Scanner scan = new Scanner(System.in);
//
//        int age = Integer.parseInt(scan.nextLine());
//
//        if (age >= 0 && age <= 2) {
//            System.out.println("baby");
//        } else if (age >= 3 && age <= 13) {
//            System.out.println("child");
//        } else if (age >= 14 && age <= 19) {
//            System.out.println("teenager");
//        } else if (age >= 20 && age <= 65) {
//            System.out.println("adult");
//        } else if (age >= 66) {
//            System.out.println("elder");
//        }

        //2.	Division

//        Scanner scan = new Scanner(System.in);
//        int num = Integer.parseInt(scan.nextLine());
//        int max =0;
//
//        if (num % 2 == 0) {
//            max = 2;
//        } if (num % 3 == 0) {
//            max = 3;
//        } if (num % 6 == 0) {
//            max = 6;
//        } if (num % 7 == 0) {
//            max = 7;
//        } if (num % 10 == 0) {
//            max = 10;
//        }
//        if (max != 0) {
//            System.out.printf("The number is divisible by %d", max);
//        } else {
//            System.out.println("Not divisible");
//        }

        //3.	Vacation

//        Scanner scan = new Scanner(System.in);
//        int numOfGuests = Integer.parseInt(scan.nextLine());
//        String guestType = scan.nextLine();
//        String day = scan.nextLine();
//        double singlePrice = 0;
//        double totalPrice =0;
//
//        switch (guestType) {
//            case "Students":
//                switch (day) {
//                    case "Friday":
//                        singlePrice = 8.45;
//                        break;
//                    case "Saturday":
//                        singlePrice = 9.80;
//                        break;
//                    case "Sunday":
//                        singlePrice = 10.46;
//                        break;
//                }
//                break;
//            case "Business":
//                switch (day) {
//                    case "Friday":
//                        singlePrice = 10.90;
//                        break;
//                    case "Saturday":
//                        singlePrice = 15.60;
//                        break;
//                    case "Sunday":
//                        singlePrice = 16;
//                        break;
//                }
//                break;
//            case "Regular":
//                switch (day) {
//                    case "Friday":
//                        singlePrice = 15;
//                        break;
//                    case "Saturday":
//                        singlePrice = 20;
//                        break;
//                    case "Sunday":
//                        singlePrice = 22.50;
//                        break;
//                }
//        }
//        if (guestType.equals("Students")) {
//            if (numOfGuests >= 30) {
//                totalPrice = (numOfGuests * singlePrice) * 0.85;
//            } else {
//                totalPrice = numOfGuests * singlePrice;
//            }
//        } else if (guestType.equals("Business")) {
//            if (numOfGuests >= 100) {
//                totalPrice = (numOfGuests - 10) * singlePrice;
//            } else {
//                totalPrice = numOfGuests * singlePrice;
//            }
//        } else if (guestType.equals("Regular")) {
//            if (numOfGuests >= 10 && numOfGuests <= 20) {
//                totalPrice = (numOfGuests * singlePrice) * 0.95;
//            } else {
//                totalPrice = numOfGuests * singlePrice;
//            }
//        }
//
//        System.out.printf("Total price: %.2f", totalPrice);


        //4.	Print and Sum

        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.printf("%nSum: %d", sum);



    }

}
