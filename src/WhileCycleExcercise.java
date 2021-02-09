import java.util.Scanner;

public class WhileCycleExcercise {
    public static void main(String[] args) {

        //01. Old Books

//        Scanner scan = new Scanner(System.in);
//
//        String bookName = scan.nextLine();
//        String books = scan.nextLine();
//        int count = 1;
//
//        while (!books.equals(bookName)) {
//
//             if (books.equals("No More Books")) {
//                System.out.println("The book you search is not here!");
//                count -= 1;
//                System.out.printf("You checked %d books.", count);
//                break;
//            }
//            books = scan.nextLine();
//            count += 1;
//        }
//
//        if (books.equals(bookName)) {
//            count -= 1;
//            System.out.printf("You checked %d books and found it.",count);
//        }

        //02. Exam Preparation

//        Scanner scan = new Scanner(System.in);
//        int maxLowRate = Integer.parseInt(scan.nextLine());
//        String zadacha = scan.nextLine();
//        String lastZadacha = zadacha;
//        int count = 0;
//        int lowRate = 0;
//        double allRatings = 0;
//
//        while (!zadacha.equals("Enough")) {
//            lastZadacha = zadacha;
//            int rate = Integer.parseInt(scan.nextLine());
//
//            if (rate <= 4) {
//                lowRate += 1;
//            }
//            allRatings += rate;
//            if (lowRate == maxLowRate) {
//                System.out.printf("You need a break, %d poor grades.", lowRate);
//                break;
//            }
//
//            count++;
//            zadacha = scan.nextLine();
//        }
//        if (zadacha.equals("Enough")) {
//            System.out.printf("Average score: %.2f%n", allRatings / count);
//            System.out.printf("Number of problems: %d%n", count);
//            System.out.printf("Last problem: %s", lastZadacha);
//        }


        //03. Vacation

        Scanner scan = new Scanner(System.in);
        double moneyForVacation = Double.parseDouble(scan.nextLine());
        double startingMoney = Double.parseDouble(scan.nextLine());
        String saveOrSpend = scan.nextLine();
        boolean enoughMoney = true;
        int count = 0;
        int lastCount =0;
        int spend = 0;

        while (enoughMoney) {
            count++;

            int money = Integer.parseInt(scan.nextLine());
            if (saveOrSpend.equals("save")) {
                startingMoney += money;
                if (startingMoney >= moneyForVacation) {
                    System.out.printf("You save the money for %d days.", count);
                    break;
                }
            } else if (saveOrSpend.equals("spend")) {
                if (startingMoney < money) {
                    startingMoney = 0;
                } else {
               startingMoney -= money;
                }
            }
            if (saveOrSpend.equals("spend")) {
                spend++;
                if (spend == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(count);
                    break;
                }
            }
            saveOrSpend = scan.nextLine();

        }


    }


}
