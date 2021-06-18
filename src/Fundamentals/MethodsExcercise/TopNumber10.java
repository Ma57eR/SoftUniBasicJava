package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int topNum = topNum(num);
    }

    private static int topNum(int num) {
        boolean divByEight = false;
        boolean IsDivis = divByEight(divByEight, num);
        return 0;
    }
    private static boolean divByEight(boolean divByEight, int num) {
        //Въртим цикъл от 1 до инпут числото
        for (int i = 1; i <= num; i++) {
            int temp = i;
            int sum = 0;
            //Вадим всяка цифра от числото и ги събираме
            while (temp > 0) {
                sum+= temp %10;
                temp = temp / 10;
            }
            //Ако сбора на отделните цифри се дели на 8, влизаме в следващия метод
            if (sum % 8 == 0) {
                boolean isOdd = false;
                boolean oneOdd = oneOdd(isOdd,i);
            }
        }
        return false;
    }

    private static boolean oneOdd(boolean isOdd, int num) {
        boolean reallyOdd = false;
        int temp = num;
        //Разбиваме конкретното число, до което сме стигнали
        while (temp > 0) {
            temp = temp % 10;
            //Проверяваме дали някоя от цифрите не е нечетно число
            if (temp % 2 != 0) {
                reallyOdd = true;
                System.out.println(num);
                return true;
            } else {
                temp = temp / 10;
            }
        }
        return  false;
    }
}