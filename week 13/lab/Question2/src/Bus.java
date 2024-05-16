public class Bus implements CommercialVehicle, PersonalVehicle{
    private int modelYear;
    private double tonnage;
    
    public Bus(int modelYear, double tonnage) {
        this.modelYear = modelYear;
        this.tonnage = tonnage;
    }
    public int getModelYear() {
        return modelYear;
    }
    public double getTonnage() {
        return tonnage;
    }
    public double calculateAmortizedTax(double baseTax, int currentYear) {
        double AmortizedTax;
        double tonnageRate;
        int age = currentYear - modelYear;
        double ageRate = 2.0;

        if(tonnage < 1) {
            tonnageRate = 1.0;
        }
        else if(1 <= tonnage && tonnage <= 10){
            tonnageRate = 1.4;
        }
        else {
            tonnageRate = 1.6;
        }

        if ((double)age * 0.05 < 2) {
            ageRate = (double) age * 0.05;
        }
        AmortizedTax = baseTax * ageRate * tonnageRate;
        return AmortizedTax;
    }
    public double calculateTax(double baseTax){
        return tonnage * baseTax;
    }
}
