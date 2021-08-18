package FundamentalsSecond.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Long> fibanochi = new ArrayList<>();
        fibanochi.add((long)1);
        fibanochi.add((long)1);
        int num = Integer.parseInt(scan.nextLine());

        if (num > 2) {
            for (int i = 2; i < num; i++) {
                fibanochi.add(fibanochi.get(i - 1) + fibanochi.get(i - 2));
            }
        }
        System.out.println(fibanochi.get(fibanochi.size() - 1));
    }
}
