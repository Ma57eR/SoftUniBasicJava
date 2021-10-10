package Advanced.Classes.BankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] command = scan.nextLine().split("\\s+");
        Map<Integer, BankAccount> bankAccounts = new LinkedHashMap<>();

        while (!command[0].equals("End")) {
            int id = 0;
            double amount = 0;
            double interest = 0;

            switch (command[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getId(), bankAccount);

                    System.out.println("Account ID" + bankAccount.getId() + " created");
                    break;

                case "Deposit":
                    //Проверяваме дали има такова ID
                    if (bankAccounts.containsKey(Integer.parseInt(command[1]))) {
                        //Достъпваме конкретния банков акаунт
                        bankAccounts.get(Integer.parseInt(command[1]))
                                //След това депозираме пари в него
                                .deposit(Double.parseDouble(command[2]));
                        System.out.printf("Deposited %.0f to ID%d%n", Double.parseDouble(command[2]), Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;

                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(command[1]));
                    break;

                case "GetInterest":
                    if (bankAccounts.containsKey(Integer.parseInt(command[1]))) {
                        System.out.printf("%.2f%n", bankAccounts.get(Integer.parseInt(command[1])).getInterest(Integer.parseInt(command[2])));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }



            command = scan.nextLine().split("\\s+");
        }
    }
}
