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



    }


}
