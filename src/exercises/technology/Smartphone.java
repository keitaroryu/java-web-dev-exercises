package exercises.technology;

public class Smartphone extends Laptop{
    private int batteryCapacity;

    public Smartphone(int batteryCapacity, int screenSize){
        super(screenSize);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    @Override
    public void printCoreSpecs(){
        super.printCoreSpecs();
        System.out.println("Battery Capacity: " + batteryCapacity + "mah");
    }
}
