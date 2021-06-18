package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();

        
        //Трябва да е между 6 и 10 символа
        //Трябва да е само букви и цифри
        //Трябва да има по 2 цифри

        boolean numCharacters = false;
        boolean onlyLetAndDig = false;
        boolean twoDigits = false;


        boolean numChar = passwordRule1(pass,numCharacters);
        boolean letAndDig = passwordRule2(pass, onlyLetAndDig);
        boolean twoDig = passwordRule3(pass, twoDigits);

        if (!numChar) {
            System.out.println("Password must be between 6 and 10 characters");
        }  if (!letAndDig) {
            System.out.println("Password must consist only of letters and digits");
        }  if (!twoDig) {
            System.out.println("Password must have at least 2 digits");
        }
        if (numChar && letAndDig && twoDig) {
            System.out.println("Password is valid");
        }

        
    }



    private static boolean passwordRule1(String pass, boolean numCharacters) {
        boolean checkRule = false;
        if (pass.length() < 6 || pass.length() > 10) {
            return checkRule;
        } else {
            checkRule = true;
        }
        return checkRule;
    }

    private static boolean passwordRule2(String pass, boolean onlyLetAndDig) {
        boolean checkRule = false;
        for (int i = 0; i < pass.length(); i++) {
            if (((int) pass.charAt(i) >= 48 && (int) pass.charAt(i) <= 90) || ((int) pass.charAt(i) >= 97 && (int) pass.charAt(i) <= 122)) {
                checkRule = true;
            } else {
                checkRule = false;
                return checkRule;
            }
        }
        return checkRule;
    }

    private static boolean passwordRule3(String pass, boolean twoDigits) {
        boolean checkRule = false;
        int countDigits = 0;
        for (int i = 0; i < pass.length(); i++) {
            if ((int)pass.charAt(i) >= 48 && (int)pass.charAt(i)<=57) {
                countDigits++;
            }
        }
        if (countDigits > 1) {
            checkRule = true;
        }
        return checkRule;
    }
}
