package Exams.Old;

import java.util.Scanner;

public class April2019 {

    public static void main(String[] args) {

        //01. Oscars ceremony

//        Scanner scan = new Scanner(System.in);
//
//        int rent = Integer.parseInt(scan.nextLine());
//
//        double statuetki = rent * 0.7;
//        double katering = statuetki * 0.85;
//        double sound = katering * 0.5;
//        double total = statuetki + katering + sound + rent;
//
//        System.out.printf("%.2f", total);

        //03. Oscars week in cinema

        Scanner scan = new Scanner(System.in);
        double ticketPrice = 0;
        String movieName = scan.nextLine();
        String ticketType = scan.nextLine();
        int soldTickets = Integer.parseInt(scan.nextLine());

        switch (movieName) {
            case "A Star Is Born":
                if (ticketType.equals("normal")) {
                    ticketPrice = 7.5;
                } else if (ticketType.equals("luxury")) {
                    ticketPrice = 10.5;
                } else if (ticketType.equals("ultra luxury")) {
                    ticketPrice = 13.5;
                }
                break;

            case "Bohemian Rhapsody":
                if (ticketType.equals("normal")) {
                    ticketPrice = 7.35;
                } else if (ticketType.equals("luxury")) {
                    ticketPrice = 9.45;
                } else if (ticketType.equals("ultra luxury")) {
                    ticketPrice = 12.75;
                }
                break;

            case "Green Book":
                if (ticketType.equals("normal")) {
                    ticketPrice = 8.15;
                } else if (ticketType.equals("luxury")) {
                    ticketPrice = 10.25;
                } else if (ticketType.equals("ultra luxury")) {
                    ticketPrice = 13.25;
                }
                break;

            case "The Favourite":
                if (ticketType.equals("normal")) {
                    ticketPrice = 8.75;
                } else if (ticketType.equals("luxury")) {
                    ticketPrice = 11.55;
                } else if (ticketType.equals("ultra luxury")) {
                    ticketPrice = 13.95;
                }
                break;

        }

        System.out.printf("%s -> %.2f lv.", movieName, ticketPrice*soldTickets);




    }
}
