package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        //Stack - новия елемент винаги е на върха/последен
        //push - добавя
        //pop - премахване
        //peek - връща последния елемент

        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String input = scan.nextLine();
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                    //stack.pop();
                } else {
                    stack.pop();
                    System.out.println(stack.peek());
                }

            } else {
                stack.push(input);
                System.out.println(stack.peek());
            }

            input = scan.nextLine();
        }
    }
}
