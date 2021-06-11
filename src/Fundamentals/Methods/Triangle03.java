package Fundamentals.Methods;

import java.util.Scanner;

public class Triangle03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        //Извикваме първо метода за горната част на триъгълника
        upperHalf(num);
        //Извикваме първо метода за долната част на триъгълника
        bottomHalf(num);
    }

    public static void upperHalf(int num) {
        //Върти се цикъл от 1 до цифрата подадена на входа (височината на триъгълника)
        for (int i = 1; i < num; i++) {
            //Извикваме метода за принтиране на триъгълника
            printLine(i);
        }
    }

    public static void bottomHalf(int num) {
        //Въртим се цикъл от височината на триъгълника до 1
        for (int i = num; i >=1 ; i--) {
            //Извикваме метода за принтиране на триъгълника
            printLine(i); //Дава число за параметър на метода
        }
    }

    public static void printLine(int i) {
        //Принтира редовете с броя цифри на триъгълника. i е за дължината на конкретния ред
        for (int number = 1; number <= i; number++) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
