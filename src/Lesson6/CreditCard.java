package Lesson6;

public class CreditCard {

    private final String accountNumber;
    private int balance;

    public CreditCard(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void addMoney(int balance) {
        this.balance += balance;
    }

    public int withdrawMoney(int balance) {
        if (this.balance < balance) {
            return -1;
        }
        this.balance -= balance;
        return this.balance;
    }

    public void info() {
        System.out.println("Account Number:" + accountNumber + "\n" + "Balance:" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}

