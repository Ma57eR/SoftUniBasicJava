package Advanced.MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = new String[rows][cols];
        String[] readRows = new String[rows];

        for (int row = 0; row < matrix.length; row++) {
            readRows = scan.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = readRows[col];
            }
        }
        String[] command = scan.nextLine().split("\\s+");

        while (!command[0].equals("END")) {
            if (correctCommand(command, rows, cols)) {
                matrix = swapData(matrix, command);
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }

            command = scan.nextLine().split("\\s+");
        }


    }

    private static void printMatrix(String[][] matrix) {

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private static String[][] swapData(String[][] matrix, String[] command) {
        String oldData = null;
        String newData = null;
        int[] oldCoords = new int[matrix.length];
        int[] newCoords = new int[matrix.length];

        oldData = matrix[Integer.parseInt(command[1])][Integer.parseInt(command[2])];
        matrix[Integer.parseInt(command[1])][Integer.parseInt(command[2])] = matrix[Integer.parseInt(command[3])][Integer.parseInt(command[4])];
        matrix[Integer.parseInt(command[3])][Integer.parseInt(command[4])] = oldData;
        return matrix;
    }

    private static boolean correctCommand(String[] command, int rows, int cols) {
        return command.length == 5 &&
        command[0].equals("swap") &&
                Integer.parseInt(command[1]) <= rows &&
                Integer.parseInt(command[3]) <= rows &&
                Integer.parseInt(command[2]) <= cols &&
                Integer.parseInt(command[4]) <= cols &&

                Integer.parseInt(command[1]) >= 0 &&
                Integer.parseInt(command[3]) >= 0 &&
                Integer.parseInt(command[2]) >= 0 &&
                Integer.parseInt(command[4]) >= 0;
    }
}
