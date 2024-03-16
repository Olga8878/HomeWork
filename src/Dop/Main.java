package Dop;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer(1000, "Dell");
        comp1.printInfo();

        System.out.println();

        RAM ram1 = new RAM("Kingston", 64);
        HDD hdd1 = new HDD("Samsung", 1024, "SSD");
        Computer comp2 = new Computer(1500, "Asus", ram1, hdd1);
        comp2.printInfo();
    }
}

