package Advanced.StacksAndQueues.Exercises;

import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int num = input[0];
        int numsForRemove = input[1];
        int numForCheck = input[2];
        int[] numsForStack = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> smallestNum = new LinkedList<>();

        for (int index = 0; index < num; index++) {
            stack.push(numsForStack[index]);
        }
        for (int remove = 0; remove < numsForRemove; remove++) {
            stack.pop();
        }

        if (stack.contains(numForCheck)) {
            System.out.println("true");
        } else {
            for (int i = 0; i < stack.size(); i++) {
                smallestNum.add(stack.pop());

            }
        }
        if (!smallestNum.isEmpty()) {
            Collections.sort(smallestNum);
            System.out.println(smallestNum.get(0));
        } else if (!stack.contains(numForCheck)) {
            System.out.println(0);
        }
    }
}
