package CodingBat.Logic;

import java.util.Scanner;

public class caughtSpeeding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
        //int value: 0=no ticket, 1=small ticket, 2=big ticket
        int ticket = 0;
        if (!isBirthday) {

            if (speed <= 60) {
            } else if (speed <= 80) {
                ticket = 1;
            } else {
                ticket = 2;
            }
        } else {
            if (speed <= 65) {
            } else if (speed <= 85) {
                ticket = 1;
            } else {
                ticket = 2;
            }
        }
        return ticket;
    }
}
