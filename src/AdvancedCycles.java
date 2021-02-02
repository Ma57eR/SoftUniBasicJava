import java.util.Scanner;

public class AdvancedCycles {
    public static void main(String[] args) {




//        Scanner scan = new Scanner(System.in);
//        double n = Double.parseDouble(scan.nextLine());
//
//        double oddSum = 0;
//        double oddMin = Double.POSITIVE_INFINITY;
//        double oddMax = Double.NEGATIVE_INFINITY;
//
//        double evenSum = 0;
//        double evenMin = Double.POSITIVE_INFINITY;
//        double evenMax = Double.NEGATIVE_INFINITY;
//
//
//        // For Loop till n
//
//        for (int i = 1; i <= n; i = i++) {
//            double num = Double.parseDouble(scan.nextLine());
//
//
//            //Проверка за четна/нечетна позиция
//            if (i % 2 == 0) {
//                evenSum = num;
//
//                if (num < evenMin) {
//                    evenMin = num;
//                }
//                if (num > evenMax) {
//                    evenMax = num;
//                }
//
//            } else {
//                oddSum += num;
//
//                if (num < oddMin) {
//                    oddMin = num;
//                }
//                if (num > oddMax) {
//                    oddMax = num;
//                }
//
//            }
//        }


        //5th case

//        Scanner scan = new Scanner(System.in);
//
//        int n = Integer.parseInt(scan.nextLine());
//        double p1 =0;
//        double p2 =0;
//        double p3 =0;
//
//        //For Loop n- на брой пъти
//
//        for (int i = 1; i <= n; i++) {
//            int number = Integer.parseInt(scan.nextLine());
//
//
//            // p1 числата
//            if (number % 2 == 0) {
//                p1++;
//            }
//
//            //p2 числата
//            if (number % 3 == 0) {
//                p2++;
//            }
//
//            //p3 числата
//            if (number % 4 == 0) {
//                p3++;
//            }
//
//
//        }
//
//        p1 = p1 / n * 100;
//        p2 = p2 / n * 100;
//        p3 = p3 / n * 100;
//
//        System.out.printf("%.2f%%\n",p1);
//        System.out.printf("%.2f%%\n",p2);
//        System.out.printf("%.2f%%\n",p3);


        //6th case - Salary

//        Scanner scan = new Scanner(System.in);
//
//        int tabs = Integer.parseInt(scan.nextLine());
//        int salary = Integer.parseInt(scan.nextLine());
//
//
//        //For Loop по броя на табовете (tabs)
//
//        for (int i = 0; i <= tabs; i++) {
//            String website = scan.nextLine();
//
//            //Проверка дали заплатата става по-малка от 0
//
//            if (website.equals("Facebook")) {
//            salary -= 150;
//            } else if (website.equals("Instagram")) {
//            salary -= 100;
//            } else if (website.equals("Reddit")) {
//            salary -= 50;
//            }
//
//            if (salary <= 0) {
//
//                break; // Прекъсва цикъла
//            }
//        }
//
//        if (salary <= 0) {
//            System.out.println("You have lost your salary");
//        } else {
//            System.out.println(salary);
//
//        }

//        Scanner scan = new Scanner(System.in);
//        boolean isNominated = false;
//        String actorName = scan.nextLine();
//        double startingPoints = Double.parseDouble(scan.nextLine());
//        int raters = Integer.parseInt(scan.nextLine());
//
//
//        for (int i = 0; i < raters; i++) {
//            String judgeName = scan.nextLine();
//            double judgePoints = Double.parseDouble(scan.nextLine());
//
//            //Дължината на името на оцен умножено по точките, които дава, делено на 2
//            startingPoints = startingPoints + (judgeName.length() * judgePoints / 2);
//
//            if (startingPoints > 1250.5) {
//                isNominated = true;
//                break;
//            }
//
//        }
//
//        if (isNominated) {
//            System.out.printf("Congratulations, %s, got a nominee for leading role with %.1f!", actorName, startingPoints);
//        } else {
//            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.50 - startingPoints);
//        }




    }
}
