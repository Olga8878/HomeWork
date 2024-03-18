package DZ7_2;

public class Accountant implements Position {

    String position;
    String name;

    public Accountant(String position) {
        this.position = position;

    }

    @Override
    public void showInfo() {

        System.out.println("Должность:" + position);

    }
}


