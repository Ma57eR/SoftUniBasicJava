package Fundamentals.Beginning;


import java.util.Arrays;
import java.util.Scanner;

public class JustTrain {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        int num = Integer.parseInt(scan.nextLine());
//        BigDecimal sum = new BigDecimal(0);
//
//        for (int i = 0; i < num; i++) {
//            BigDecimal number = new BigDecimal(scan.nextLine());
//            sum = sum.add(number);
//
//        }
//        System.out.println(sum);


//        Scanner scan = new Scanner(System.in);
//        int[] arr1 = Arrays.
//                stream(scan.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//        int[] arr2 = Arrays.
//                stream(scan.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int index = 0;
//        boolean diff = false;
//        int sum = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] != arr2[i]) {
//                index = i;
//                diff = true;
//                break;
//            } else {
//                sum += arr1[i];
//            }
//
//        }
//
//        if (diff) {
//            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
//        } else {
//            System.out.printf("Arrays are identical. Sum: %d", sum);
//        }

        Scanner scan = new Scanner(System.in);
        String nameCheck = scan.nextLine();
        char symbol = nameCheck.charAt(0);
        System.out.println(symbol+0);

    }
}
