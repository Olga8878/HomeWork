package Lesson6;

public class CreditCard {

    String accountNumber;
    int balance;

    public CreditCard(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addMoney(int balance) {
        if (balance <= 0) {
            return;
        }
        this.balance += balance;
    }

    public void withdrawMoney(int balance) {
        if (this.balance < balance || balance <= 0) {
            return;
        }
        this.balance -= balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}

