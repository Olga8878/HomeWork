package DZ7_2;

public class Director implements Position {

  private final String position;


    public Director(String position) {
        this.position = position;

    }

    @Override
    public void showInfo() {

        System.out.println("Должность:" + position);
    }
}
