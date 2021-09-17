package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split(" ");
        //2 + 5 + 10 - 2 - 1
        //Нечетните са знаци за операцията
        //Пушваме 0, взимаме 0 + операция + 2
        ArrayDeque<Integer> calc = new ArrayDeque<>();
        calc.push(Integer.parseInt(data[0]));

        for (int index = 1; index < data.length - 1; index++) {
            if (index % 2 != 0) {
                //Нечетни
                String operation = data[index];
                switch (operation) {
                    case "-":
                        calc.push(calc.peek() - Integer.parseInt(data[index + 1]));
                        break;
                    case "+":
                        calc.push(calc.peek() + Integer.parseInt(data[index + 1]));
                        break;
                }
            }
        }
        System.out.println(calc.peek());
    }
}
