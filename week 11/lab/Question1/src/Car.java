
public class Car {
    private String plate;
    private FuelType fuelType;
    private Person owner;

    public Car(String plate, FuelType fuelType) {
        this.plate = plate;
        this.fuelType = fuelType;
        this.owner = null;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public double calculateFuelCost(double liter) {
        double fuelPrice = fuelType.getPricePerLiter();
        return liter * fuelPrice;
    }
    public String introduceSelf() {
        String carInfo = "The car's plate is " + this.plate + " and " + "The fuel type is " + this.fuelType;
        return carInfo;
    }
}
