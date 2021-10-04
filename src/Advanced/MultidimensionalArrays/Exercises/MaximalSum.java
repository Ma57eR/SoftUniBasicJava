package Advanced.MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = readMatrix(rows, cols, scan);

        int[][] maxSubMatrix = maxSubMatrix(matrix);

        printMatrix(maxSubMatrix);

    }
    private static void printMatrix(int[][] matrix) {

        for (int[] strings : matrix) {
            for (int string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }

    private static int[][] maxSubMatrix(int[][] matrix) {
        int maxRow = matrix.length - 2;
        int maxCol = matrix[0].length - 2;
        int maxSumSubMatrix = 0;
        int[][] subMatrix = new int[3][3];
        int[][] maxSubMatrix = new int[3][3];
        //Реда на голямата матрица
        for (int row = 0; row < maxRow; row++) {
            //Колоната на голямата матрица
            for (int col = 0; col < maxCol; col++) {
                //При всяка колона  започваме нова подматрица
                int subMatrixSum = 0;
                //ПодМатрицата е от 3 реда
                for (int subRow = 0; subRow < 3; subRow++) {
                    //Подматрицата е от 3 колони
                    for (int subCol = 0; subCol < 3; subCol++) {
                        //реда = субреда + реда, колоната = колоната + субколоната от главната матрица
                        subMatrix[subRow][subCol] = matrix[row + subRow][col + subCol];
                        subMatrixSum += matrix[row + subRow][col + subCol];
                    }

                }
                if (subMatrixSum > maxSumSubMatrix) {
                    maxSumSubMatrix = subMatrixSum;
                    for (int rowMax = 0; rowMax < maxSubMatrix.length; rowMax++) {
                        for (int colMax = 0; colMax < maxSubMatrix[rowMax].length; colMax++) {
                            maxSubMatrix[rowMax][colMax] = subMatrix[rowMax][colMax];
                        }

                    }
                }
            }
        }
        System.out.println("Sum = " + maxSumSubMatrix);
        return maxSubMatrix;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] rowData = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < rowData.length; col++) {
                matrix[row][col] = rowData[col];
            }
        }
        return matrix;
    }
}
