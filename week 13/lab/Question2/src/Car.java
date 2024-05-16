public class Car implements CommercialVehicle, PersonalVehicle{
    private int modelYear;
    private double engineVolume;

    public Car(int modelYear, double engineVolume) {
        this.modelYear = modelYear;
        this.engineVolume = engineVolume;
    }
    public int getModelYear() {
        return modelYear;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public double calculateAmortizedTax(double baseTax, int currentYear) { 
        double AmortizedTax = 0.0;
        int gecenYil = currentYear-modelYear;
        if (gecenYil <  9) {
            AmortizedTax = baseTax * (1-0.1*gecenYil) ;
        }
        else {
            AmortizedTax = baseTax * 0.1;
        }
        return AmortizedTax;
    }
    public double calculateTax(double baseTax){
        return baseTax * engineVolume;
    }
}
