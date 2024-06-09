
public class Bicyle extends Vehicle implements Fuel {
    private int gearCount;

    public Bicyle(String brand, int speed, int gearCount) {
        super(brand, speed);
        this.gearCount = gearCount;
    }

    public void pedal() {
        System.out.println("Bicycle is pedaling");
    }
    @Override
    public void displayInfo() {
        System.out.println("Vehicle Type: Bicyle");
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Gear Count: " + gearCount);
    }
    @Override
    public void fuelConsumption() {
        System.out.println("Fuel consumption: x liters / 100km");
    }
}
