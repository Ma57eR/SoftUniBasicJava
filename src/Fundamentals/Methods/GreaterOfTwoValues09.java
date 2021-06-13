package Fundamentals.Methods;

import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputType = scan.nextLine();
        String maxName = getInput(inputType);

        System.out.println(maxName);


    }

    private static String getInput(String inputType) {
        Scanner scan = new Scanner(System.in);
        switch (inputType) {
            case "string":
            case "char":
                String name1 = scan.nextLine();
                String name2 = scan.nextLine();
                String maxName = stringCheck(name1, name2);
                return maxName;

            case "int":
                int num1 = Integer.parseInt(scan.nextLine());
                int num2 = Integer.parseInt(scan.nextLine());
                String maxNum = "" + intCheck(num1, num2);
                return maxNum;
        }
        return "";
    }


    private static String stringCheck(String name1, String name2) {
        String maxName = "";
        char firstSymbol = name1.charAt(0);
        char secondSymbol = name2.charAt(0);

        if (firstSymbol + 0 > secondSymbol + 0) {
            maxName = name1;
        } else {
            maxName = name2;
        }
        return maxName;

    }

    private static int intCheck(int num1, int num2) {
        int maxNum = 0;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        return maxNum;

    }


}
