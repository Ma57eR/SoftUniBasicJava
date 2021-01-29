import java.util.Scanner;

public class AdvancedChecksExercise {

    public static void main(String[] args) {


        //1st case

//        Scanner scan = new Scanner(System.in);
//
//        String typeProjection = scan.nextLine();
//        int rows = Integer.parseInt(scan.nextLine());
//        int columns = Integer.parseInt(scan.nextLine());
//
//        switch (typeProjection) {
//            case "Premiere":
//                System.out.printf("%.2f leva", rows  * columns * 12.00);
//                break;
//            case "Normal":
//                System.out.printf("%.2f leva", rows * columns * 7.50);
//                break;
//            case "Discount":
//                System.out.printf("%.2f leva", rows * columns * 5.00);
//                break;
//            default:
//                System.out.println("error");
//        }


        //2nd case
//
//        Scanner scan = new Scanner(System.in);
//
//        int temp = Integer.parseInt(scan.nextLine());
//        String time = scan.nextLine();
//        String outfit;
//        String shoes;
//
//        switch (time) {
//            case "Morning":
//                if (temp <= 18 && temp >= 10) {
//                    outfit = "Sweatshirt";
//                    shoes = "Sneakers";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//
//                } else if (temp <= 24) {
//                    outfit = "Shirt";
//                    shoes = "Moccasins";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//                } else if (temp >= 25) {
//                    outfit = "T-Shirt";
//                    shoes = "Sandals";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//                }
//               break;
//
//            case "Afternoon":
//                if (temp <= 18 && temp >= 10) {
//                    outfit = "Shirt";
//                    shoes = "Moccasins";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//
//                } else if (temp <= 24) {
//                    outfit = "T-Shirt";
//                    shoes = "Sandals";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//                } else if (temp >= 25) {
//                    outfit = "Swim Suit";
//                    shoes = "Barefoot";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//                }
//                break;
//
//            case "Evening":
//                if (temp <= 18 && temp >= 10) {
//                    outfit = "Shirt";
//                    shoes = "Moccasins";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//
//                } else if (temp <= 24) {
//                    outfit = "Shirt";
//                    shoes = "Moccasins";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//                } else if (temp >= 25) {
//                    outfit = "Shirt";
//                    shoes = "Moccasins";
//                    System.out.printf("It's %s degrees, get your %s and %s.", temp, outfit, shoes);
//                }
//                break;
//            default:
//                System.out.println("Error");
//
//                }


        //3rd case "New Home"

//        Scanner scan = new Scanner(System.in);
//
//        String flowerType = scan.nextLine();
//        int numberFlowers = Integer.parseInt(scan.nextLine());
//        int budget = Integer.parseInt(scan.nextLine());
//        double totalAmount = 0;
//        double discount = 0;
//
//        switch (flowerType) {
//            case "Roses":
//                if (numberFlowers > 80) {
//                    discount = 1 - 0.1;
//                    totalAmount = numberFlowers * 5.0 * discount;
//                } else {
//                    totalAmount = numberFlowers * 5.0;
//                }
//                break;
//            case "Dahlias":
//                if (numberFlowers > 90) {
//                    discount = 1 - 0.15;
//                    totalAmount = numberFlowers * 3.80 * discount;
//                } else {
//                    totalAmount = numberFlowers * 3.80;
//                }
//                break;
//            case "Tulips":
//                if (numberFlowers > 80) {
//                    discount = 1 - 0.15;
//                    totalAmount = numberFlowers * 2.80 * discount;
//                } else {
//                    totalAmount = numberFlowers * 2.80;
//                }
//                break;
//            case "Narcissus":
//                if (numberFlowers < 120) {
//                    discount = 1 + 0.15;
//                    totalAmount = numberFlowers * 3.0 * discount;
//                } else {
//                    totalAmount = numberFlowers * 3.0;
//                }
//                break;
//            case "Gladiolus":
//                if (numberFlowers < 80) {
//                    discount = 1 + 0.2;
//                    totalAmount = numberFlowers * 2.50 * discount;
//                } else {
//                    totalAmount = numberFlowers * 2.50;
//                }
//                break;
//            default:
//                System.out.println("error");
//        }
//        if (budget >= totalAmount) {
//            System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left.", numberFlowers, flowerType, budget - totalAmount);
//        } else {
//            System.out.printf("Not enough money, you need %.2f leva more.", totalAmount - budget);
//        }


        //4th case Boat for fishing

//        Scanner scan = new Scanner(System.in);
//
//        int budget = Integer.parseInt(scan.nextLine());
//        String season = scan.nextLine();
//        int fisherman = Integer.parseInt(scan.nextLine());
//        double rent = 0;
//        double discount = 0;
//        boolean evenFisherman = fisherman % 2 == 0;
//
//
//
//        switch (season) {
//            case "Spring":
//                if (fisherman <= 6) {
//                    rent = 3000 * (1 - 0.10);
//                } else if (fisherman >= 7 && fisherman <= 11) {
//                    rent = 3000 * (1-0.15);
//                } else if (fisherman >= 12) {
//                    rent = 3000 * (1-0.25);
//                }else {
//                    rent = 3000;
//                }
//                break;
//
//            case "Summer":
//            case "Autumn":
//                if (fisherman <= 6) {
//                    rent = 4200 * (1 - 0.10);
//                } else if (fisherman >= 7 && fisherman <= 11) {
//                    rent = 4200 * (1-0.15);
//                } else if (fisherman >= 12) {
//                    rent = 4200 * (1-0.25);
//                }else {
//                    rent = 4200;
//                }
//                break;
//            case "Winter":
//                if (fisherman <= 6) {
//                    rent = 2600 * (1 - 0.10);
//                } else if (fisherman >= 7 && fisherman <= 11) {
//                    rent = 2600 * (1-0.15);
//                } else if (fisherman >= 12) {
//                    rent = 2600 * (1-0.25);
//                }else {
//                    rent = 2600;
//                }
//                break;
//        }
//        if (!"Autumn".equals(season) && evenFisherman) {
//            rent = rent * 0.95;
//        }
//        if (budget >= rent) {
//            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
//        } else {
//            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
//        }

        //5th case Holiday


        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination;
        double cost = 0.0;
        String type = null;

        if (budget <= 100) {
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            destination = "Balkans";
        } else {
            destination = "Europe";
        }

        switch (destination) {
            case "Bulgaria":
                if (season.equals("summer")) {
                    cost = budget * 0.30;
                    type = "Camp";
                } else if (season.equals("winter")) {
                    cost = budget * 0.70;
                    type = "Hotel";
                }
                break;
            case "Balkans":
                if (season.equals("summer")) {
                    cost = budget * 0.40;
                    type = "Camp";
                } else if (season.equals("winter")) {
                    cost = budget * 0.80;
                    type = "Hotel";
                }
                break;
            case "Europe":
                cost = budget * 0.90;
                type = "Hotel";
                break;
            default:
                System.out.println("error");
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, cost);



    }
}
