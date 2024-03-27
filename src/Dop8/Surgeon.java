package Dop8;

public class Surgeon implements Doctor {

    @Override
    public void heal() {
        System.out.println("Лечение ведет хирург");
    }
}
