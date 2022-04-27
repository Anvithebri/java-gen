abstract class ABS{
    void display(){
        System.out.println("this is from display");
    }
    abstract void show();
}
public class Abstract extends ABS {
    public void show(){
        System.out.println("from show child class");
    }
    public static void main(String[] args){
        ABS obj = new Abstract();
        obj.show();
        obj.display();
    }
}
