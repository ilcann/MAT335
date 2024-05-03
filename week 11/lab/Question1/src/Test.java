public class Test {
    public static void main(String[] args) {
        //car object 1
        String plate1 = "34 ABC 123";
        Car car1 = new Car(plate1, FuelType.GASOLINE);
        System.out.println(car1.introduceSelf());

        //car object 2
        String plate2 = "16 DEF 123";
        Car car2 = new Car(plate2, FuelType.DIESEL);
        System.out.println(car2.introduceSelf());

        //person object
        Person person1 = new Person("Alex");
        System.out.println(person1.introduceSelf());

        //gallery object
        Gallery gallery1 = new Gallery("Gallery 1", 1, person1);

        //gallery methods
        gallery1.searchCar(plate1);
        gallery1.addCar(car1);
        gallery1.searchCar(car2);
        gallery1.addCar(car2);
        System.out.println(gallery1.introduceSelf());
    }
}
