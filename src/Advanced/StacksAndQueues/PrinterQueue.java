package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        //Queues offer => добавя
        //Return -> offer
        //Remove -> poll
        Deque<String> queue = new ArrayDeque<>();
        int canceled = 0;

        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(input);
            }

            input = scan.nextLine();
        }
        if (!queue.isEmpty()) {
            for (String document : queue) {
                System.out.println(document);
            }
        }


    }
}
