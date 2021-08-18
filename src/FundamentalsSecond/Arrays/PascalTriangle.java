package FundamentalsSecond.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] fArray = new int[1];
        int[] sArray = new int[fArray.length];
        
        fArray[0] = 1;

        int num = Integer.parseInt(scan.nextLine());
        System.out.println(fArray[0]);
        //Въртим броя на редовете
        for (int i = 1; i < num; i++) {
            sArray = new int[fArray.length+1];
            //Първа и последна позиция винаги са 1
            sArray[0] = 1;
            sArray[sArray.length-1] = 1;
            //Добавяме сбора на съседните индекси от горния резултат
            for (int j = 1; j < fArray.length; j++) {
                sArray[j] = fArray[j] + fArray[j-1];
            }
            fArray = sArray;
            StringBuilder output = new StringBuilder();
            for (int index: sArray) {
                output.append(index).append(" ");
            }
            System.out.println(output);
        }
    }
}
