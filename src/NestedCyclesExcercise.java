import java.util.Scanner;

public class NestedCyclesExcercise {
    public static void main(String[] args) {


        //01. Number Pyramid

//        Scanner scan = new Scanner(System.in);
//        int num = Integer.parseInt(scan.nextLine());
//        int counter = 0;
//        for (int row = 1; row <= num; row++) {
//
//            for (int col = 1; col <= row; col++) {
//
//                counter++;
//                System.out.print(counter + " ");
//                if (counter == num) {
//                    break;
//                }
//            }
//            System.out.println();
//            if (counter == num) {
//                break;
//            }
//        }

        //02. Equal Sums Even Odd Position

//        Scanner scan = new Scanner(System.in);
//
//        int min = Integer.parseInt(scan.nextLine());
//        int max = Integer.parseInt(scan.nextLine());
//        int length = String.valueOf(min).length();
//
//
//
//
//
//
//        for (int i = min; i <= max; i++) {
//            int counter = 1;
//            int sumEven = 0;
//            int sumOdd = 0;
//            for (int j = 0; j < length; j++) {
//                String ch = String.valueOf(i);
//                char symbol = ch.charAt(j);
//                int num = Character.getNumericValue(symbol);
//
//
//                //System.out.println(symbol);
//                if (counter % 2 != 0) {
//                    sumOdd += num;
//                } else {
//                    sumEven += num;
//                }
//                counter++;
//            }
//            if (sumEven == sumOdd) {
//                System.out.printf("%d ",i);
//            }
//
//        }


        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int count = 0;


        for (int i = 1111; i <= 9999; i++) {
            for (int j = 0; j <= 3; j++) {
                String ch = String.valueOf(i);
                char symbol = ch.charAt(j);
                int num2 = Character.getNumericValue(symbol);
                if (num2 !=0) {

                if (num % num2 == 0) {
                    count++;
                }
                }
            }
            if (count == 4) {
                System.out.printf("%d ", i);
            } count = 0;
        }





    }

}
