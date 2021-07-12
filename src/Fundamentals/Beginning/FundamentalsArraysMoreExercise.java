package Fundamentals.Beginning;

import java.util.Arrays;
import java.util.Scanner;

public class FundamentalsArraysMoreExercise {
    public static void main(String[] args) {


        //01. Encrypt, Sort and Print Array


//        Scanner scan = new Scanner(System.in);
//
//        //The code of each vowel multiplied by the string length
//        // The code of each consonant divided by the string length
//
//        int num = Integer.parseInt(scan.nextLine());
//
//        int inputSum = 0;
//        int[] sortArray = new int[num];
//        int index = 0;
//        while (index < num) {
//            String input = scan.nextLine();
//
//        for (int i = 0; i < input.length(); i++) {
//            char symbol = input.charAt(i);
//            if ("aeiouAEIOU".indexOf(symbol) >= 0) {
//                inputSum += symbol * input.length();
//            } else {
//                inputSum += symbol / input.length();
//            }
//
//        }
//        sortArray[index] = inputSum;
//        inputSum = 0;
//        index++;
//        //input = scan.nextLine();
//        }
//        Arrays.sort(sortArray);
//
//        for (int i = 0; i < num; i++) {
//            System.out.println(sortArray[i]);
//        }


        //2. Pascal Triangle

        Scanner scan = new Scanner(System.in);
        int numOfRows = Integer.parseInt(scan.nextLine());
        int[] arr1 = new int[numOfRows];
        String[] sArr = new String[numOfRows];
        int temp = 1;

                // Трябва да се направят 2 масива
                // втория масив да е с 1 индекс по-дълъг от първия
                // всеки индекс от втория масив взима събраната стойност от същия индекс и предишния от първия масив
                // първия масив присвоява стойността на вторя масив

        for (int i = 1; i <= arr1.length; i++) {
            int line = i;
            arr1[i-1] = line;
            sArr[i-1] = String.valueOf(line);
            System.out.println(sArr[i-1]);





        }



    }

}
