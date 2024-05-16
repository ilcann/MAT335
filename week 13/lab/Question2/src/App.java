public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car(2000, 150);
        Bus bus1 = new Bus(2000, 0.6);
        Bus bus2 = new Bus(2000, 1.6);

        System.out.printf("Tax: " + car1.calculateTax(1000) + "\n" + "Amortized Tax: " + car1.calculateAmortizedTax(1000, 2024) + "\n");
        System.out.printf("Tax: " + bus1.calculateTax(1000) + "\n" + "Amortized Tax: " + bus1.calculateAmortizedTax(1000, 2024) + "\n");
        System.out.printf("Tax: " + bus2.calculateTax(1000) + "\n" + "Amortized Tax: " + bus2.calculateAmortizedTax(1000, 2024) + "\n");
    }
}
