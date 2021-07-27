package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] usernames = scan.nextLine().split(", ");

        for (String username : usernames) {
            if (isValid(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValid(String username) {

        if (!(username.length() >= 3 && username.length() <= 16)) {
            return false;
        }
        for (char ch : username.toCharArray()) {
            if (!(Character.isLetterOrDigit(ch) || ch == '_' || ch == '-')) {
                return false;
            }
        }
        return true;
    }
}
