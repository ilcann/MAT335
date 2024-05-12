public class YoungAdult extends Person{
    public YoungAdult(String firstName, String lastName) {
        super(firstName, lastName);
    }
    @Override
    public void buyCigarette() {
        System.out.println(this.getName() + " is buying cigarette.");
        System.out.println(this.getName() + " must stop smoking.");
    }
}
