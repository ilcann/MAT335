public class DrivingSchoolTest {
    public static void main(String[] args) throws Exception {
        DrivingSchool school = new DrivingSchool("Driving School");
        System.out.printf("School Name: %s%n", school.getName());
        System.out.printf("School Price: %f%n", school.getPrice());
        school.setPrice(-10.0);
        school.setPrice(1000.0);
        school.register(10);
        school.register(20);
    }
}
