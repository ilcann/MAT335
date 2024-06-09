
public class TestApp {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Renault", 100, 500);
        car1.displayInfo();
        car1.fuelConsumption();

        Bicyle bicyle1 = new Bicyle("Bmx", 10, 21);
        bicyle1.displayInfo();
        bicyle1.fuelConsumption();
        bicyle1.pedal();
    }
}
