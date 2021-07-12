package Fundamentals.Beginning;

import java.util.Arrays;
import java.util.Scanner;

public class Trainings {
    public static void main(String[] args) {

        //4.	Reverse an Array of Strings

//        Scanner scan = new Scanner(System.in);
//
//        String[] input = scan.nextLine().split(" ");
//        String temp = "";
//        String reversedInput = "";
//        for (int i = 0; i < input.length / 2; i++) {
//            temp = input[i];
//            input[i] = input[input.length-1-i];
//            input[input.length-1-i] = temp;
//            temp = "";
//        }
//        for (int j = 0; j < input.length; j++) {
//            System.out.print(input[j] + " ");
//        }

        //5.	Even and Odd Subtraction
//        Scanner scan = new Scanner(System.in);
//        String[] input = scan.nextLine().split(" ");
//        int[] numbers = new int[input.length];
//        int sumEven = 0;
//        int sumOdd = 0;
//
//        for (int i = 0; i < input.length; i++) {
//            numbers[i] = Integer.parseInt(input[i]);
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                sumEven += numbers[i];
//            } else {
//                sumOdd += numbers[i];
//            }
//        }
//        System.out.println(sumEven - sumOdd);


        //6.	Equal Arrays

//        Scanner scan = new Scanner(System.in);
//        int[] arr1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] arr2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int sumArr1 = 0;
//        int sumArr2 = 0;
//        boolean diff = false;
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] == arr2[i]) {
//                sumArr1 += arr1[i];
//            } else {
//                diff = true;
//                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
//                break;
//            }
//        }
//        if (!diff) {
//            System.out.printf("Arrays are identical. Sum: %d", sumArr1);
//        }

//        Scanner scan = new Scanner(System.in);
//        int[] arr1 = Arrays.stream(scan.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        String[] arr2 = scan.nextLine().split(" ");
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        System.out.println("Sorted numeric array : "+ Arrays.toString(arr1));
//        System.out.println("Sorted String array : "+ Arrays.toString(arr2));

//        Scanner scan = new Scanner(System.in);
//        int[][] arr1 = new int[10][10];
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.printf("%2d ", arr1[i][j]);
//            }
//            System.out.println();
//        }

    }
}

