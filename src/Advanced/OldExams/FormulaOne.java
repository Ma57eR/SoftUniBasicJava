package Advanced.OldExams;

import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int commandsCount = Integer.parseInt(scan.nextLine());
        String[][] matrix = new String[size][size];


        for (int row = 0; row < matrix.length; row++) {
            String rowInfo = scan.nextLine();
            for (int column = 0; column < matrix.length; column++) {
                matrix[row][column] = String.valueOf(rowInfo.charAt(column));
            }
        }
        int[] playerPosition = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column].equals("P")) {
                    playerPosition[0] = row;
                    playerPosition[1] = column;
                }
            }
        }
        int playerRow = playerPosition[0];
        int playerColumn = playerPosition[1];
        int newRow = 0;
        int newCol = 0;
        boolean hasWon = false;
        while (commandsCount-- > 0) {
            String command = scan.nextLine();
            //up, down, left, right
            switch (command) {
                case "up":
                    newRow = checkIfItsOutside(playerRow - 1, size);
                    newCol = checkIfItsOutside(playerColumn, size);
                    if (matrix[newRow][newCol].equals("B")) {
                        newRow = checkIfItsOutside(playerRow - 2, size);
                        newCol = checkIfItsOutside(playerColumn, size);
                    }

                    break;
                case "down":
                    newRow = checkIfItsOutside(playerRow +1, size);
                    newCol = checkIfItsOutside(playerColumn, size);
                    if (matrix[newRow][newCol].equals("B")) {
                        newRow = checkIfItsOutside(playerRow + 2, size);
                        newCol = checkIfItsOutside(playerColumn, size);
                    }
                    break;
                case "left":
                    newRow = checkIfItsOutside(playerRow, size);
                    newCol = checkIfItsOutside(playerColumn - 1, size);
                    if (matrix[newRow][newCol].equals("B")) {
                        newRow = checkIfItsOutside(playerRow, size);
                        newCol = checkIfItsOutside(playerColumn - 2, size);
                    }
                    break;
                case "right":
                    newRow = checkIfItsOutside(playerRow, size);
                    newCol = checkIfItsOutside(playerColumn + 1, size);
                    if (matrix[newRow][newCol].equals("B")) {
                        newRow = checkIfItsOutside(playerRow, size);
                        newCol = checkIfItsOutside(playerColumn + 2, size);
                    }
                    break;
            }
            if (matrix[newRow][newCol].equals("T")) {
                newRow = playerRow;
                newCol = playerColumn;
            } else {
                if (matrix[newRow][newCol].equals("F")) {
                    hasWon = true;
                }
            }
            matrix[playerRow][playerColumn] = ".";
            matrix[newRow][newCol] = "P";
            playerRow = newRow;
            playerColumn = newCol;
        }

        if (hasWon) {
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static int checkIfItsOutside(int value, int size) {
        if (value < 0) {
            value = size - 1;
        } else if (value >= size) {
            value = 0;
        }
        return value;
    }

    private static boolean isRowOutOfBounds(int newRow) {
        return newRow < 0;
    }
}
