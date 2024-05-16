public class MathStudent extends Student{
    
    public MathStudent(String name, int id){
        super(name, id);
    }

    public double calculate(){
        double result = 0;
        return result;
    }
    @Override
    public void tellName(){
        System.out.println("My name is " + getName());
    }
}
