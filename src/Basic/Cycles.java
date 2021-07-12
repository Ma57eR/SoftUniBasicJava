package Basic;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {


//Scanner scan = new Scanner(System.in);


        //1st case
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }


        //2nd case

//        Scanner scan = new Scanner(System.in);
//
//        int n = Integer.parseInt(scan.nextLine());
//
//        for (; n >= 1; n--) {
//            System.out.println(n);
//        }

        //3rd case
//
//        Scanner scan = new Scanner(System.in);
//        int a = Integer.parseInt(scan.nextLine());
//
//        for (int i = 1; i <= a; i += 3) {
//            System.out.println(i);
//        }


        //4th case
//        Scanner scan = new Scanner(System.in);
//
//        int n = Integer.parseInt(scan.nextLine());
//        int num = 1;
//        for (int i = 0; i <= n; i+=2){
//            System.out.println(num);
//            num *= 4;
//        }

//        Scanner scan = new Scanner(System.in);
//
//        String word = scan.nextLine();
//
//
//        for (int i = 0; i < word.length(); i++) {
//
//            char symbol = word.charAt(i);
//            System.out.println(symbol);
//        }

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//
////        int a = 1;
////        int e = 2;
////        int i = 3;
////        int o = 4;
////        int u = 5;
//        int sum =0;
//
//        for (int i = 0; i < word.length(); i++) {
//
//            char symbol = word.charAt(i);
//
//            switch (symbol) {
//                case 'a':
//                    sum += 1;
//                    break;
//                case 'e':
//                    sum += 2;
//                    break;
//                case 'i':
//                    sum += 3;
//                    break;
//                case 'o':
//                    sum += 4;
//                    break;
//                case 'u':
//                    sum += 5;
//                    break;
//
//            }
//
//        }
//        System.out.println(sum);

            //7th case
//        Scanner scan = new Scanner(System.in);
//
//        int n = Integer.parseInt(scan.nextLine());
//        int num = 0;
//
//
//        for (int i = 1; i <= n; i++) {
//            int a = Integer.parseInt(scan.nextLine());
//            num += a;
//
//
//        }
//
//        System.out.println(num);


        //8th case

//        Scanner scan = new Scanner(System.in);
//        int n = Integer.parseInt(scan.nextLine());
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 1; i <= n; i++) {
//            int num = Integer.parseInt(scan.nextLine());
//
//            if (num < min) {
//                min = num;
//            }
//            if (num > max) {
//                max = num;
//            }
//
//        }
//
//        System.out.printf("Max number: %d%n", max);
//        System.out.printf("Min number: %d", min);


        //9th case
//
//        Scanner scan = new Scanner(System.in);
//
//
//        int n = Integer.parseInt(scan.nextLine());
//        int left = 0;
//        int right = 0;
//
//        for (int i = 1; i <= n; i++) {
//            int num = Integer.parseInt(scan.nextLine());
//             left += num;
//        }
//        for (int i = 1; i <= n; i++) {
//            int num2 = Integer.parseInt(scan.nextLine());
//             right += num2;
//        }
//
//        if (left == right) {
//            System.out.printf("Yes, sum = %d", left);
//        } else {
//            System.out.printf("No, diff = %d", Math.abs(left - right));
//        }


        //10th case

//        Scanner scan = new Scanner(System.in);
//
//        int n = Integer.parseInt(scan.nextLine());
//        int left =0;
//        int right = 0;
//
//        for (int i = 1; i <= n; i++) {
//
//            int num = Integer.parseInt(scan.nextLine());
//
//
//            if (i % 2 == 0) {
//                left += num;
//            } else {
//                right += num;
//            }
//        }
//
//        if (left == right) {
//            System.out.println("Yes");
//            System.out.printf("Sum = %d", left);
//        } else {
//            System.out.println("No");
//            System.out.printf("Diff = %d", Math.abs(left - right));
//        }


        //11th case

//        Scanner scan = new Scanner(System.in);
//        int n = Integer.parseInt(scan.nextLine());
//        double dishWasher = Double.parseDouble(scan.nextLine());
//        double giftPrice = Double.parseDouble(scan.nextLine());
//        int money =0;
//        int gifts = 0;
//        int count = 0;
//        double allMoney =0;
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                count += 1;
//                money += count * 10; //Всеки следващ
//                money -= 1; // Крадливия брат
//            } else {
//                gifts += 1;
//            }
//        }
//        allMoney = money + (gifts * giftPrice);
//
//        if (allMoney >= dishWasher) {
//            System.out.printf("Yes! %.2f", allMoney - dishWasher);
//        } else {
//            System.out.printf("No! %.2f", dishWasher - allMoney);
//        }


    }
}
