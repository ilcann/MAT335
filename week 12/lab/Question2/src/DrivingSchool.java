public class DrivingSchool {
    private String name;
    private double price;

    public DrivingSchool(String name) {
        this.name = name;
        this.price = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        try {
            if (price < 0) {
                throw new Exception("Price must be bigger than 0.");
            }
            this.price = price;
            System.out.println("Price have succesfully changed to " + price);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean register(int age) {
        try {
            if (age < 18) {
                throw new Exception("Age must be bigger than 18.");
            }
            System.out.printf("Customer with age %d have succesfully registered.%n", age);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
