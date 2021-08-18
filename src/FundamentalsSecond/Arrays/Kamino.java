package FundamentalsSecond.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Kamino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lengthOfDNA = Integer.parseInt(scan.nextLine());
        String[] input = scan.nextLine().split("!+");
        int bestCount = 0;
        int bestIndex = -1;
        int[] bestDNA = new int[lengthOfDNA];
        int sumOfBestSample = -1;
        int numOfBestSample = -1;
        int numOfSample = 0;

        while (!input[0].equals("Clone them")) {
                int count = 1;
                int index = -1;
                numOfSample++;

                for (int i = 0; i < input.length-1; i++) {
                //Ако индекса е равен на следващия, увеличаваме брояча
                if (input[i].equals(input[i+1]) && input[i].equals("1")) {
                    count++;
                    index = i;
                }
                //Ако бройката е по-голяма от досегашния бест -> записваме в bestDNA
                if (count > bestCount) {
                    bestDNA = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
                    bestIndex = index;
                    bestCount = count;
                    sumOfBestSample = Arrays.stream(input).mapToInt(Integer::parseInt).sum();
                    numOfBestSample = numOfSample;
                }
                //Ако последователността е същата бройка, гледаме кой има по-ранен индекс
                if (count == bestCount && index < bestIndex) {
                    bestDNA = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
                    bestIndex = index;
                    sumOfBestSample = Arrays.stream(input).mapToInt(Integer::parseInt).sum();
                    numOfBestSample = numOfSample;
                }
                //Ако броя и индексите са еднакви, гледаме кой има по-голяма сума
                if (count == bestCount && index == bestIndex) {
                    int currentSum = Arrays.stream(input).mapToInt(Integer::parseInt).sum();
                    if (currentSum > sumOfBestSample) {
                        bestDNA = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
                        numOfBestSample = numOfSample;
                    }
                }
            }


            input = scan.nextLine().split("!+");
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", numOfBestSample, sumOfBestSample);
        StringBuilder output = new StringBuilder();
        for (int j : bestDNA) {
            output.append(j).append(" ");
        }
        System.out.println(output);

    }
}
