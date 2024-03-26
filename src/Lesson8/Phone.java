package Lesson8;


public class Phone {
    private int number;
    private String model;
    private String weight;


    public Phone()
    {

    }

    public Phone(int number, String model, String weight) {
        this(number,weight);
        this.model = model;

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;

    }


    public void receiveCall(String name) {

        System.out.println("Звонит:" + name);

    }

    public void receiveCall(String name, int number) {

        System.out.println("Звонит: " + name + "с номера телефона:" + number);
    }

    public int getNumber() {
        return number;

    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение будет отправлено:");

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
