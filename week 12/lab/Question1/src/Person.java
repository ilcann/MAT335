public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
    public void buyCandy() {
        System.out.println(this.getName() + " is buying candy.");
    }
    public void buyCigarette() {
        System.out.println(this.getName() + " is buying cigarette.");
    }
}
