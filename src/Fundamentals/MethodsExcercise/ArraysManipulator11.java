package Fundamentals.MethodsExcercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysManipulator11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] commandTypes = scan.nextLine().split(" ");
        String command = commandTypes[0];

        while (!command.equals("end")) {
            switch (command) {
                case "exchange":
                    int exchangeIndex = Integer.parseInt(commandTypes[1]);
                    if (isValidIndex(exchangeIndex, num.length)) {
                        exchange(num, exchangeIndex);
                    } else {
                        System.out.println("Invalid number");
                    }
                    break;
                case "max":
                    if (commandTypes[1].equals("even")) {
                        maxEven(num);
                    } else {
                        maxOdd(num);
                    }
                    break;
                case "min":
                    if (commandTypes[1].equals("even")) {
                        minEven(num);
                    } else {
                        minOdd(num);
                    }
                    break;
                case "first":
                    if (commandTypes[2].equals("even")) {
                        int count = Integer.parseInt(commandTypes[1]);
                        if (isCountOK(count, num.length)) {
                            countEven(num, count);
                        }
                    } else {
                        int count = Integer.parseInt(commandTypes[1]);
                        if (isCountOK(count, num.length)) {
                            countOdd(num, count);
                        }
                    }

                    break;
                case "last":
                    break;
            }
            scan.nextLine();
        }


    }


    private static boolean isValidIndex(int exchangeIndex, int length) {
        return length > exchangeIndex && exchangeIndex >= 0;
    }

    private static void exchange(int[] num, int exchangeIndex) {
        int[] numbersToExchangeIndex = new int[exchangeIndex + 1];
        int[] numbersAfterExchanging = new int[num.length - numbersToExchangeIndex.length];
        int[] exchangedArray = new int[num.length];
        //Взимаме индексите до числото, което ни е дадено
        for (int index = 0; index <= exchangeIndex; index++) {
            int currentElement = num[index];
            numbersToExchangeIndex[index] = currentElement;
        }
        //взимаме числата след числото, което ни е дадено
        for (int index = exchangeIndex + 1; index <= num.length - 1; index++) {
            int currentElement = num[index];
            numbersAfterExchanging[index - exchangeIndex - 1] = currentElement;
        }
        //вкарваме ги в новия масив
        for (int index = 0; index < numbersAfterExchanging.length; index++) {
            exchangedArray[index] = numbersAfterExchanging[index];
        }
        //вкарваме и втората половина
        for (int index = numbersAfterExchanging.length - numbersToExchangeIndex.length - 1; index < numbersToExchangeIndex.length; index++) {
            int currentElement = num[index];
            exchangedArray[index + numbersAfterExchanging.length] = currentElement;

        }
        num = exchangedArray;
    }

    private static void maxEven(int[] num) {
        int maxEvenIndex = 0;
        int tempEven = Integer.MIN_VALUE;
        int count = 0;
        for (int index = 0; index < num.length; index++) {
            if (num[index] % 2 == 0) {
                count++;
                if (num[index] >= tempEven) {
                    tempEven = num[index];
                    maxEvenIndex = index;
                }
            }
        }

        if (count > 0) {
            System.out.println(maxEvenIndex);
        } else {
            System.out.println("No matches");
        }

    }

    private static void maxOdd(int[] num) {
        int maxOddIndex = 0;
        int tempOdd = Integer.MIN_VALUE;
        int count = 0;
        for (int index = 0; index < num.length; index++) {
            if (num[index] % 2 != 0) {
                count++;
                if (num[index] >= tempOdd) {
                    tempOdd = num[index];
                    maxOddIndex = index;
                }
            }
        }
        if (count > 0) {
            System.out.println(maxOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static void minEven(int[] num) {
        int minEvenIndex = 0;
        int tempEven = Integer.MAX_VALUE;
        int count = 0;
        for (int index = 0; index < num.length; index++) {
            if (num[index] % 2 == 0) {
                count++;
                if (num[index] <= tempEven) {
                    tempEven = num[index];
                    minEvenIndex = index;
                }
            }
        }
        if (count > 0) {
            System.out.println(minEvenIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static void minOdd(int[] num) {
        int minOddIndex = 0;
        int tempOdd = Integer.MAX_VALUE;
        int count = 0;
        for (int index = 0; index < num.length; index++) {
            if (num[index] % 2 != 0) {
                count++;
                if (num[index] <= tempOdd) {
                    tempOdd = num[index];
                    minOddIndex = index;
                }
            }
        }
        if (count > 0) {
            System.out.println(minOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static boolean isCountOK(int countEven, int length) {
        return countEven >= 0 && countEven <= length;
    }

    private static void countEven(int[] num, int count) {
        int countEven = 1;
        for (int index = 0; index < num.length; index++) {
            if (num[index] % 2 == 0) {
                countEven++;
            }
        }
        if (countEven < 2) {
            System.out.println("[]");
        } else {
            int[] evens = new int[countEven - 1];
            int newEvenIndex = 0;
            for (int index = 0; index < num.length; index++) {
                if (num[index] % 2 == 0) {
                    evens[newEvenIndex] = num[index];
                    newEvenIndex++;
                }
            }
            System.out.println(Arrays.toString(evens));
        }
    }

    private static void countOdd(int[] num, int count) {
        int countOdd = 1;
        for (int index = 0; index < num.length; index++) {
            if (num[index] % 2 != 0) {
                countOdd++;
            }
        }
        if (countOdd < 2) {
            System.out.println("[]");
        } else {
            int[] odds = new int[countOdd - 1];
            int newOddIndex = 0;
            for (int index = 0; index < num.length; index++) {
                if (num[index] % 2 != 0) {
                    odds[newOddIndex] = num[index];
                    newOddIndex++;
                }
            }
            System.out.println(Arrays.toString(odds));
        }
    }


}
