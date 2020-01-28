package exercises.technology;

public class Computer {
    private int ram= 8;
    private int storage = 128;
    private String wifiCapable = "Yes";

    public Computer(int ram, int storage, String wifiCapable){
        this.ram = ram;
        this.storage = storage;
        this.wifiCapable = wifiCapable;
    }

    public Computer() {
    }

    public int getRam(){
        return ram;
    }

    public int getStorage(){
        return storage;
    }

    public String getWifiCapable(){
        return wifiCapable;
    }

    public void printCoreSpecs(){
        System.out.println("Specs:\nRam: " + ram + "gb\nStorage: " + storage + "gb\nWifi Capable: " + wifiCapable);
    }


}
