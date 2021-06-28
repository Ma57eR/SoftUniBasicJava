package Fundamentals.ListsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());

        reverseList(arrays);
        String output = output(arrays);
        System.out.println(output);

    }



    private static void reverseList(List<String> arrays) {
        for (int index = 0; index < arrays.size() / 2; index++) {
            String last = arrays.get(arrays.size() - index - 1); //Взимаме предишното число
            arrays.remove(arrays.size() - index - 1); // премахваме го
            arrays.add(arrays.size() - index, arrays.get(index)); // добавяме като взимаме числото от индекс
            arrays.remove(index); // премахваме числото от индекс
            arrays.add(index, last); // добавяме предишното число на индекс
        }
    }

    private static String output(List<String> arrays) {
        String removeSpaces = "";
        for (int index = 0; index < arrays.size(); index++) {
            removeSpaces += arrays.get(index) + " ";
        }
        List<String> fixedArray = Arrays.stream(removeSpaces.split("\\s+")).collect(Collectors.toList());
        String output = "";
        int i = 0;
        for (String integer : fixedArray) {

            if (!fixedArray.get(i).equals("")) {
                output += integer + " ";
            }
            i++;
        }
        return output;
    }
}
