public class PhyStudent extends Student{
    
    public PhyStudent(String name, int id){
        super(name, id);
    }

    public void discover(){
        System.out.println("I discovered something");
    }
    public void tellName(){
        System.out.println("My name is " + getName()); 
    }
}
