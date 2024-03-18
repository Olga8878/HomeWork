package DZ7_2;

public class Worker implements Position {

    String position;

    public Worker(String position) {
        this.position = position;
    }

    @Override
    public void showInfo() {
        System.out.println("Должность:" + position);

    }
}
