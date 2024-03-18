package Dop;

public class Computer {
    private final int cost;
    private final String model;
    private final RAM ram;
    private final HDD hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Cost: " + cost);
        ram.printInfo();
        hdd.printInfo();
    }
}




