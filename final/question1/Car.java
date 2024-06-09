
public class Car extends Vehicle implements Fuel {
    private int enginePower;

    Car(String brand, int speed, int enginePower) {
        super(brand, speed);
        this.enginePower = enginePower;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle Type: Car");
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Engine power: " + enginePower);
    }
    @Override
    public void fuelConsumption() {
        System.out.println("Fuel consumption: x liters / 100km");
    }
}
