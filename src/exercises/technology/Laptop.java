package exercises.technology;

public class Laptop extends Computer {
    private int screenSize;

    public Laptop(int screenSize) {
        this.screenSize = screenSize;
    }

    public Laptop() {
    }

    public int getScreenSize(){
        return screenSize;
    }

    @Override
    public void printCoreSpecs(){
        super.printCoreSpecs();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}
