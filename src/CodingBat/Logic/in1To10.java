package CodingBat.Logic;


import java.util.*;
import java.util.stream.Collectors;

public class in1To10 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2, 4, 3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(5, 6, 4));
        List<Integer> sumList = new ArrayList<>();

        String l1sum = "";
        String l2sum = "";


        for (int i = 0; i < l1.size(); i++) {
            l1sum += l1.get(i);
            l2sum += l2.get(i);
        }
        int n1 = Integer.parseInt(l1sum);
        int n2 = Integer.parseInt(l2sum);
        int sum = n1 + n2;

        for (int i = 0; i < l2.size(); i++) {
            int tmp = 0;
            tmp = sum % 10;
            sumList.add(tmp);
            sum /= 10;
        }

        sumList.forEach(System.out::print);




    }

}
