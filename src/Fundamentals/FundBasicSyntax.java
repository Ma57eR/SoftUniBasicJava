package Fundamentals;

import java.util.Scanner;

public class FundBasicSyntax {
    public static void main(String[] args) {

        //05. Login

//        Scanner scan = new Scanner(System.in);
//        String username = scan.nextLine();
//        String input = scan.nextLine();
//        String bakward = "";
//        int count =0;
//        boolean blocked = false;
//
//        while (!blocked) {
//
//        for (int i = input.length() - 1; i >= 0 ; i--) {
//            bakward += input.charAt(i);
//        }
//        if (username.equals(bakward)) {
//            System.out.printf("User %s logged in.", username);
//            break;
//        } else {
//            count++;
//            bakward = "";
//        }
//        if (count != 4) {
//            System.out.println("Incorrect password. Try again.");
//            input = scan.nextLine();
//        } else {
//            System.out.printf("User %s blocked!", username);
//            break;
//        }
//        }

        //06. Strong Number

//        Scanner scan = new Scanner(System.in);
//        int fact = 1;
//        int num = Integer.parseInt(scan.nextLine());
//        int initialNum = num;
//        int facnum = 0;
//        int sum = 0;
//        int totalfacnum = 0;
//
//        while (num > 1) {
//            //Взимаме всяка цифра от числото
//            sum += (num % 10);
//            facnum = (num % 10);
//            num = num / 10;
//
//
//
//            //Въртим факториел на тази цифра
//            for (int i = 1; i <= facnum; i++) {
//                fact *= i;
//            }
//
//            if (facnum > 0) {
//                totalfacnum += fact;
//            }
//            fact = 1;
//        }
//        totalfacnum+=1;
//        if (initialNum == totalfacnum) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }

        //07. Vending Machine

//        Scanner scan = new Scanner(System.in);
//        String insertedCoins = scan.nextLine();
//        double totalCoins = 0;
//        boolean start = false;
//        boolean end = false;
//        String product = "";
//
//        while (!start) {
//            double coins = Double.parseDouble(insertedCoins);
//            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2) {
//                totalCoins += coins;
//            } else{
//                System.out.printf("Cannot accept %.2f%n", coins);
//            }
//             insertedCoins = scan.nextLine();
//            if (insertedCoins.equals("Start")) {
//            start = true;
//            }
//        }
//        while (!end) {
//            product = scan.nextLine();
//            if (product.equals("End")) {
//                break;
//            }
//            switch (product) {
//                case "Nuts":
//                    if (totalCoins - 2.0 >= 0) {
//                        System.out.printf("Purchased %s%n", product);
//                        totalCoins -= 2.0;
//                    } else {
//                        System.out.println("Sorry, not enough money");
//                    }
//                    break;
//
//                case "Water":
//                    if (totalCoins - 0.7 >= 0) {
//                        System.out.printf("Purchased %s%n", product);
//                        totalCoins -= 0.7;
//                    } else {
//                        System.out.println("Sorry, not enough money");
//                    }
//                    break;
//
//                case "Crisps":
//                    if (totalCoins - 1.5 >= 0) {
//                        System.out.printf("Purchased %s%n", product);
//                        totalCoins -= 1.5;
//                    } else {
//                        System.out.println("Sorry, not enough money");
//                    }
//                    break;
//
//                case "Soda":
//                    if (totalCoins - 0.8 >= 0) {
//                        System.out.printf("Purchased %s%n", product);
//                        totalCoins -= 0.8;
//                    } else {
//                        System.out.println("Sorry, not enough money");
//                    }
//                    break;
//
//                case "Coke":
//                    if (totalCoins - 1.0 >= 0) {
//                        System.out.printf("Purchased %s%n", product);
//                        totalCoins -= 1.0;
//                    } else {
//                        System.out.println("Sorry, not enough money");
//                    }
//                    break;
//                default:
//                    System.out.println("Invalid product");
//            }
//        }
//
//        System.out.printf("Change: %.2f", totalCoins);


        //08. Triangle of Numbers

//        Scanner scan = new Scanner(System.in);
//        int num = Integer.parseInt(scan.nextLine());
//        int start = 1;
//
//        while (start <= num) {
//            for (int i = 1; i <= start; i++) {
//                System.out.printf("%d ", start);
//            }
//        start++;
//            System.out.println();
//        }

        //09. Padawan Equipment

//        Scanner scan = new Scanner(System.in);
//        double budget = Double.parseDouble(scan.nextLine());
//        int numOfStudents = Integer.parseInt(scan.nextLine());
//        double saberPrice = Double.parseDouble(scan.nextLine());
//        double totalSaber = 0;
//        double robesPrice = Double.parseDouble(scan.nextLine());
//        double totalRobes = 0;
//        double beltsPrice = Double.parseDouble(scan.nextLine());
//        double totalBelts = 0;
//        double totalPrice = 0;
//
//       totalSaber = ((Math.ceil(numOfStudents * 0.1) + numOfStudents) * saberPrice);
//       totalRobes = numOfStudents * robesPrice;
//        if (numOfStudents < 6) {
//            totalBelts = numOfStudents * beltsPrice;
//        } else {
//            totalBelts = (numOfStudents - (Math.ceil(numOfStudents / 6))) * beltsPrice;
//        }
//        totalPrice = totalBelts + totalRobes + totalSaber;
//
//        if (budget >= totalPrice) {
//            System.out.printf("The money is enough - it would cost %.2f lv.", totalPrice);
//        } else {
//            System.out.printf("George Lucas will need %.2f lv more", Math.abs(budget - totalPrice));
//        }


        //10. Rage Expenses

//        Scanner scan = new Scanner(System.in);
//        int lostGames = Integer.parseInt(scan.nextLine());
//        double headsetPrice = Double.parseDouble(scan.nextLine());
//        double mousePrice = Double.parseDouble(scan.nextLine());
//        double keyboardPrice = Double.parseDouble(scan.nextLine());
//        double displayPrice = Double.parseDouble(scan.nextLine());
//        int headsetCount = 0;
//        int mouseCount = 0;
//        int keyboardCount = 0;
//        int displayCount = 0;
//        double totalPrice;
//
//        for (int i = 1; i <= lostGames; i++) {
//            if (i % 2 == 0) {
//                headsetCount++;
//            }
//            if (i % 3 == 0) {
//                mouseCount++;
//            }
//            if (i % 3 == 0 && i % 2 == 0) {
//                keyboardCount++;
//                if (keyboardCount % 2 == 0) {
//                    displayCount++;
//                }
//            }
//        }
//
//        totalPrice = (double) headsetPrice * (double)headsetCount + (double)mousePrice * (double)mouseCount+ (double)keyboardPrice * (double)keyboardCount + (double)displayPrice * (double) displayCount;
//
//        System.out.printf("Rage expenses: %.2f lv.", totalPrice);


        //MORE EXERCISE - 01. Sort Numbers

//        Scanner scan = new Scanner(System.in);
//
//        int num1 = Integer.parseInt(scan.nextLine());
//        int num2 = Integer.parseInt(scan.nextLine());
//        int num3 = Integer.parseInt(scan.nextLine());
//        int max = 0;
//        if (num1 > num2 && num1 > num3) {
//            max = num1;
//        }
//        if (num2 > num1 && num2 > num3) {
//            max = num2;
//        }
//        if (num3 > num2 && num3 > num1) {
//            max = num3;
//        }
//
//
//        //3, 1, 4
//        if (num1 > num2 && num1 > num3 && num2 > num3) {
//            System.out.println(num1);
//            System.out.println(num2);
//            System.out.println(num3);
//        } if (num1 > num2 && num1 > num3 && num2 < num3) {
//            System.out.println(num1);
//            System.out.println(num3);
//            System.out.println(num2);
//        }  if (num2 >= num1 && num2 > num3 && num1 > num3) {
//            System.out.println(num2);
//            System.out.println(num1);
//            System.out.println(num3);
//        }  if (num2 > num1 && num2 > num3 && num1 < num3) {
//            System.out.println(num2);
//            System.out.println(num3);
//            System.out.println(num1);
//        }  if (num3 > num1 && num3 > num2 && num2 > num1) {
//            System.out.println(num3);
//            System.out.println(num2);
//            System.out.println(num1);
//        }
//        if (num3 > num1 && num3 > num2 && num2 < num1) {
//            System.out.println(num3);
//            System.out.println(num1);
//            System.out.println(num2);
//        } if (num1 == num2 || num2 == num3 || num1 == num3){
//            System.out.println(max);
//            System.out.println("0");
//            System.out.println("0");
//        }


        //MORE 02. English Name of the Last Digit

//        Scanner scan = new Scanner(System.in);
//        String number = scan.nextLine();
//        int num = Integer.parseInt(number);
//
//        num %= 10;
//        number = String.valueOf(num);
//
//        switch (number) {
//            case "1":
//                System.out.println("one");
//                break;
//
//            case "2":
//                System.out.println("two");
//                break;
//
//            case "3":
//                System.out.println("three");
//                break;
//
//            case "":
//                System.out.println("four");
//                break;
//
//            case "5":
//                System.out.println("five");
//                break;
//
//            case "6":
//                System.out.println("six");
//                break;
//
//            case "7":
//                System.out.println("seven");
//                break;
//
//            case "8":
//                System.out.println("eight");
//                break;
//
//            case "9":
//                System.out.println("nine");
//                break;
//
//            case "0":
//                System.out.println("zero");
//                break;
//
//        }

        //MORE 03. Gaming Store

//        Scanner scan = new Scanner(System.in);
//        double balance = Double.parseDouble(scan.nextLine());
//        String game = scan.nextLine();
//        double price = 0;
//        double totalSpent = 0;
//
//
//        while (!game.equals("Game Time")) {
//            switch (game) {
//                case "OutFall 4":
//
//                case "RoverWatch Origins Edition":
//                    if (balance >= 39.99) {
//                        balance -= 39.99;
//                        totalSpent += 39.99;
//                        System.out.printf("Bought %s%n", game);
//                    } else {
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//
//                case "CS: OG":
//                    if (balance >= 15.99) {
//                        balance -= 15.99;
//                        totalSpent += 15.99;
//                        System.out.printf("Bought %s%n", game);
//                    } else {
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//
//                case "Zplinter Zell":
//                    if (balance >= 19.99) {
//                        balance -= 19.99;
//                        totalSpent += 19.99;
//                        System.out.printf("Bought %s%n", game);
//                    } else {
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//
//                case "Honored 2":
//                    if (balance >= 59.99) {
//                        balance -= 59.99;
//                        totalSpent += 59.99;
//                        System.out.printf("Bought %s%n", game);
//                    } else {
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//
//                case "RoverWatch":
//                    if (balance >= 29.99) {
//                        balance -= 29.99;
//                        totalSpent += 29.99;
//                        System.out.printf("Bought %s%n", game);
//                    } else {
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//                default:
//                    System.out.println("Not Found");
//            }
//            if (balance == 0) {
//                System.out.println("Out of money!");
//                break;
//            }
//            game = scan.nextLine();
//        }
//        if (balance != 0) {
//            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, balance);
//        }


        //MORE 04. Reverse String

//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        String reverse = "";
//
//        for (int i = name.length() -1; i >= 0; i--) {
//            reverse += name.charAt(i);
//        }
//        System.out.println(reverse);

        //MORE 05. Messages

        Scanner scan = new Scanner(System.in);
        int lettersNum = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());
        String numm = String.valueOf(num);
        String word = "";
        int mainDigit = num;
        int offset = 0;
        int index = 0;

        for (int i = 0; i < lettersNum; i++) {


        for (int j = 1; j < numm.length() ; j++) {
            mainDigit = mainDigit/10;
        }
        offset = (mainDigit - 2) * 3;
        index = (offset + numm.length() - 1)+97;
            if (mainDigit == 8 || mainDigit == 9) {
                index+=1;
            }
            if (mainDigit == 0) {
                index = 32;
            }
        char symbol = (char)index;
        word += symbol;

        offset = 0;
        index = 0;
            if (lettersNum-1 == i) {
                break;
            }
        num = Integer.parseInt(scan.nextLine());
        numm = String.valueOf(num);
        mainDigit = num;
        }
        System.out.println(word);




    }
}
