package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String splitPattern = ", ";

        int[] dimensions = Arrays.stream(scan.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = readMatrix(rows, cols, scan, splitPattern);
        System.out.println(rows);
        System.out.println(cols);
        int matrixSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrixSum+=matrix[row][col];
            }

        }

        System.out.println(matrixSum);

    }
    private static int[][] readMatrix(int rows, int cols, Scanner scan, String splitPattern) {

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            //filling row
            int[] arr = Arrays.stream(scan.nextLine().split(splitPattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        return matrix;
    }
}
