package FundamentalsSecond.Classes.RandomWords;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sentence = scan.nextLine(). split(" ");
        Random myRandom = new Random();
        String[] tmpArray = new String[sentence.length];
        for (int i = 0; i < sentence.length; i++) {
            int randomIndex = myRandom.nextInt(sentence.length);
            //Взимаме индекса от първия масив
            String temp = sentence[i];
            //Заместваме индекса със случаен
            sentence[i] = sentence[randomIndex];
            //Добавяме на случаен индекс индекса
            sentence[randomIndex] = temp;
        }
        System.out.println(String.join(System.lineSeparator(), sentence));
    }
}
