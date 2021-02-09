import java.util.Scanner;

public class WhileCycle {
    public static void main(String[] args) {

        //05. Account Balance

//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        double totalMoney = 0;
//
//        while (!input.equals("NoMoreMoney")) {
//            double money = Double.parseDouble(input);
//            if (money >= 0) {
//                System.out.printf("Increase: %.2f%n", money);
//                totalMoney += money;
//                input = scan.nextLine();
//            } else {
//                System.out.printf("Invalid operation!%n");
//                break;
//            }
//
//        }
//        System.out.printf("Total: %.2f", totalMoney);


        //06. Max Number

//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        int max = Integer.MIN_VALUE;
//
//        while (!input.equals("Stop")) {
//            int num = Integer.parseInt(input);
//            if (num >= max) {
//                max = num;
//                input = scan.nextLine();
//            } else {
//                input = scan.nextLine();
//            }
//
//        }
//        System.out.println(max);

        //07. Min Number

//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        int min = Integer.MAX_VALUE;
//
//        while (!input.equals("Stop")) {
//            int num = Integer.parseInt(input);
//            if (num < min) {
//                min = num;
//                input = scan.nextLine();
//            } else {
//                input = scan.nextLine();
//            }
//
//        }
//        System.out.println(min);

        //08. Graduation pt.2

//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        double rating = Double.parseDouble(scan.nextLine());
//        double totalRating = 0;
//        int count = 1;
//        String repeat = "No";
//        int lowRating =0;
//
//
//        while (count <= 12) {
//            if (rating >= 4) {
//                totalRating += rating;
//                if (count < 12) {
//                    rating = Double.parseDouble(scan.nextLine());
//                } else {
//                    break;
//                }
//                count += 1;
//            } else {
//                System.out.printf("%s has been excluded at %d grade", name, count);
//                repeat = "Yes";
//                break;
//            }
//
//
//        }
//        if (!repeat.equals("Yes")) {
//            System.out.printf("%s graduated. Average grade: %.2f", name, totalRating / count);
//        }

        //09. Moving

//        Scanner scan = new Scanner(System.in);
//        int h = Integer.parseInt(scan.nextLine());
//        int w = Integer.parseInt(scan.nextLine());
//        int l = Integer.parseInt(scan.nextLine());
//        int totalSpace = h * w * l;
//        String input = scan.nextLine();
//
//        while (!input.equals("Done")) {
//            int boxes = Integer.parseInt(input);
//
//
//
//            if (boxes > totalSpace) {
//                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(boxes - totalSpace));
//                break;
//            } else {
//                totalSpace -= boxes;
//            }
//
//           input = scan.nextLine();
//        }
//        if (input.equals("Done")) {
//            System.out.printf("%d Cubic meters left.", totalSpace);
//        }




    }
}
