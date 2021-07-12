package Exams.Old;

import java.util.Scanner;

public class July2020 {
    public static void main(String[] args) {



    //02. Add Bags

//    Scanner scan = new Scanner(System.in);
//
//    double additionalBaggagePrice = Double.parseDouble(scan.nextLine());
//    double kgBaggage = Double.parseDouble(scan.nextLine());
//    double baggageOver = kgBaggage - 20;
//    int daysToTravel = Integer.parseInt(scan.nextLine());
//    int numberOfBaggages = Integer.parseInt(scan.nextLine());
//    double overPrice = 0;
//    double daysPrice = 0;
//
//
//        if (kgBaggage < 10) {
//            overPrice = (additionalBaggagePrice / numberOfBaggages) * 1.2;
//        } else if (kgBaggage >= 10 && kgBaggage <= 20) {
//            overPrice = (additionalBaggagePrice) * 0.5;
//        }
//        else {
//            overPrice =additionalBaggagePrice;
//        }
//
//        if (daysToTravel > 30) {
//            overPrice += overPrice * 0.1;
//        } else if (daysToTravel >= 7 && daysToTravel <= 30) {
//            overPrice += overPrice * 0.15;
//        } else {
//            overPrice += overPrice * 0.4;
//        }
//        overPrice = overPrice * numberOfBaggages;
//
//        System.out.printf("The total price of bags is: %.2f lv.", overPrice);

        //03. Aluminum Joinery

//        Scanner scan = new Scanner(System.in);
//
//        int numberDograma = Integer.parseInt(scan.nextLine());
//        String type = scan.nextLine();
//        String shippingType = scan.nextLine();
//        double price = 0;
//
//        if (numberDograma < 10) {
//            System.out.println("Invalid order");
//        } else {
//
//        switch (type) {
//            case "90X130":
//                price = 110;
//                if (numberDograma> 30 && numberDograma <= 60) {
//                    price *= 0.95;
//                } else if (numberDograma> 60) {
//                    price *= 0.92;
//                }
//                break;
//            case "100X150":
//                price = 140;
//                if (numberDograma> 30 && numberDograma <= 60) {
//                    price *= 0.94;
//                } else if (numberDograma> 60) {
//                    price *= 0.90;
//                }
//                break;
//            case "130X180":
//                price = 190;
//                if (numberDograma> 30 && numberDograma <= 60) {
//                    price *= 0.93;
//                } else if (numberDograma> 60) {
//                    price *= 0.88;
//                }
//                break;
//            case "200X300":
//                price = 250;
//                if (numberDograma> 30 && numberDograma <= 60) {
//                    price *= 0.91;
//                } else if (numberDograma> 60) {
//                    price *= 0.86;
//                }
//                break;
//
//        }
//        }
//        price = price * numberDograma;
//
//        if (shippingType.equals("With delivery")) {
//            price += 60;
//        }
//        if (numberDograma > 99) {
//            price *= 0.96;
//        }
//        if (numberDograma > 10) {
//
//        System.out.printf("%.2f BGN", price);
//
//        }

        //04. Balls

//        Scanner scan = new Scanner(System.in);
//        int count = Integer.parseInt(scan.nextLine());
//        String colour = scan.nextLine();
//        int totalPoints = 0;
//        int redPoints = 0;
//        int orangePoints = 0;
//        int yellowPoints = 0;
//        int whitePoints = 0;
//        int blackPoints = 0;
//        int otherPoints =0;
//
//
//        for (int i = 1; i <= count; i++) {
//            switch (colour) {
//                case "red":
//                    totalPoints += 5;
//                    redPoints += 1;
//                    break;
//
//                case "orange":
//                    totalPoints += 10;
//                    orangePoints += 1;
//                    break;
//
//                case "yellow":
//                    totalPoints += 15;
//                    yellowPoints += 1;
//                    break;
//
//                case "white":
//                    totalPoints += 20;
//                    whitePoints += 1;
//                    break;
//
//                case "black":
//                    totalPoints /= 2;
//                    blackPoints += 1;
//                    break;
//                default:
//                    otherPoints += 1;
//            }
//            if (i == count) {
//                break;
//            } else {
//
//
//            colour = scan.nextLine();
//            }
//        }
//
//        System.out.printf("Total points: %d%n", totalPoints);
//        System.out.printf("Points from red balls: %d%n", redPoints);
//        System.out.printf("Points from orange balls: %d%n", orangePoints);
//        System.out.printf("Points from yellow balls: %d%n", yellowPoints);
//        System.out.printf("Points from white balls: %d%n", whitePoints);
//        System.out.printf("Other colors picked: %d%n", otherPoints);
//        System.out.printf("Divides from black balls: %d", blackPoints);


        Scanner scan = new Scanner(System.in);
        String player = scan.nextLine();
        int goals = Integer.parseInt(scan.nextLine());;
        String bestPlayer = null;
        int totalGoals = 0;
        boolean flag = false;
        int max = 0;

        while (!player.equals("END")) {
            //totalGoals += goals;

            if (goals > max) {
                max = goals;
                bestPlayer = player;
            }
            if (goals < 10) {
                player = scan.nextLine();
            } else {
                break;
            }

            if (player.equals("END")) {
                break;
            }
            goals = Integer.parseInt(scan.nextLine());

        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (max > 2) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        } else {
            System.out.printf("He has scored %d goals.", max);
        }


    }
}
