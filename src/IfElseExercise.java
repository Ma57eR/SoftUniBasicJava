import java.util.Scanner;

public class IfElseExercise {

    public static void main(String[] args) {

        //1st case

//        Scanner scan = new Scanner(System.in);
//
//        int firstRunner = Integer.parseInt(scan.nextLine());
//        int secondRunner = Integer.parseInt(scan.nextLine());
//        int thirdRunner = Integer.parseInt(scan.nextLine());
//        int totalTime = firstRunner + secondRunner + thirdRunner;
//        int minutes = totalTime / 60;
//        int seconds = totalTime % 60;
//
//        if (seconds < 10) {
//            System.out.printf("%d:0%d", minutes, seconds);
//        } else {
//            System.out.printf("%d:%d", minutes, seconds);
//        }

        //2nd case

//        Scanner scan = new Scanner(System.in);
//
//        int num = Integer.parseInt(scan.nextLine());
//        double bonusPoints = 0;
//
//        if (num <= 100) {
//            bonusPoints += 5;
//        } else if (num > 100 && num <= 1000) {
//            bonusPoints = num * 0.2;
//        } else if (num > 1000) {
//            bonusPoints = num * 0.1;
//        }
//        if (num % 2 == 0) {
//            bonusPoints += 1;
//        }
//        if (num % 10 == 5) {
//            bonusPoints += 2;
//        }
//        System.out.println(bonusPoints);
//        System.out.println(num + bonusPoints);


        //3rd case

//        Scanner scan = new Scanner(System.in);
//        double num = Double.parseDouble(scan.nextLine());
//
//        if (num <= 10) {
//            System.out.println("slow");
//        } else if (num > 10 && num <= 50) {
//            System.out.println("average");
//        } else if (num > 50 && num <= 150) {
//            System.out.println("fast");
//        } else if (num > 150 && num <= 1000) {
//            System.out.println("ultra fast");
//        } else if (num > 1000) {
//            System.out.println("extremely fast");
//        }

        //4th case

//        Scanner scan = new Scanner(System.in);
//
//        double num = Double.parseDouble(scan.nextLine());
//        String type = scan.nextLine();
//        String newType = scan.nextLine();
//
//        if (type.equals("mm")) {
//            if (newType.equals("cm")) {
//                num = num / 10;
//            } else if (newType.equals("m")) {
//                num = num / 1000;
//            }
//        } else if (type.equals("cm")) {
//            if (newType.equals("mm")) {
//                num = num * 10;
//            } else if (newType.equals("m")) {
//                num = num / 100;
//            }
//        } else if (type.equals("m")) {
//            if (newType.equals("cm")) {
//                num = num * 100;
//            } else if (newType.equals("mm")) {
//                num = num * 1000;
//            }
//        }
//        System.out.printf("%.3f", num);

        //5th case

//        Scanner scan = new Scanner(System.in);
//
//        int hours = Integer.parseInt(scan.nextLine());
//        int minutes = Integer.parseInt(scan.nextLine());
//        int allMinutes = hours * 60 + minutes + 15;
//        int newHour = allMinutes / 60;
//        int newMinutes = allMinutes % 60;
//
//
//        if (newHour > 23) {
//            newHour = 0;
//        }
//        if (newMinutes < 10) {
//            System.out.printf("%d:0%d", newHour, newMinutes);
//        } else {
//            System.out.printf("%d:%d", newHour, newMinutes);
//        }
//
//        System.out.println(newHour);
//        System.out.println(newMinutes);

        //6th case


//        Scanner scan = new Scanner(System.in);
//
//        double budget = Double.parseDouble(scan.nextLine());
//        int people = Integer.parseInt(scan.nextLine());
//        double clothsPrice = Double.parseDouble(scan.nextLine());
//        double decor = budget * 0.1;
//
//        if (people > 150) {
//            clothsPrice = clothsPrice * (1 - 0.1);
//        }
//        double totalAmount = people * clothsPrice + decor;
//        if (budget < totalAmount) {
//            System.out.println("Not enough money!");
//            System.out.printf("Wingard needs %.2f leva more.", totalAmount - budget);
//        } else {
//            System.out.println("Action!");
//            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalAmount);
//        }



    }
}
