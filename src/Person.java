public class Person {
    private String Name;
    private String Dateofbirth;
    private String Gender;
    private String Mobile;
    private String Blood;
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.Dateofbirth ="30-05-2000";
        p1.Gender ="Male";
        p1.Mobile ="9935346709";
        p1.Name = "Raj";
        p1.Blood ="A+ve";

        Person p2 = new Person();
        p2.Dateofbirth ="05-06-2000";
        p2.Gender= "Female";
        p2.Mobile = "9843129726";
        p2.Name="Ramya";
        p2.Blood ="O+ve";

        System.out.println(p1.Name);
        System.out.println(p1.Gender);
        System.out.println(p1.Mobile);
        System.out.println(p1.Dateofbirth);
        System.out.println(p1.Blood);

        System.out.println(p2.Name);
        System.out.println(p2.Gender);
        System.out.println(p2.Mobile);
        System.out.println(p2.Dateofbirth);
        System.out.println(p2.Blood);



    }


}