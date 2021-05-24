package Fundamentals;

import java.util.Scanner;

public class FundamentalsDataTypesMore {
    public static void main(String[] args) {


        //01. Data Type Finder

//        Scanner scan = new Scanner(System.in);
//
//        String input = scan.nextLine();
//
//        while (!input.equals("END")) {
//
//
//            int integer = 0;
//            int floating = 0;
//            boolean floatPoint = false;
//            String type = "string";
//
//            if (input.length() == 1) {
//                char current = input.charAt(0);
//                if (current >= 48 && current <= 57) {
//                    type = "integer";
//                } else {
//                    type = "character";
//                }
//            } else {
//                for (int i = 0; i < input.length(); i++) { // INTEGERS & FLOAT POINT
//                    char current = input.charAt(i);
//                    if (i == 0 && current == 45 || (current >= 48 && current <= 57) || current == 46) {
//                        integer++;
//                        if (current == 46) {
//                            floating++;
//                            floatPoint = true;
//                        }
//                    }
//                }
//            }
//            if (integer == input.length()) {
//                if (floatPoint && floating == 1) { //floating
//                    type = "floating point";
//                } else if (floating > 1) {
//
//                } else {
//                    type = "integer"; // integer
//                }
//            }
//
//            String checkBl = input.toLowerCase(); // boolean
//            switch (checkBl) {
//                case "true":
//                case "false":
//                    type = "boolean";
//            }
//
//            System.out.printf("%s is %s type%n", input, type);
//            input = scan.nextLine();
//        }



        //02. From Left to The Right

//        Scanner scan = new Scanner(System.in);
//        int numLines = Integer.parseInt(scan.nextLine());
//        String num = scan.nextLine();
//        long left;
//        long right;
//        int rightIndex = 0;
//        long sum = 0;
//
//
//        for (int i = 0; i < numLines; i++) {
//            String temp = "";
//            //Търсим лявото число
//            for (int j = 0; j < num.length(); j++) {
//                char symbol = num.charAt(j);
//
//                if (symbol == 32) {
//                    rightIndex = j;
//                    break;
//                }
//                temp += symbol;
//            }
//            left = Long.parseLong(temp);
//            temp = "";
//            //Търсим дясното число
//            for (int j = (rightIndex + 1); j < num.length(); j++) {
//                char symbol = num.charAt(j);
//                temp += symbol;
//            }
//            right = Long.parseLong(temp);
//
//            if (left >= right) {
//                while (left > 0) {
//                    long templeft = left % 10; //Взимаме последната цифра
//                    sum += Math.abs(templeft);
//                    left /= 10;
//                }
//                System.out.println(sum);
//                sum = 0;
//            } else {
//                while (right > 0) {
//                    long tempright = right % 10; //Взимаме последната цифра
//                    sum += Math.abs(tempright);
//                    right /= 10;
//                }
//                System.out.println(sum);
//                sum = 0;
//            }
//            if (i != numLines-1) {
//
//                num = scan.nextLine();
//            }
//
//        }


        //03. Floating Equality

//        Scanner scan = new Scanner(System.in);
//        double a = Double.parseDouble(scan.nextLine());
//        double b = Double.parseDouble(scan.nextLine());
//
//        if (Math.abs(a - b) >= 0.000001) {
//            System.out.  println("False");
//        } else {
//            System.out.println("True");
//        }


        //04. Refactoring: Prime Checker

//        Scanner scan = new Scanner(System.in);
//
//        int num = Integer.parseInt(scan.nextLine());
//        for (int index = 2; index <= num; index++) {
//            boolean isPrime = true;
//            for (int cepitel = 2; cepitel < index; cepitel++) {
//                if (index % cepitel == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            System.out.printf("%d -> %b%n", index, isPrime);
//        }


        //05. Decrypting Message


//        Scanner scan = new Scanner(System.in);
//        int key = Integer.parseInt(scan.nextLine());
//        int numLines = Integer.parseInt(scan.nextLine());
//        //char symbol = scan.nextLine().charAt(0);
//        //char decryptedSymbol = (char) (symbol + key);
//        String decrypted = "";
//
//        for (int i = 0; i < numLines; i++) {
//            char symbol = scan.nextLine().charAt(0);
//            char decryptedSymbol = (char) (symbol + key);
//            decrypted += String.valueOf(decryptedSymbol);
//
//        }
//        System.out.println(decrypted);

        //06. Balanced Brackets

        Scanner scan = new Scanner(System.in);
        int numLines = Integer.parseInt(scan.nextLine());
        int openBrackets = 0;
        int closingBrackets = 0;

        for (int i = 0; i < numLines; i++) {
            String input = scan.nextLine();
            if (input.equals("(")) {
                openBrackets++;
            }
            if (input.equals(")")) {
                closingBrackets++;
            }
        }
        if (openBrackets - closingBrackets != 0) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }




    }
}
