package Advanced.Classes.BankAccount;

public class BankAccount {

    private static int accountCount =1;
    private static double interestRate = 0.02;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = accountCount;
        accountCount++;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public int getId() {
        return id;
    }

    double getInterest(int years) {
        //Връща глобалния лихвен процент * годините * баланса за инстанцията/обекта
        return BankAccount.interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
