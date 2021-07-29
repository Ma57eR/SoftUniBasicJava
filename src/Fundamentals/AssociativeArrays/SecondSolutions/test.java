package Fundamentals.AssociativeArrays.SecondSolutions;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strArray = new String[] {"Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn"};

        String joinedString = String.join(" | ", strArray);

        System.out.println(joinedString);
    }
}
