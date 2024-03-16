package Lesson6;

public class Main {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("11111", 1000);
        CreditCard card2 = new CreditCard("22222", 2000);
        CreditCard card3 = new CreditCard("33223", 3000);


        System.out.println("card1 number = " + card1.getAccountNumber() + "\n" + card1.balance);
        System.out.println("card2 number = " + card2.getAccountNumber() + "\n" + card2.balance);
        System.out.println("card3 number = " + card3.getAccountNumber() + "\n" + card3.balance);

        card1.addMoney(500);
        card2.addMoney(1000);
        card3.withdrawMoney(500);

        System.out.println("card1 balance = " + card1.getBalance());
        System.out.println("card2 balance = " + card2.getBalance());
        System.out.println("card3 balance = " + card3.getBalance());
    }
}

