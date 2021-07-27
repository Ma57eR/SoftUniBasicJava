package Fundamentals.TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");


        List<Double> calculatedNumbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String currentInput = input[i];
            char leftSymbol = currentInput.charAt(0);
            char rightSymbol = currentInput.charAt(currentInput.length() - 1);
            double currentNum = Integer.parseInt(currentInput.substring(currentInput.indexOf(leftSymbol) + 1, currentInput.lastIndexOf(rightSymbol)));
            double total = 0;

            //Буква преди цифрата:
            //Ако е ГЛАВНА - делим на номера на поредността в азбуката
            //Ако е малка - умножаваме по номера на поредността в азбуката
            int numForOperation = 0;
            if (Character.isUpperCase(leftSymbol)) {
                 numForOperation = (leftSymbol - 'A') + 1; //взимаме конкретния номер на поредността на буквата
                total = (double) currentNum / numForOperation;
            } else if (Character.isLowerCase(leftSymbol)) {
                 numForOperation = (leftSymbol - 'a') + 1;
                total = currentNum * numForOperation;
            }
            //Буква след цифрата:
            //Ако е ГЛАВНА - изваждане номера на поредността в азбуката
            //Ако е малка - добавяме номера на поредността в азбуката
            if (Character.isUpperCase(rightSymbol)) {
                 numForOperation = (rightSymbol - 'A') + 1;
                total = total - numForOperation;
            } else if (Character.isLowerCase(rightSymbol)) {
                 numForOperation = (rightSymbol - 'a') + 1;
                total = total + numForOperation;
            }
            //Добавяме в листа
            calculatedNumbers.add(total);
        }
        double finalCalculation = 0;
        //Събираме всички числа от листа
        for (Double currentNum : calculatedNumbers) {
            finalCalculation += currentNum;
        }
        System.out.printf("%.2f", finalCalculation);
    }
}