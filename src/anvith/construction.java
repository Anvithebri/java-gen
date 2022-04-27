package anvith;

public class construction {
    construction(){
        System.out.println("THis is from constructor");
    }
    construction(int a){
        System.out.println("THis is from constructor"+a);

    }
    construction(int a, float b){
        System.out.println("THis is from constructor"+(a+b));
    }

    public static void main(String[] args) {
        construction c1 =  new construction();
        construction c2 =  new construction(5);
        construction c3 =  new construction(5,7.8f);
    }
}
