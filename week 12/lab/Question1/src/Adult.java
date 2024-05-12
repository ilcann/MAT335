public class Adult extends Person{
    public Adult(String firstName, String lastName) {
        super(firstName, lastName);
    }
    @Override
    public void buyCandy() {
        System.out.println(this.getName() + " is buying candy.");
        System.out.println(this.getName() + " must be careful about getting fat.");
    }
}
