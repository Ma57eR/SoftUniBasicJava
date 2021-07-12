package Exams.Old;

import java.util.Scanner;

public class FundamentalsBasicSyntax {

    public static void main(String[] args) {

        //1st Student Information
//        Scanner scan = new Scanner(System.in);
//
//        String name = scan.nextLine();
//        int age = Integer.parseInt(scan.nextLine());
//        double grade = Double.parseDouble(scan.nextLine());
//
//        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);


        //2nd  Passed
//        Scanner scan = new Scanner(System.in);
//
//        double grade = Double.parseDouble(scan.nextLine());
//
//        if (grade >= 3.00) {
//            System.out.println("Passed!");
//        }

        //3.	Passed or Failed

//        Scanner scan = new Scanner(System.in);
//
//                double grade = Double.parseDouble(scan.nextLine());
//
//        if (grade >= 3.00) {
//            System.out.println("Passed!");
//        } else {
//            System.out.println("Failed!");
//        }


        //4.	Back in 30 Minutes

//        Scanner scan = new Scanner(System.in);
//
//        int hours = Integer.parseInt(scan.nextLine());
//        int minutes = Integer.parseInt(scan.nextLine());
//
//        if (minutes + 30 > 59) {
//            hours += 1;
//            if (hours > 23) {
//                hours = 0;
//            }
//            minutes = minutes - 30;
//        } else {
//
//        minutes += 30;}
//        if (minutes < 10) {
//            System.out.printf("%d:0%d", hours, minutes);
//        } else {
//
//            System.out.printf("%d:%d", hours, minutes);
//        }

        //5.	Month Printer

//        Scanner scan = new Scanner(System.in);
//
//        int month = Integer.parseInt(scan.nextLine());
//
//        if (month < 1 || month > 12) {
//            System.out.println("Error!");
//        } else {
//            switch (month) {
//                case 1:
//                    System.out.println("January");
//                    break;
//                case 2:
//                    System.out.println("February");
//                    break;
//                case 3:
//                    System.out.println("March");
//                    break;
//                case 4:
//                    System.out.println("April");
//                    break;
//                case 5:
//                    System.out.println("May");
//                    break;
//                case 6:
//                    System.out.println("June");
//                    break;
//                case 7:
//                    System.out.println("July");
//                    break;
//                case 8:
//                    System.out.println("August");
//                    break;
//                case 9:
//                    System.out.println("September");
//                    break;
//                case 10:
//                    System.out.println("October");
//                    break;
//                case 11:
//                    System.out.println("November");
//                    break;
//                case 12:
//                    System.out.println("December");
//                    break;
//
//
//            }
//        }

        //6.	Foreign Languages

//        Scanner scan = new Scanner(System.in);
//
//        String language = scan.nextLine();
//
//        switch (language) {
//            case "USA":
//            case "England":
//                System.out.println("English");
//                break;
//            case "Spain":
//            case "Argentina":
//            case "Mexico":
//                System.out.println("Spanish");
//                break;
//            default:
//                System.out.println("unknown");
//        }

        //07. Theatre Promotion

//        Scanner scan = new Scanner(System.in);
//
//        String day = scan.nextLine();
//        int age = Integer.parseInt(scan.nextLine());
//        int ticketPrice = 0;
//
//        switch (day) {
//            case "Weekday":
//                if (age >= 0 && age <= 18) {
//                    ticketPrice = 12;
//                    System.out.printf("%d$", ticketPrice);
//                } else if (age > 18 && age <= 64) {
//                    ticketPrice = 18;
//                    System.out.printf("%d$", ticketPrice);
//                } else if (age > 64 && age <= 122) {
//                    ticketPrice = 12;
//                    System.out.printf("%d$", ticketPrice);
//                } else {
//                    System.out.println("Error!");
//                }
//                break;
//
//            case "Weekend":
//                if (age >= 0 && age <= 18) {
//                    ticketPrice = 15;
//                    System.out.printf("%d$", ticketPrice);
//                } else if (age > 18 && age <= 64) {
//                    ticketPrice = 20;
//                    System.out.printf("%d$", ticketPrice);
//                } else if (age > 64 && age <= 122) {
//                    ticketPrice = 15;
//                    System.out.printf("%d$", ticketPrice);
//                } else {
//                    System.out.println("Error!");
//                }
//                break;
//
//            case "Holiday":
//                if (age >= 0 && age <= 18) {
//                    ticketPrice = 5;
//                    System.out.printf("%d$", ticketPrice);
//                } else if (age > 18 && age <= 64) {
//                    ticketPrice = 12;
//                    System.out.printf("%d$", ticketPrice);
//                } else if (age > 64 && age <= 122) {
//                    ticketPrice = 10;
//                    System.out.printf("%d$", ticketPrice);
//                } else {
//                    System.out.println("Error!");
//                }
//                break;
//
//        }


        //08. Divisible by 3

//        Scanner scan = new Scanner(System.in);
//
//        for (int i = 3; i <= 100; i += 3) {
//            System.out.println(i);
//        }

        //9.	Sum of Odd Numbers

//        Scanner scan = new Scanner(System.in);
//        int n = Integer.parseInt(scan.nextLine());
//        int counter = 0;
//        int sum = 0;
//
//        for (int i = 1; ; i++) {
//            if (i % 2 != 0) {
//                counter +=1;
//                sum += i;
//                System.out.println(i);
//            }
//            if (counter == n) {
//                break;
//            }
//
//        }
//        System.out.printf("Sum: %d", sum);

        //10.	 Multiplication Table

//        Scanner scan = new Scanner(System.in);
//
//        int num = Integer.parseInt(scan.nextLine());
//        int product = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            product = num * i;
//            System.out.printf("%d X %d = %d%n", num, i, product);
//        }

        //11.	Multiplication Table 2.0

//        Scanner scan = new Scanner(System.in);
//
//
//        int num = Integer.parseInt(scan.nextLine());
//        int num2 = Integer.parseInt(scan.nextLine());
//        int product = 0;
//
//        if (num2 <= 10) {
//
//            for (int i = num2; i <= 10; i++) {
//                product = num * i;
//                System.out.printf("%d X %d = %d%n", num, i, product);
//            }
//        } else {
//            product = num * num2;
//            System.out.printf("%d X %d = %d%n", num, num2, product);
//        }

        //12.	Even Number

//        Scanner scan = new Scanner(System.in);
//        int num = Integer.parseInt(scan.nextLine());
//        boolean even = false;
//
//        while (!even) {
//            if (Math.abs(num) % 2 != 0) {
//                System.out.println("Please write an even number.");
//            } else {
//                System.out.printf("The number is: %d", Math.abs(num));
//                even = true;
//                break;
//            }
//            num = Integer.parseInt(scan.nextLine());
//        }

        //13.	Refactor Sum of Odd Numbers

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 1;;i++) {
            if (i % 2 != 0) {
            System.out.printf("%d%n", i);
            sum += i;
            counter +=1;
            }
            if (counter == n) {
                break;
            }
        }
        System.out.printf("Sum: %d%n", sum);



    }
}
