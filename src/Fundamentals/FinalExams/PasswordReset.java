package Fundamentals.FinalExams;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("Done")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "TakeOdd":
                    StringBuilder tmp = new StringBuilder();
                    for (int i = 1; i < message.length(); i++) {
                        if (i % 2 != 0) {
                            tmp.append(message.charAt(i));
                        }
                    }
                    message = tmp.toString();
                    System.out.println(message);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[1]) + Integer.parseInt(command[2]);
                    StringBuilder forCut = new StringBuilder(message);
                    forCut.delete(startIndex, endIndex);
                    message = forCut.toString();
                    System.out.println(message);
                    break;
                case "Substitute":
                    String substring = command[1];
                    String substitute = command[2];
                    if (!message.contains(substring)) {
                        System.out.println("Nothing to replace!");
                    } else {
                        while (message.contains(substring)) {
                            StringBuilder tmpBuilder = new StringBuilder(message);
                            int subsStartIndex = message.indexOf(substring);
                            int subsEndIndex = subsStartIndex + substring.length();
                            tmpBuilder.replace(subsStartIndex, subsEndIndex, substitute);
                            message = tmpBuilder.toString();
                        }
                        System.out.println(message);
                    }

                    break;
            }
            input = scan.nextLine();
        }
        System.out.println("Your password is: " + message);
    }
}
