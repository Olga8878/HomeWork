package Dop8;

public class Therapist implements Doctor {

    @Override
    public void heal() {
        System.out.println("Лечение проводит терапевт");
    }
}
