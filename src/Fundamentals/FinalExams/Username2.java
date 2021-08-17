package Fundamentals.FinalExams;

import java.util.Scanner;

public class Username2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();

        String input2 = scan.nextLine();

        while (!input2.equals("Sign up")) {
            String[] input = input2.split(" ");
            String command = input[0];
            switch (command) {
                case "Case":
                    String lowerUpper = input[1];
                    if (lowerUpper.equals("lower")) {
                        username = username.toLowerCase();
                        System.out.println(username);
                    } else if (lowerUpper.equals("upper")) {
                        username = username.toUpperCase();
                        System.out.println(username);
                    }
                    break;
                case "Reverse":
                    String reversed = "";
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);
                    if (startIndex >= 0 && startIndex < username.length() && endIndex >= 0 && endIndex < username.length()) {
                        for (int i = endIndex; i >= startIndex; i--) {
                            reversed += String.valueOf(username.charAt(i));
                        }
                    }
                    System.out.println(reversed);
                    break;
                case "Cut":
                    String substr = input[1];
                    if (isContains(username, substr)) {
                        username = username.replace(substr, "");
                        System.out.println(username);
                    } else {
                        System.out.printf("The word %s doesn't contain %s.%n", username, substr);
                    }
                    break;

                case "Replace":
                    char givenChar = input[1].charAt(0);
                    username = username.replaceAll(String.valueOf(givenChar), "*");
                    System.out.println(username);

                    break;
                case "Check":
                    char thisChar = input[1].charAt(0);
                    if (username.contains(String.valueOf(thisChar))) {
                        System.out.println("Valid");
                    } else {
                        System.out.printf("Your username must contain %c.%n", thisChar);
                    }
                    break;
            }
            input2 = scan.nextLine();
        }
    }

    private static boolean isContains(String username, String substr) {
        return username.contains(substr);
    }
}
