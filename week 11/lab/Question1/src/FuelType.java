
public enum FuelType {
    GASOLINE("GASOLINE", 30.0),
    DIESEL("DIESEL", 40.0);

    private final String fuelName;
    private final double pricePerLiter;

    FuelType(String fuelName, double pricePerLiter) {
        this.fuelName = fuelName;
        this.pricePerLiter = pricePerLiter;
    }
    public String getFuelName() {
        return fuelName;
    }
    public double getPricePerLiter() {
        return pricePerLiter;
    }
}
