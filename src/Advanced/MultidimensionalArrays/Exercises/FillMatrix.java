package Advanced.MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[rows][cols];

        if (pattern.equals("A")) {
            matrix = patternA(matrix);

        } else {
            //Patern B - col 0 ot 0 do kraq, col 1 ot kraq do nula
            matrix = patternB(matrix);

        }
        printMatrix(matrix);

    }

    private static int[][] patternA(int[][] matrix) {
        int num = 1;
        //Pattern A - col 0 do kray, col 2 0 do kray
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = num;
                num++;
            }

        }
        return matrix;
    }
    private static int[][] patternB(int[][] matrix) {
        int num = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                //Четно е от 0 до края
                //Нечетно от края до 0
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = num;
                    num++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = num;
                    num++;
                }
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            //filling row
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        return matrix;
    }
}
