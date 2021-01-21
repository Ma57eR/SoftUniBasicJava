import java.util.Scanner;

public class AdvancedChecks {
    public static void main(String[] args) {

        //1st case

//        Scanner scan = new Scanner(System.in);
//
//        int day = Integer.parseInt(scan.nextLine());
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            case 4:
//                System.out.println("Thursday");
//                break;
//
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6:
//                System.out.println("Saturday");
//                break;
//
//            case 7:
//                System.out.println("Sunday");
//                break;
//
//            default:
//                System.out.println("Error");
//        }


        //2nd Case

//        Scanner scan = new Scanner(System.in);
//        String day = scan.nextLine();
//
//        switch (day) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                System.out.println("Working day");
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Error");
//        }


        //3rd case

//        Scanner scan = new Scanner(System.in);
//
//        String animal = scan.nextLine();
//
//        switch (animal) {
//            case "dog":
//                System.out.println("mammal");
//                break;
//
//            case "crocodile":
//            case "tortoise":
//            case "snake":
//                System.out.println("reptile");
//                break;
//
//            default:
//                System.out.println("unknown");
//        }


        //4th case

//        Scanner scan = new Scanner(System.in);
//
//        double age = Double.parseDouble(scan.nextLine());
//        String sex = scan.nextLine();
//
//        switch (sex) {
//            case "m":
//                if (age >= 16) {
//                    System.out.println("Mr.");
//                } else {
//                    System.out.println("Master");
//                }
//                    break;
//
//            case "f":
//                if (age >= 16) {
//                    System.out.println("Ms.");
//                } else {
//                    System.out.println("Miss");
//                }
//                break;
//
//            default:
//                System.out.println("Error");
//        }


        //5th case

//        Scanner scan = new Scanner(System.in);
//
//        String product = scan.nextLine();
//        String city = scan.nextLine();
//        Double quantity = Double.parseDouble(scan.nextLine());
//        Double price = 0.0;
//
//        switch (city) {
//            case "Sofia":
//                if (product.equals("coffee")) {
//                    price = 0.50;
//                } else if (product.equals("water")) {
//                    price = 0.80;
//                } else if (product.equals("beer")) {
//                    price = 1.20;
//                } else if (product.equals("sweets")) {
//                    price = 1.45;
//                } else if (product.equals("peanuts")) {
//                    price = 1.60;
//                }
//
//                break;
//
//            case "Plovdiv":
//
//                if (product.equals("coffee")) {
//                    price = 0.40;
//                } else if (product.equals("water")) {
//                    price = 0.70;
//                } else if (product.equals("beer")) {
//                    price = 1.15;
//                } else if (product.equals("sweets")) {
//                    price = 1.30;
//                } else if (product.equals("peanuts")) {
//                    price = 1.50;
//                }
//
//                break;
//
//            case "Varna":
//
//                if (product.equals("coffee")) {
//                    price = 0.45;
//                } else if (product.equals("water")) {
//                    price = 0.70;
//                } else if (product.equals("beer")) {
//                    price = 1.10;
//                } else if (product.equals("sweets")) {
//                    price = 1.35;
//                } else if (product.equals("peanuts")) {
//                    price = 1.55;
//                }
//
//                break;
//            default:
//                System.out.println("Wrong town!");
//        }
//        System.out.println(price * quantity);


        //6th case

//        Scanner scan = new Scanner(System.in);
//
//        int num = Integer.parseInt(scan.nextLine());
//
//        if ((num >= -100 && num <= 100) && num != 0) {
//            System.out.println("Yes");
//
//        } else {
//            System.out.println("No");
//        }


        //7th case
//
//        Scanner scan = new Scanner(System.in);
//
//        int hour = Integer.parseInt(scan.nextLine());
//        String day = scan.nextLine();
//
//        switch (day) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//            case "Saturday":
//                if (hour >= 10 && hour <= 18) {
//                    System.out.println("open");
//                } else {
//                    System.out.println("closed");
//                }
//                break;
//            default:
//                System.out.println("closed");
//        }


        //8th case

//        Scanner scan = new Scanner(System.in);
//
//        String day = scan.nextLine();
//
//        switch (day) {
//            case "Monday":
//            case "Tuesday":
//            case "Friday":
//                System.out.println("12");
//                break;
//            case "Wednesday":
//            case "Thursday":
//                System.out.println("14");
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.println("16");
//                break;
//            default:
//                System.out.println("Избери ден от седмицата!");
//        }


        //9th case

//        Scanner scan = new Scanner(System.in);
//
//        String type = scan.nextLine();
//
//        switch (type) {
//            case "banana":
//            case "apple":
//            case "kiwi":
//            case "cherry":
//            case "lemon":
//            case "grapes":
//                System.out.println("fruit");
//                break;
//            case "tomato":
//            case "cucumber":
//            case "pepper":
//            case "carrot":
//                System.out.println("vegetable");
//                break;
//            default:
//                System.out.println("unknown");
//        }


        //10th case

//        Scanner scan = new Scanner(System.in);
//
//        int num = Integer.parseInt(scan.nextLine());
//
//        if ((num >= 100 && num <= 200) || num == 0) {
//
//        } else {
//            System.out.println("invalid");
//        }

        //11th case

//        Scanner scan = new Scanner(System.in);
//
//        String fruit = scan.nextLine();
//        String day = scan.nextLine();
//        double quantity = Double.parseDouble(scan.nextLine());
//        double price = 0;
//        double finalPrice =0;
//
//        switch (day) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                switch (fruit) {
//                    case "banana":
//                        price = 2.50;
//                        break;
//
//                    case "apple":
//                        price = 1.2;
//                        break;
//
//                    case "orange":
//                        price = 0.85;
//                        break;
//
//                    case "grapefruit":
//                        price = 1.45;
//                        break;
//
//                    case "kiwi":
//                        price = 2.70;
//                        break;
//
//                    case "pineapple":
//                        price = 5.50;
//                        break;
//
//                    case "grapes":
//                        price = 3.85;
//                        break;
//                    default:
//                        System.out.println("error");
//
//                }
//                finalPrice = price * quantity;
//                if (finalPrice == 0) {
//                } else {
//                    System.out.printf("%.2f",price * quantity);
//                }
//                break;
//
//            case "Saturday":
//            case "Sunday":
//                switch (fruit) {
//                    case "banana":
//                        price = 2.70;
//                        break;
//
//                    case "apple":
//                        price = 1.25;
//                        break;
//
//                    case "orange":
//                        price = 0.90;
//                        break;
//
//                    case "grapefruit":
//                        price = 1.60;
//                        break;
//
//                    case "kiwi":
//                        price = 3.00;
//                        break;
//
//                    case "pineapple":
//                        price = 5.60;
//                        break;
//
//                    case "grapes":
//                        price = 4.20;
//                        break;
//                    default:
//                        System.out.println("error");
//
//                }
//
//                finalPrice = price * quantity;
//                if (finalPrice == 0) {
//                } else {
//                    System.out.printf("%.2f",price * quantity);
//                }
//                break;
//            default:
//                System.out.println("error");
//        }


        //12th case

//        Scanner scan = new Scanner(System.in);
//
//        String city = scan.nextLine();
//        double sales = Double.parseDouble(scan.nextLine());
//        double commission = 0;
//
//        switch (city) {
//            case "Sofia":
//                if (sales > 0 && sales <= 500) {
//                    commission = 0.05;
//                } else if (sales > 500 && sales <= 1000) {
//                    commission = 0.07;
//                } else if (sales > 1000 && sales <= 10000) {
//                    commission = 0.08;
//                } else if (sales > 10000) {
//                    commission = 0.12;
//                } else {
//                    System.out.println("error");
//                }
//                if (commission != 0) {
//                    System.out.printf("%.2f", sales * commission);
//                }
//                break;
//
//            case "Varna":
//                if (sales > 0 && sales <= 500) {
//                    commission = 0.045;
//                } else if (sales > 500 && sales <= 1000) {
//                    commission = 0.075;
//                } else if (sales > 1000 && sales <= 10000) {
//                    commission = 0.10;
//                } else if (sales > 10000) {
//                    commission = 0.13;
//                } else {
//                    System.out.println("error");
//                }
//                if (commission != 0) {
//                    System.out.printf("%.2f", sales * commission);
//                }
//                break;
//
//            case "Plovdiv":
//                if (sales > 0 && sales <= 500) {
//                    commission = 0.055;
//                } else if (sales > 500 && sales <= 1000) {
//                    commission = 0.08;
//                } else if (sales > 1000 && sales <= 10000) {
//                    commission = 0.12;
//                } else if (sales > 10000) {
//                    commission = 0.145;
//                } else {
//                    System.out.println("error");
//                }
//                if (commission != 0) {
//                    System.out.printf("%.2f", sales * commission);
//                }
//                break;
//            default:
//                System.out.println("error");
//        }

        //13th case

//        Scanner scan = new Scanner(System.in);
//
//        int days = Integer.parseInt(scan.nextLine());
//        int nights = days - 1;
//        String roomType = scan.nextLine();
//        String rating = scan.nextLine();
//        double pricePerNight = 0;
//        double discount = 0;
//        double finalPrice=0;
//
//
//        switch (roomType) {
//            case "room for one person":
//                if (days < 10) {
//                    pricePerNight = 18;
//                    finalPrice = nights * pricePerNight;
//                } else if (days >= 10 && days <= 15) {
//                    pricePerNight = 18;
//                    finalPrice = nights * pricePerNight;
//                } else if (days >15) {
//                    pricePerNight = 18;
//                    finalPrice = nights * pricePerNight;
//                }
//                break;
//            case "apartment":
//                if (days < 10) {
//                    pricePerNight = 25;
//                    discount = 1 - 0.3;
//                    finalPrice = nights * pricePerNight * discount;
//                } else if (days >= 10 && days <= 15) {
//                    pricePerNight = 25;
//                    discount = 1 - 0.35;
//                    finalPrice = nights * pricePerNight * discount;
//                } else if (days >15) {
//                    pricePerNight = 25;
//                    discount = 1 - 0.5;
//                    finalPrice = nights * pricePerNight * discount;
//                }
//                break;
//            case "president apartment":
//                if (days < 10) {
//                    pricePerNight = 35;
//                    discount = 1 - 0.1;
//                    finalPrice = nights * pricePerNight * discount;
//                } else if (days >= 10 && days <= 15) {
//                    pricePerNight = 35;
//                    discount = 1 - 0.15;
//                    finalPrice = nights * pricePerNight * discount;
//                } else if (days >15) {
//                    pricePerNight = 35;
//                    discount = 1 - 0.2;
//                    finalPrice = nights * pricePerNight * discount;
//                }
//                break;
//            default:
//        }
//        if (rating.equals("positive")) {
//           finalPrice *= 1.25;
//        } else if (rating.equals("negative")) {
//            finalPrice *= 0.90;
//        }
//        System.out.printf("%.2f", finalPrice);

    }


}
