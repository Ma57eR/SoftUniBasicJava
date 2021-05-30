package Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class FundArrEx {
    public static void main(String[] args) {

        //06. Equal Sums

//        Scanner scan = new Scanner(System.in);
//
//        int[] array1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int sumLeft = 0;
//        int sumRight = 0;
//        int arrayLength = array1.length;
//        boolean flag = false;
//
//        for (int i = 1; i < array1.length; i++) {
//            for (int j = (i-1); j >= 0; j--) {
//                sumLeft += array1[j];
//            }
//            for (int k = (i+1); k < array1.length; k++) {
//                sumRight += array1[k];
//            }
//            if (sumLeft == sumRight) {
//                System.out.println(i);
//                flag = true;
//                sumLeft =0;
//                sumRight =0;
//            }
//            sumLeft =0;
//            sumRight =0;
//        }
//
//        if (!flag && arrayLength != 1) {
//            System.out.println("no");
//        }
//        if (arrayLength == 1) {
//            System.out.println("0");
//        }


        //04 Задача второ решение
//        Scanner scan = new Scanner(System.in);
//        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//        int rotations = Integer.parseInt(scan.nextLine());
//
//        for (int i = 1; i <= rotations; i++) {
//            int firstNum = numbers[0];
//            for (int j = 0; j < numbers.length-1; j++) {
//                numbers[j] = numbers[j + 1];
//            }
//            numbers[numbers.length - 1] = firstNum;
//
//        }
//
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }

        //07. Max Sequence of Equal Elements

//        Scanner scan = new Scanner(System.in);
//        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] myNumber = new int[numbers.length];
//
//        int maxCounter = 0;
//        int longestNumber = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            int counter = 1;
//            for (int j = (i+1); j < numbers.length; j++) {
//                if (numbers[i] == numbers[j]) {
//                    counter += 1;
//                    if (maxCounter < counter) {
//                        maxCounter = counter;
//                        longestNumber = numbers[i];
//                    }
//                } else {
//                    break;
//                }
//            }
//
//        }
//
//        for (int i = 0; i < maxCounter; i++) {
//            System.out.print(longestNumber + " ");
//        }


        //08. Magic Sum

//        Scanner scan = new Scanner(System.in);
//        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int magicNum = Integer.parseInt(scan.nextLine());
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = (i+1); j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == magicNum) {
//                    System.out.println(numbers[i] + " " + numbers[j]);
//                }
//            }
//        }

        //09. Kamino Factory
//        Scanner scan = new Scanner(System.in);
//        int numOfSamples = Integer.parseInt(scan.nextLine());
//        String[] dna = scan.nextLine().split("\\!+");
//        int[] dnanum = Arrays.stream(dna).mapToInt(Integer::parseInt).toArray();
//        int[] bestDNA = new int[numOfSamples];
//        int subseq = 1;
//        int sum = 0;
//        int bestDNASum = 0;
//        int bestDNAIndex = 0;
//        int dnanumber =0;
//        int bestDNANum = 0;
//
//        //Трябва да намерим ДНК с най-много единици
//        //Ако има с еднакъв брой, гледаме кой масив е започнал с първа единица
//        while (!dna.equals("Clone them!")) {
//            sum = Arrays.stream(dnanum).sum();
//            for (int i = 0; i < dnanum.length-1; i++) {
//                if (dnanum[i] + dnanum[i + 1] == 2) {
//                    subseq++;
//                    bestDNAIndex = i;
//                }
//                }
//
//
//
//            dnanumber++;
//            if (bestDNASum < sum) {
//                bestDNASum = sum;
//                bestDNA = dnanum;
//                bestDNANum = dnanumber;
//                for (int i = 0; i < bestDNA.length; i++) {
//                    if (bestDNA[i] == 1) {
//                        bestDNAIndex = i;
//                        break;
//                    }
//                }
//            }
//
//            dna = scan.nextLine().split("\\!+");
//            dnanum = Arrays.stream(dna).mapToInt(Integer::parseInt).toArray();
//        }
////        }
//
//        System.out.printf("Best DNA sample %d with sum: %d", bestDNANum, bestDNAIndex);

        Scanner scan = new Scanner(System.in);
        int dnaSeqLength = Integer.parseInt(scan.nextLine());
        String[] sample = scan.nextLine().split("\\!+");
        int[] dnaNum = Arrays.stream(sample).mapToInt(Integer::parseInt).toArray();
        String bestSample = "";
        int sequence = 0;
        int sum = 1;
        int bestSum = 0;
        int sumSample = 0;
        int bestSumSample = 0;
        int bestseq =Integer.MAX_VALUE;
        int sampleNum = 0;
        int bestSampleNum = 0;
        int dnaIndex = 0;
        int bestDNAIndex = Integer.MAX_VALUE;

        while (!sample.equals("Clone them")) {
            sampleNum++;
            sumSample = Arrays.stream(dnaNum).sum();
            //Една ДНК Проба
            for (int i = 0; i < dnaSeqLength -1; i++) {
                if (dnaNum[i] == 1 && dnaNum[i] == dnaNum[i + 1]) {
                    sum += 1;
                    sequence = i;
                    if (sum == 2) {
                        dnaIndex = i;
                    }


                }
            }
            //Ако сумата на добрите проби е по-голяма или равна на най-добрата
            //И ако първата поредност е по-малка или равна на най-добрата
            if (sum >= bestSum) {
                if (sum == bestSum && dnaIndex < bestDNAIndex) {
                    bestSample = "";
                    bestSum = sum;
                    bestDNAIndex = dnaIndex;
                    for (String s : sample) {
                        bestSample += s + " ";
                    }
                    sum = 1;
                    sequence = 0;
                    bestSampleNum = sampleNum;
                    bestSumSample = sumSample;
                } else if (dnaIndex >= bestDNAIndex) {
                    break;
                } else {
                    bestSample = "";
                    bestSum = sum;
                    bestDNAIndex = dnaIndex;
                    for (String s : sample) {
                        bestSample += s + " ";
                    }
                    sum = 1;
                    sequence = 0;
                    bestSampleNum = sampleNum;
                    bestSumSample = sumSample;
                }
            }

            sample = scan.nextLine().split("\\!+");
            if (sample[0].equals("Clone them")) {
                break;
            }
            dnaNum = Arrays.stream(sample).mapToInt(Integer::parseInt).toArray();
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestSampleNum, bestSumSample);
        System.out.printf("%s", bestSample);

    }
}
