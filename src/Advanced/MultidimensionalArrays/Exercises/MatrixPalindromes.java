package Advanced.MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        String[][] matrix = new String[rows][cols];

        char startingChar = 'a';

        for (int row = 0; row < matrix.length; row++) {
            //Вадим първата буква, която ще ни е водеща за реда

            for (int col = 0; col < matrix[row].length; col++) {
                //да променим втория символ
                String chars = String.valueOf(startingChar) +
                        (char) (startingChar + col) +
                        startingChar;
                    matrix[row][col] = chars;
                }
            startingChar++;
            }
        printMatrix(matrix);
        }


    private static void printMatrix(String[][] matrix) {

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }
}
