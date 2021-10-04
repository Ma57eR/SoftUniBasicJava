package Advanced.MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        int rows = input;
        int cols = input;
        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < matrix.length; row++) {
            int[] rowData = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = rowData[col];
            }
        }
        int leftDiagonal = leftDiagonal(matrix);
        int rightDiagonal = rightDiagonal(matrix);
        int diagonalsDifference = Math.abs(leftDiagonal - rightDiagonal);
        System.out.println(diagonalsDifference);

    }

    private static int rightDiagonal(int[][] matrix) {
        int col = 0;
        int row = matrix.length-1;
        int sum = 0;
        while (row >= 0) {
            sum+= matrix[row][col];

        col++;
        row--;
        }
        return sum;
    }

    private static int leftDiagonal(int[][] matrix) {
        int col = 0;
        int row = 0;
        int sum = 0;
        while (col < matrix.length) {
            sum += matrix[row][col];
            row++;
            col++;
        }
        return sum;
    }
}
