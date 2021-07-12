package Basic;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        //1st case

//        Scanner scan = new Scanner(System.in);
//
//        int grade = Integer.parseInt(scan.nextLine());
//
//        if (grade >= 5) {
//            System.out.println("Excellent!");
//        }


//        //2nd case
//
//        Scanner scan = new Scanner(System.in);
//
//        int a = Integer.parseInt(scan.nextLine());
//        int b = Integer.parseInt(scan.nextLine());
//
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

        //3rd

//        Scanner scan = new Scanner(System.in);
//
//        int num = Integer.parseInt(scan.nextLine());
//        int evenOdd = num % 2;
//
//        if (evenOdd == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }

        //4th case

//        Scanner scan = new Scanner(System.in);
//        int num = Integer.parseInt(scan.nextLine());
//
//        if (num < 100) {
//            System.out.println("Less than 100");
//        }
//        else if (num >= 100 && num <= 200) {
//            System.out.println("Between 100 and 200");
//        } else {
//            System.out.println("Greater than 200");
//        }

        //5th case

//        Scanner scan = new Scanner(System.in);
//        String pass = scan.nextLine();
//
//        if (pass.equals("s3cr3t!P@ssw0rd")) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("Wrong password!");
//        }

        //6th case

//        Scanner scan = new Scanner(System.in);
//        String figureType = scan.nextLine();
//        Double area = 0.0;
//
//        if (figureType.equals("square")) {
//            double a = Double.parseDouble(scan.nextLine());
//            area = a * a;
//
//        } else if (figureType.equals("rectangle")) {
//            double a = Double.parseDouble(scan.nextLine());
//            double b = Double.parseDouble(scan.nextLine());
//            area = a * b;
//        } else if (figureType.equals("circle")) {
//            double a = Double.parseDouble(scan.nextLine());
//            area = Math.PI * a * a;
//        } else if (figureType.equals("triangle")) {
//            double a = Double.parseDouble(scan.nextLine());
//            double b = Double.parseDouble(scan.nextLine());
//            area = a * b / 2;
//        }
//        System.out.printf("%.3f", area);
//        }


        //7h Case

//        Scanner scan = new Scanner(System.in);
//        double pricePuzzle = 2.60;
//        double priceTalkingToy = 3.0;
//        double priceBear = 4.10;
//        double priceMinion = 8.20;
//        double priceTruck = 2.00;
//        double discount = (1 - 0.25);
//        double rent = (1 - 0.1);
//
//        double vacationCost = Double.parseDouble(scan.nextLine());
//        int puzzles = Integer.parseInt(scan.nextLine());
//        int toys = Integer.parseInt(scan.nextLine());
//        int bears = Integer.parseInt(scan.nextLine());
//        int minions = Integer.parseInt(scan.nextLine());
//        int trucks = Integer.parseInt(scan.nextLine());
//        int toysCount = puzzles + toys + bears + minions + trucks;
//        double orderAmount = puzzles * pricePuzzle + toys * priceTalkingToy + bears * priceBear + minions * priceMinion + trucks * priceTruck;
//
//        if (toysCount >= 50) {
//            orderAmount = orderAmount * discount;
//        }
//
//        if (vacationCost <= orderAmount * rent) {
//            double moneyLeft = orderAmount * rent - vacationCost;
//            System.out.printf("Yes! %.2f lv left.", moneyLeft);
//        } else {
//            double moneyNeed = vacationCost - orderAmount * rent;
//            System.out.printf("Not enough money! %.2f lv needed.", moneyNeed);
//        }
    }
}