package Fundamentals.AssociativeArrays;

import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] name = {"1", "2", "3" };
        int[] arr = Arrays.stream(name).mapToInt(Integer::parseInt).toArray();


    }
}
