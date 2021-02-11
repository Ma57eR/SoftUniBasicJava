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

//        Scanner scan = new Scanner(System.in);
//        double moneyForVacation = Double.parseDouble(scan.nextLine());
//        double startingMoney = Double.parseDouble(scan.nextLine());
//        String saveOrSpend = scan.nextLine();
//        boolean enoughMoney = true;
//        int count = 0;
//        int lastCount =0;
//        int spend = 0;
//
//        while (enoughMoney) {
//            count++;
//
//            int money = Integer.parseInt(scan.nextLine());
//            if (saveOrSpend.equals("save")) {
//                startingMoney += money;
//                if (startingMoney >= moneyForVacation) {
//                    System.out.printf("You saved the money for %d days.", count);
//                    break;
//                }
//            } else if (saveOrSpend.equals("spend")) {
//                if (startingMoney < money) {
//                    startingMoney = 0;
//                } else {
//               startingMoney -= money;
//                }
//            }
//            if (saveOrSpend.equals("spend")) {
//                spend++;
//                if (spend == 5) {
//                    System.out.println("You can't save the money.");
//                    System.out.println(count);
//                    break;
//                }
//            } else {
//                spend = 0;
//            }
//            saveOrSpend = scan.nextLine();
//
//        }

        //04. Walking

//        Scanner scan = new Scanner(System.in);
//        boolean goHome = false;
//        int steps = 0;
//        int totalSteps = 0;

//        while (!goHome) {
//
//            String input = scan.nextLine();
//
//            if (input.equals("Going home")) {
//                steps = Integer.parseInt(scan.nextLine());
//                totalSteps += steps;
//                if (totalSteps >= 10000) {
//                    System.out.println("Goal reached! Good job!");
//                    System.out.printf("%d steps over the goal!", totalSteps - 10000);
//                } else {
//                    System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
//                    break;
//                }
//                break;
//            }
//
//            steps = Integer.parseInt(input);
//            totalSteps += steps;
//            if (totalSteps >= 10000) {
//                System.out.println("Goal reached! Good job!");
//                System.out.printf("%d steps over the goal!", totalSteps - 10000);
//                break;
//            }
//
//
//        }

        //06. Cake

        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.nextLine());
        int w = Integer.parseInt(scan.nextLine());
        int totalCake = h * w;
        boolean cake = true;

        while (cake) {

            String input = scan.nextLine();
            if (input.equals("STOP")) {
                System.out.printf("%s pieces are left.", totalCake);
                break;
            } else {
                int piece = Integer.parseInt(input);
                totalCake -= piece;
            }



            if (totalCake < 0) {
                System.out.printf("No more cake left! You need %s pieces more.", Math.abs(totalCake));
                break;
            }
        }






    }


}
