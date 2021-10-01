package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];
        char[][] outputMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            // a b c l
            String line = scan.nextLine();
            String[] elements = line.split("\\s+");
            for (int i = 0; i < elements.length; i++) {
                char currentChar = elements[i].charAt(0);
                firstMatrix[row][i] = currentChar;
            }

        }

        for (int row = 0; row < rows; row++) {
            // a b c l
            String line = scan.nextLine();
            String[] elements = line.split("\\s+");
            for (int i = 0; i < elements.length; i++) {
                char currentChar = elements[i].charAt(0);
                secondMatrix[row][i] = currentChar;
            }
        }


        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    outputMatrix[row][col] = firstMatrix[row][col];
                } else {
                    outputMatrix[row][col] = '*';
                }
            }
        }

        for (int row = 0; row < outputMatrix.length; row++) {
            for (int col = 0; col < outputMatrix[row].length; col++) {
                String currentChar = String.valueOf(outputMatrix[row][col]);
                System.out.print(currentChar + " ");
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
