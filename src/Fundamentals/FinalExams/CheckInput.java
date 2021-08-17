package Fundamentals.FinalExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        String regex = "(.+)>(?<digits>[0-9]{3})\\|(?<letters>[a-z]{3})\\|(?<capLetters>[A-Z]{3})\\|(?<symbols>[^<>]{3})<\\1";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < num; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

          //  if (matcher.find()) {
                String pass = "";
                while (matcher.find()) {
                    pass+= matcher.group("digits");
                    pass+= matcher.group("letters");
                    pass+= matcher.group("capLetters");
                    pass+= matcher.group("symbols");
                }
            if (pass.length() == 0) {
                System.out.println("Try another password!");
            } else{

                System.out.println("Password: " + pass);}
       //     }
        }

    }
}
