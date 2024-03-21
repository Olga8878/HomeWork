package Lesson8;


public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model, String weight) {
        this(number, weight);
        this.model = model;

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;

    }

    public Phone()
    {

    }


    public void receiveCall(String name) {

        System.out.println("Звонит:" + name);

    }

    public void receiveCall(String name, String number) {

        System.out.println("Звонит: " + name + "с номера телефона:" + number);
    }

    public String getNumber() {
        return number;

    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение будет отправлено:");

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
