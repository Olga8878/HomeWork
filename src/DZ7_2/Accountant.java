package DZ7_2;

public class Accountant implements Position {

   private final String position;

    public Accountant(String position) {
        this.position = position;

    }

    @Override
    public void showInfo() {

        System.out.println("Должность:" + position);

    }
}


