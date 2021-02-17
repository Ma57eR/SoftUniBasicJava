import java.util.Scanner;

public class NestedCycles {

    public static void main(String[] args) {


        //03. Combinations

//        Scanner scan = new Scanner(System.in);
//
//
//        int magicNum = Integer.parseInt(scan.nextLine());
//        int counter = 0;
//
//        for (int i = 0; i <= magicNum; i++) {
//            for (int j = 0; j <= magicNum; j++) {
//                for (int k = 0; k <=magicNum ; k++) {
//
//                    if (i+j+k == magicNum) {
//                        counter++;
//                    }
//
//                }
//
//            }
//
//        }
//        System.out.println(counter);


        //04. Sum of Two Numbers

//        Scanner scan = new Scanner(System.in);
//
//        int startNum = Integer.parseInt(scan.nextLine());
//        int endNum = Integer.parseInt(scan.nextLine());
//        int magicNum = Integer.parseInt(scan.nextLine());
//        int counter = 0;
//        boolean flag = false;
//
//        for (int i = startNum; i <= endNum; i++) {
//            for (int j = startNum; j <= endNum; j++) {
//                counter++;
//                if (i + j == magicNum) {
//                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNum);
//                    flag = true;
//                    break;
//                }
//
//            }
//            if (flag) {
//                break;
//        }
//
//        }
//        if (!flag) {
//            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
//
//        }

        //05. Travelling

//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        double budget = Double.parseDouble(scan.nextLine());
//        boolean enough = false;
//        boolean end = false;
//        double allMoney = 0;
//
//        while (!end) {
//            double savedMoney = Double.parseDouble(scan.nextLine());
//            allMoney += savedMoney;
//
//            if (allMoney >= budget) {
//                System.out.printf("Going to %s!%n", input);
//                input = scan.nextLine();
//
//                if (!input.equals("End")) {
//                    budget = Double.parseDouble(scan.nextLine());
//                }
//                allMoney = 0;
//                if (input.equals("End")) {
//                    end = true;
//                }
//            }
//
//        }

        //06. Building

//        Scanner scan = new Scanner(System.in);
//
//        int floors = Integer.parseInt(scan.nextLine());
//        int currentFloor = floors;
//        int rooms = Integer.parseInt(scan.nextLine());
//
//        for (int i = currentFloor; i > 0; i--) {
//            for (int j = 0; j < rooms; j++) {
//
//                if (currentFloor == floors) {
//                    System.out.printf("L%d%d ",currentFloor, j);
//                } else if (currentFloor % 2 == 0) {
//                    System.out.printf("O%d%d ", currentFloor, j);
//                } else {
//                    System.out.printf("A%d%d ", currentFloor, j);
//                }
//
//           }
//            System.out.printf("%n");
//
//            currentFloor--;
//
//        }


        //07. Cinema Tickets

//        Scanner scan = new Scanner(System.in);
//        String movie = scan.nextLine();
//        int places = Integer.parseInt(scan.nextLine());
//        String ticketType = null;
//        double standard = 0;
//        double student = 0;
//        double kid = 0;
//        int totalTickets = 0;
//
//
//        while (!movie.equals("Finish")) {
//            int standardMovie = 0;
//            int studentMovie = 0;
//            int kidMovie = 0;
//            for (int i = 1; i <= places; i++) {
//                ticketType = scan.nextLine();
//                switch (ticketType) {
//                    case "standard":
//                        standard++;
//                        standardMovie++;
//                        break;
//                    case "student":
//                        student++;
//                        studentMovie++;
//                        break;
//                    case "kid":
//                        kid++;
//                        kidMovie++;
//                        break;
//                }
//                if (ticketType.equals("End")) {
//                    break;
//                }
//                totalTickets++;
//
//
//            }
//            System.out.printf("%s - %.2f%% full.%n", movie, (standardMovie + studentMovie + kidMovie) / (double) places * 100); //% заето за всеки филм
//
//            movie = scan.nextLine();
//            if (!movie.equals("Finish")) {
//                places = Integer.parseInt(scan.nextLine());
//            }
//        }
//        System.out.printf("Total tickets: %d%n", totalTickets);
//        System.out.printf("%.2f%% student tickets.%n", student / totalTickets * 100);
//        System.out.printf("%.2f%% standard tickets.%n", standard / totalTickets * 100);
//        System.out.printf("%.2f%% kids tickets.", kid / totalTickets * 100);


    }
}
