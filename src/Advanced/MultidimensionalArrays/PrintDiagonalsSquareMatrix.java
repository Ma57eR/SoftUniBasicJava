package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String splitPattern = "\\s+";

        int[] dimensions = Arrays.stream(scan.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[0];

        int[][] matrix = readMatrix(rows, cols, scan, splitPattern);
        int[][] diagonalsMatrix = new int[2][rows];

        int row = 0, col = 0;
        while (row < matrix.length) {
            int current = matrix[row][col];
            System.out.print(current + " ");
            row++;
            col++;
        }
        System.out.println();
        row = matrix.length-1;
        col = 0;
        while (row >= 0) {
            int current = matrix[row][col];
            System.out.print(current + " ");
            row--;
            col++;
        }



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
