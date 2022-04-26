public class staticexample {
    static int a;
            int a2;
            static void show() {
                staticexample obj = new staticexample();
                obj.a2 = 6;
                a = 9;
                System.out.println("from static function");
            }
            public static void main(String[] args){
                staticexample obj = new staticexample();
                obj.show();
                show();
                staticexample.show();
                obj.a = 3;
                obj.a2 = 8;
                staticexample obj2 = new staticexample();
                obj2.a = 7;
                obj2.a2 = 5;
                System.out.println("obj.a");
                System.out.println("obj.a2");
                System.out.println("obj2.a");
                System.out.println("obj2.a2");
                System.out.println(staticexample.a);
            }
}
