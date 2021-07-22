package Fundamentals.AssociativeArrays.Exercise;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;

public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<Integer, String> geeks
                = new TreeMap<Integer, String>();

        // putting values in navigable set
        geeks.put(1, "Guru");
        geeks.put(2, "Ayush");
        geeks.put(3, "Devesh");
        geeks.put(4, "Kashish");

        System.out.println("TreeMap values :- " + geeks);

        // use of descendingKeySet
        NavigableSet nevigableSet
                = geeks.descendingKeySet();

        System.out.println("Reverse key values:- "
                + nevigableSet);

    }
}
