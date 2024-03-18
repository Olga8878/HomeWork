package DZ7_2;

public class Main {
    public static void main(String[] args) {

        Accountant acc = new Accountant("Бухгалтер");
        Worker work = new Worker("Рабочий");
        Director dir = new Director("Директор");

        acc.showInfo();
        work.showInfo();
        dir.showInfo();
    }
}



