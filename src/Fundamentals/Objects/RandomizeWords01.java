package Fundamentals.Objects;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sentence = scan.nextLine().split(" ");

        Random myRandom = new Random();

        for (int i = 0; i < sentence.length; i++) {

            //Генерираме случаен индекс
            int randomIndex = myRandom.nextInt(sentence.length);
            String temp = sentence[i];
            sentence[i] = sentence[randomIndex];
            sentence[randomIndex] = temp;
        }

        for (String word : sentence) {
            System.out.println(word);
        }
    }
}
