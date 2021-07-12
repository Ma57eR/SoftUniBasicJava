package Fundamentals.Beginning;

import java.util.Arrays;
import java.util.Scanner;

public class FundamentalsArrays {

    public static void main(String[] args) {


        //01. Day of Week

//        Scanner scan = new Scanner(System.in);
//        String[] days = {
//
//                "Monday",
//                "Tuesday",
//                "Wednesday",
//                "Thursday",
//                "Friday",
//                "Saturday",
//                "Sunday"};
//        int n = Integer.parseInt(scan.nextLine());
//
//        if (n > 7 || n < 1) {
//            System.out.println("Invalid day!");
//        } else {
//            System.out.println(days[n-1]);
//        }


        //02. Print Numbers in Reverse Order

//        Scanner scan = new Scanner(System.in);
//
//        int loops = Integer.parseInt(scan.nextLine());
//
//        int[] numbers = new int[loops];
//
//        for (int i = numbers.length-1; i >= 0; i--) {
//            numbers[i] = Integer.parseInt(scan.nextLine());
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.printf("%d ",numbers[i]);
//        }


        //03. Sum Even Numbers


//        Scanner scan = new Scanner(System.in);
//        String allNumbers = scan.nextLine();
//        String[] getNumbers = allNumbers.split(" ");
//        int[] numbers = new int[getNumbers.length];
//
//        int sum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//
//            numbers[i] = Integer.parseInt(getNumbers[i]);
//            if (numbers[i] % 2 == 0) {
//                sum+= numbers[i];
//            }
//        }
//        System.out.println(sum);

        //04. Reverse Array of Strings

//        Scanner scan = new Scanner(System.in);
//        String[] normalInput = scan.nextLine().split(" ");
//
//        for (int i = 0; i < normalInput.length/2; i++) {
//            String temp = normalInput[i];
//            normalInput[i] = normalInput[normalInput.length - i - 1];
//            normalInput[normalInput.length -i -1] = temp;
//        }
//
//        for (int i = 0; i < normalInput.length; i++) {
//            System.out.printf("%s ", normalInput[i]);
//        }


        //05. Even and Odd Subtraction
//        Scanner scan = new Scanner(System.in);
//        String[] input = scan.nextLine().split(" ");
//        int[] numbers = new int[input.length];
//        int even = 0;
//        int odd = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(input[i]);
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                even += numbers[i];
//            } else {
//                odd+=numbers[i];
//            }
//        }
//        System.out.println(even-odd);


        //06. Equal Arrays

//        Scanner scan = new Scanner(System.in);
//        int[] array1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] array2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int index = 0;
//        int arraySum = 0;
//
//        for (int i = 0; i <array1.length; i++) {
//            if (array1[i] != array2[i]) {
//                index = i+1;
//                System.out.printf("Arrays are not identical. Found difference at %d index.", index-1);
//                break;
//            } else {
//                arraySum += array1[i];
//            }
//        }
//        if (index == 0) {
//            System.out.printf("Arrays are identical. Sum: %d", arraySum);
//        }


        //07. Condense Array to Number

        Scanner scan = new Scanner(System.in);
        //Инициализираме масив от входа
        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //въртим loop докато дълбжината на масива е с повече от една стойност
        while (input.length > 1) {
            // Инициализираме нов масив, който е с 1 по-къс от оригиналния
            int[] condensed = new int[input.length - 1];
            //Въртим loop, за да съберем двойките числа
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = input[i] + input[i + 1];
            }
            //Присвояваме в първия масив, стойностите от втория като по-този начин намаляваме дължината му с 1
            input = condensed;
        }

        System.out.println(input[0]);


        //!!!!!!!!!!!!!!!!!!! ITER - За FOREACH На масив!!!!!!!!!!!!!!!!!!





    }
}
