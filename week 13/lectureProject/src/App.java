public class App {
    public static void main(String[] args) throws Exception {
        Student m1 = new MathStudent("Ayşe", 512);
        Student m2 = new PhyStudent("Ali", 132);

        m1.tellName();
        m2.tellName();
        ((MathStudent) m1).calculate();
        ((PhyStudent) m2).discover();
    }
}
