package FundamentalsSecond.Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String vowels = "aeiouAEIOU";
        int countVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(String.valueOf(input.charAt(i)))) {
                countVowels++;
            }
        }
        System.out.println(countVowels);
    }
}
