
public abstract class Vehicle {
    private String brand;
    private int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public abstract void displayInfo();
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
}
