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

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13);
        stack.push(73);

        System.out.println(stack.peek());


    }
}
