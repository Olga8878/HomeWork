package Dop;

public class HDD {

   private String name;
   private int volume;
   private String type;

    public HDD() {

    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void printInfo() {
        System.out.println("HDD: " + name + ", Volume: " + volume + "GB, Type: " + type);
    }
}

