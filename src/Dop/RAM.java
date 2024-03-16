package Dop;

public class RAM {
    String name;
    int volume;

    public RAM()
    {

    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void printInfo() {
        System.out.println("RAM: " + name + ", Volume: " + volume + "GB");
    }
}


