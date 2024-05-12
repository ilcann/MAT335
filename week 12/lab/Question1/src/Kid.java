public class Kid extends Person{
    public Kid(String firstName, String lastName) {
        super(firstName, lastName);
    }
    @Override
    public void buyCandy() {
        System.out.println("Kid " + getName() + " is buying candy");
    }
    @Override
    public void buyCigarette() {
        System.out.println("Kid " + getName() + " cannot buy cigarette");
    }
}
