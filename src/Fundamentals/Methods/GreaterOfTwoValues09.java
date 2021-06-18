package Fundamentals.Methods;

import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        String inputType = scan.nextLine();
//        String maxName = getInput(inputType);
//        int maxNum = Integer.parseInt(maxName);
//
//        switch (inputType) {
//            case "string":
//            case "char":
//                System.out.println(maxName);
//                break;
//            case "int":
//                System.out.println(maxNum);
//                break;
//        }
//
//
//    }
//
//    private static String getInput(String inputType) {
//        Scanner scan = new Scanner(System.in);
//        switch (inputType) {
//            case "string":
//            case "char":
//                String name1 = scan.nextLine();
//                String name2 = scan.nextLine();
//                String maxName = stringCheck(name1, name2);
//                return maxName;
//
//            case "int":
//                int num1 = Integer.parseInt(scan.nextLine());
//                int num2 = Integer.parseInt(scan.nextLine());
//                String maxNum = "" + intCheck(num1, num2);
//                return maxNum;
//        }
//        return "";
//    }
//
//
//    private static String stringCheck(String name1, String name2) {
//        String maxName = "";
//        char firstSymbol = name1.charAt(0);
//        char secondSymbol = name2.charAt(0);
//
//        if (firstSymbol + 0 > secondSymbol + 0) {
//            maxName = name1;
//        } else {
//            maxName = name2;
//        }
//        return maxName;
//
//    }
//
//    private static int intCheck(int num1, int num2) {
//        int maxNum = 0;
//        if (num1 > num2) {
//            maxNum = num1;
//        } else {
//            maxNum = num2;
//        }
//        return maxNum;
//
//    }
    Scanner scan = new Scanner(System.in);
    String type = scan.nextLine();

        switch (type) {
            case "int":
                int num1 = Integer.parseInt(scan.nextLine());
                int num2 = Integer.parseInt(scan.nextLine());
                int max = getMax(num1, num2);
                System.out.println(max);
                break;
            case "string":
            case "char":
                String input1 = scan.nextLine();
                String input2 = scan.nextLine();
                String maxName = maxName(input1, input2);
                System.out.println(maxName);
                break;
        }

    }



    private static int getMax(int num1, int num2) {
        int max =0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    private static String maxName(String input1, String input2) {
        String maxName = "";
        if (input1.charAt(0) > input2.charAt(0)) {
            maxName = input1;
        } else {
            maxName = input2;
        }
        return maxName;
    }

}
