package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder str = new StringBuilder();
        str.append(input);

        for (int i = 0; i < str.length()-1;) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                str.deleteCharAt(i);
                if (i >= str.length()) {
                    break;
                }
            } else {
                i++;
            }
        }
        System.out.println(str);
    }
}
