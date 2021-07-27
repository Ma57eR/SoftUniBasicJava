package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder newInput = new StringBuilder(input);
        int explosion = 0;

        for (int index= 0; index < newInput.length(); index++) {

            if(newInput.charAt(index) != '>' && explosion > 0){ // проверка дали текущият символ е '>' и
                // ако не е и сме минали през '>'
                // => експлозията е повече от 0 изтриваме експлозия на брой елементи, които са различни от '>'
                newInput.deleteCharAt(index);
                explosion--;
                index--;

            } else if(newInput.charAt(index) == '>'){ // ако текущият символ е >, намираме стойността на експлозията
                // и при преминаване на следващия символ трием нужните символите
                explosion += Character.getNumericValue(newInput.charAt(index+ 1));
            }

        }
        System.out.println(newInput);
    }
}
