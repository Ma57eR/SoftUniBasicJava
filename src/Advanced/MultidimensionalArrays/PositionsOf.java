package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dimensions=  Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] firstMatrix = readMatrix(rows, cols, scan);

        //int[][] secondMatrix = readMatrix(rows, cols, scan);
        int magicNumber = Integer.parseInt(scan.nextLine());

        boolean hasMagic = false;
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] == magicNumber) {
                    System.out.println(row + " " +col);
                    hasMagic = true;
                }

            }
        }
        if (!hasMagic) {
            System.out.println("not found");
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
