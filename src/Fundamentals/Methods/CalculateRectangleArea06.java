package Fundamentals.Methods;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String myNewName = returnName(scan);
//        System.out.println(myNewName);

//        Scanner scan = new Scanner(System.in);
//        int area = area(scan);
//        System.out.println(area);

        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int area = rectArea(width, height);
        System.out.println(area);



    }

    private static int rectArea(int width, int heigth) {
        return heigth * width;
    }

//    private static int area(Scanner scan) {
//        int a = Integer.parseInt(scan.nextLine());
//        int b = Integer.parseInt(scan.nextLine());
//        return a * b;
//    }

//    private static String returnName(Scanner scan) {
//        String firstName = scan.nextLine();
//        String lastName = scan.nextLine();
//        return firstName + " " + lastName; // Return приключва метода като му дава стойност
//    }
}
