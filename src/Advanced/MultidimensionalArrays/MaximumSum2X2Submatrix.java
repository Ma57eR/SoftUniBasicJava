package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2X2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String splitPattern = ", ";

        int[] dimensions = Arrays.stream(scan.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(rows, cols, scan, splitPattern);
        int[][] subMatrix = new int[2][2];
        int bestSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum = 0;
                currentSum = matrix[row][col] + matrix[row][col+1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (currentSum > bestSum) {
                    bestSum = currentSum;
                subMatrix[0][0] = matrix[row][col];
                subMatrix[0][1] = matrix[row][col+1];
                subMatrix[1][0] = matrix[row+1][col];
                subMatrix[1][1] = matrix[row+1][col+1];

                }
            }
        }
        bestSum = 0;
        for (int row = 0; row < subMatrix.length; row++) {
            for (int col = 0; col < subMatrix[row].length; col++) {
                bestSum+=subMatrix[row][col];
                System.out.print(subMatrix[row][col] + " ");
            }
            System.out.println();
        }


        System.out.println(bestSum);
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
