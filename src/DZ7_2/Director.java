package DZ7_2;

public class Director implements Position {

    String position;
    String name;

    public Director(String position) {
        this.position = position;

    }

    @Override
    public void showInfo() {

        System.out.println("Должность:" + position);
    }
}
