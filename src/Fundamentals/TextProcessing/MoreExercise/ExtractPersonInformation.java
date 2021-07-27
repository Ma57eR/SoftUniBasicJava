package Fundamentals.TextProcessing.MoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        //name between &#39;@&#39; and &#39;|&#39;.
        //age between &#39;#&#39; and &#39;*&#39;.

        for (int i = 0; i < num; i++) {
            String name = input.substring(input.indexOf("@")+1, input.indexOf("|"));
            String age = input.substring(input.indexOf("#")+1, input.indexOf("*"));

            System.out.printf("%s is %s years old.%n", name, age);
            input = scan.nextLine();
        }

    }
}
