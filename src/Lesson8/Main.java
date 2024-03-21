package Lesson8;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("89094563478", "Nokia", "10");
        Phone phone2 = new Phone("89091111111", "Iphone", "5");
        Phone phone3 = new Phone("89092222222", "Samsung", "6");

        phone1.receiveCall("Друг");
        phone2.receiveCall("Муж");
        phone3.receiveCall("Мама");
        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println();

        phone1.receiveCall("Даша ", "89097777777");
        phone1.receiveCall("Маша ", "89095555555");
        phone1.receiveCall("Вася ", "89093455677");
        System.out.println();

        phone1.sendMessage("333345", "7667777", "7665556");
        phone2.sendMessage("667888", "6666433", "9999999");
        phone3.sendMessage("999999", "6788889", "78990000");
    }
}
