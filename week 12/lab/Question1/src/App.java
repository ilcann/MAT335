public class App {
    public static void main(String[] args) {
        //test1 object creation
        Kid kid = new Kid("Kid_FirstName", "Kid_LastName");
        YoungAdult youngAdult = new YoungAdult("YoungAdult_FirstName", "YoungAdult_LastName");
        Adult adult = new Adult("Adult_FirstName", "Adult_LastName");

        //test2 kid
        System.out.printf("%s%n", kid.getName());
        kid.buyCandy();
        kid.buyCigarette();
        //test3 youngAdult
        System.out.printf("%s%n", youngAdult.getName());
        youngAdult.buyCandy();
        youngAdult.buyCigarette();
        //test4 adult
        System.out.printf("%s%n", adult.getName());
        adult.buyCandy();
        adult.buyCigarette();
    }
}
