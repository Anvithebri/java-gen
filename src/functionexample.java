package anvith;
import java.util.Scanner;

class Functionexample {
   public void show(){
       System.out.println("this is called from function");
   }
    public float show(int a, int b){
        float c = a+b;
        return c;
    }
    public void show(float a, int b){
        System.out.println(a+b);
    }
    public void show(int a, int b, float c){
        System.out.println(a+b+c);
    }

    public float add(float f,float r){
        float y= f+r;
        return y;
    }

    public String abc(String mesg){
        return "Welcome";
    }

    public void xyz(String a){
        System.out.println("from function =" +a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        int a = sc.nextInt();
        System.out.println("Enter value of B");
        int b = sc.nextInt();
        Functionexample object = new Functionexample();
        object.show();  // calling the f unction
        System.out.println(object.show(a,b));
        object.show(4,7, 3.4F);
        object.show(6.7f,5);
        System.out.println(object.add(6.7f,5.6f));
        String m = object.abc("hello");
        object.xyz(object.abc("hello"));
        System.out.println(m);
    }
}

class A{
    public static void main(String[] args) {
        Functionexample obb = new Functionexample();
        obb.show();
   }
}
