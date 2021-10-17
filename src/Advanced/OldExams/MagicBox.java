package Advanced.OldExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        ArrayDeque<Integer> firstMagixQueue = new ArrayDeque<>();
        ArrayDeque<Integer> secondMagixStack = new ArrayDeque<>();

        int[] firstItems = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondItems = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int item : firstItems) {
            firstMagixQueue.offer(item);
        }
        for (int item : secondItems) {
            secondMagixStack.push(item);
        }


        ArrayDeque<Integer> claimedItemsQueue = new ArrayDeque<>();
        int claimed = 0;
        while (!firstMagixQueue.isEmpty() && !secondMagixStack.isEmpty()) {

            int currentSum = firstMagixQueue.peek() + secondMagixStack.peek();
            if (currentSum % 2 == 0) {
                claimed += currentSum;
                firstMagixQueue.poll();
                secondMagixStack.pop();
            } else {
                firstMagixQueue.offer(secondMagixStack.pop());
            }
        }
        if (firstMagixQueue.isEmpty()) {
            System.out.println("First magic box is empty.");
        } else if (secondMagixStack.isEmpty()) {
            System.out.println("Second magic box is empty.");
        }
        if (claimed < 90) {
            System.out.println("Poor prey... Value: " + claimed);
        } else {
            System.out.println("Wow, your prey was epic! Value: " + claimed);
        }


    }
}
