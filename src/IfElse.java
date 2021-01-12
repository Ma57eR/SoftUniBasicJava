import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        //1st case

//        Scanner scan = new Scanner(System.in);
//
//        int grade = Integer.parseInt(scan.nextLine());
//
//        if (grade >= 5) {
//            System.out.println("Excellent!");
//        }


//        //2nd case
//
//        Scanner scan = new Scanner(System.in);
//
//        int a = Integer.parseInt(scan.nextLine());
//        int b = Integer.parseInt(scan.nextLine());
//
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

        //3rd

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int evenOdd = num % 2;

        if (evenOdd == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }






    }


}
