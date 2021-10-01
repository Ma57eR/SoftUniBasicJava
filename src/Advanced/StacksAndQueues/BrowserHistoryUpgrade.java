package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Deque<String> historyStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("forward")) {
                if (forwardStack.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                //Махам от стек и добавям в друг стек
                    System.out.println(forwardStack.peek());
                    historyStack.push(forwardStack.pop());
                }
            } else if (input.equals("back")) {
                if (historyStack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    forwardStack.push(historyStack.pop());
                    System.out.println(historyStack.peek());
                }
            } else {
                historyStack.push(input);
                //Когато има нормална команда, винаги чистя Forward хисторито
                forwardStack.clear();
                System.out.println(historyStack.peek());
            }


            input = scan.nextLine();
        }

    }
}
