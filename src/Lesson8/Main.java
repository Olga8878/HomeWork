package Lesson8;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(47557575, "Nokia", 10);
        Phone phone2 = new Phone(58585888, "Iphone", 8);
        Phone phone3 = new Phone(85858588, "Samsung", 11);

        phone1.receiveCall("Друг");
        phone2.receiveCall("Муж");
        phone3.receiveCall("Мама");
        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println();

        phone1.receiveCall("Даша ", 877777777);
        phone1.receiveCall("Маша ", 699697797);
        phone1.receiveCall("Вася ", 668877333);
        System.out.println();

        phone1.sendMessage("333345", "7667777", "7665556");
        phone2.sendMessage("667888", "6666433", "9999999");
        phone3.sendMessage("999999", "6788889", "78990000");
    }
}
