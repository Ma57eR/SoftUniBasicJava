package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque();

        if (decimal == 0) {
            System.out.println("0000");
        } else {

            while (decimal != 0) {
                stack.push(decimal % 2);
                decimal /= 2;
            }
            if (!stack.isEmpty()) {
                for (int num : stack) {
                    System.out.print(stack.pop());
                }
            }
        }
    }
}
