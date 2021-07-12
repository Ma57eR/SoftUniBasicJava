package Fundamentals.Beginning;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        //01. Convert Meters to Kilometers


//        Scanner scan = new Scanner(System.in);
//        int meters = Integer.parseInt(scan.nextLine());
//        double kilometers = (double) meters / 1000;
//
//        System.out.printf("%.2f", kilometers);


        //02. Pounds to Dollars

//        Scanner scan = new Scanner(System.in);
//        double pound = Integer.parseInt(scan.nextLine());
//        double dollars = pound * 1.31;
//
//        System.out.printf("%.3f",dollars);


        //03. Exact Sum of Real Numbers

//        Scanner scan = new Scanner(System.in);
//        int numOfNumbers = Integer.parseInt(scan.nextLine());
//        //BigDecimal sum = BigDecimal.valueOf(0);
//
//        for (int i = 1; i <= numOfNumbers; i++) {
//            BigDecimal num = scan.nextBigDecimal();
//            num = num + num;
//        }
//        System.out.println(num);


        //04. Town Info

//        Scanner scan = new Scanner(System.in);
//        String city = scan.nextLine();
//        int population = Integer.parseInt(scan.nextLine());
//        int area = Integer.parseInt(scan.nextLine());
//
//        System.out.printf("Town %s has population of %d and area %d square km.", city, population, area);


        //05. Concat Names

//        Scanner scan = new Scanner(System.in);
//        String firstName = scan.nextLine();
//        String lastName = scan.nextLine();
//        String delimiter = scan.nextLine();
//
//        System.out.printf("%s%s%s", firstName, delimiter, lastName);


        //06. Chars to String

//        Scanner scan = new Scanner(System.in);
//        String word = "";
//
//        for (int i = 0; i <= 2; i++) {
//            char symbol = scan.next().charAt(0);
//            word += symbol;
//
//        }
//
//        System.out.println(word);

        //07. Reversed Chars

//        Scanner scan = new Scanner(System.in);
//        String word = "";
//        String reverseWord = "";
//
//        for (int i = 0; i < 3; i++) {
//            char symbol = scan.nextLine().charAt(0);
//            word += symbol;
//        }
//        for (int i = 2; i >= 0; i--) {
//            reverseWord += word.charAt(i) + " ";
//        }
//
//        System.out.println(reverseWord);

        //08. Lower or Upper

//        Scanner scan = new Scanner(System.in);
//        char symbol = scan.nextLine().charAt(0);
//
//        if (symbol >= 'A' && symbol <= 'Z') {
//            System.out.println("upper-case");
//        } else {
//            System.out.println("lower-case");
//        }


        //09. Centuries to Minutes

//        Scanner scan = new Scanner(System.in);
//        int centuries = Integer.parseInt(scan.nextLine());
//        int years = centuries * 100;
//        double days = 365.2422 * years;
//        double hours = 24 * days;
//        double minutes = 60 * hours;
//
//        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);

        //10. Special Numbers

//        Scanner scan = new Scanner(System.in);
//        int input = Integer.parseInt(scan.nextLine());
//        int magic = 0;
//
//        while (input > 0) {
//            for (int i = 1; i <= input; i++) {
//            magic += i % 10;
//                if (i>9) {
//                    int temp = i/10;
//                    magic += temp % 10;
//                }
//                    if (magic == 5 || magic == 7 || magic == 11) {
//                        System.out.println(i + " -> True");
//                    } else {
//                        System.out.println(i + " -> False");
//                    }
//                    magic = 0;
//            }
//            break;
//        }


        //11. Refactor Volume of Pyramid

//        Scanner scanner = new Scanner(System.in);
//        double length, width, height, volume = 0;
//        System.out.print("Length: ");
//        length = Double.parseDouble(scanner.nextLine());
//        System.out.print("Width: ");
//        width = Double.parseDouble(scanner.nextLine());
//        System.out.print("Height: ");
//        height = Double.parseDouble(scanner.nextLine());
//        volume = (length + width + height);
//        System.out.printf("Pyramid Volume: %.2f", volume);

        //12. Refactor Special Numbers

//        Scanner scanner = new Scanner(System.in);
//        int input = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//        int magic = 0;
//        boolean check = false;
//        for (int i = 1; i <= input; i++) {
//            magic = i;
//            while (i > 0) {
//                sum += i % 10;
//                i = i / 10;
//            }
//            check = (sum == 5) || (sum == 7) || (sum == 11);
//            System.out.printf("%d -> %b%n", magic, check);
//            sum = 0;
//            i = magic;
//        }

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int magic = 0;
        boolean check = false;
        String ch= "";
        for (int i = 1; i <= input; i++) {
            magic = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            check = (sum == 5) || (sum == 7) || (sum == 11);
            if (check == true) {
                ch = "True";
            } else {
                ch = "False";
            }
            System.out.printf("%d -> %b%n", magic, ch);
            sum = 0;
            i = magic;
        }


    }
}
