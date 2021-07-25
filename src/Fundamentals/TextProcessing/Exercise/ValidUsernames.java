package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] usernames = scan.nextLine().split(",\\s+");

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].length() <= 3 || usernames[i].length() >= 16) {
                continue;
            }
            boolean correctUsername = false;
            for (int j = 0; j < usernames[i].length(); j++) {
                char currentChar = usernames[i].charAt(j);

                if (Character.isLetterOrDigit(currentChar) || currentChar == '_' || currentChar == '-') {
                    correctUsername = true;
                } else {
                  correctUsername = false;
                  break;
                }
            }
            if (!correctUsername) {
                continue;
            } else {
                System.out.println(usernames[i]);
            }
        }
    }
}
