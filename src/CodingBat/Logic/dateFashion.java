package CodingBat.Logic;

import java.util.Scanner;

public class dateFashion {
    public static void main(String[] args) {

    }
    public int dateFashion(int you, int date) {
//you 0 - 10
//date 0 - 10 - your date

        int result = 0;
        int min = Math.min(you, date);
        int max = Math.max(you, date);
        if (min > 2 && max >= 8) {
            result  = 2;
        } else if (min > 2 && max < 8) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

}
