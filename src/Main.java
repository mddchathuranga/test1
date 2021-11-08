import sun.awt.OSInfo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Abstract Class");
        System.out.println();
        System.out.println();
        /////////////Abstract///////////////////
            Windows w = new Windows();
            HiveOS h = new HiveOS();
            showInfo(h);




        System.out.println();
        System.out.println();
        System.out.println(" inheritance");
        System.out.println();
        System.out.println();

       //////////////Inheritance////////////////

      child c = new child();

        System.out.println(c.age1);
        c.Show_Name();
        c.Display_Name();
        System.out.println(c.age2);

        //////////////Polymorphism////////////////

        System.out.println();
        System.out.println();
        System.out.println("Polymorphism");
        System.out.println();
        System.out.println();



        polymorphism pol1 = new polymorphism();
        polymorphism pol2 = new polymorphism_sub();
        polymorphism_sub pol3 = new polymorphism_sub();

        System.out.println("//////////////pol1///////////////");

        pol1.print();// should print polymain print
        System.out.println(pol1.x); // should print 40

        System.out.println("//////////////pol2///////////////");


        pol2.print();// should print polysub print
        System.out.println(pol2.x); // should print 40

        System.out.println("//////////////pol3///////////////");


        pol3.print();// should print polysub print
        System.out.println(pol3.x); // should print 100





        //////////////Encapsulation////////////////
        System.out.println();
        System.out.println();
        System.out.println("Encapsulation");
        System.out.println();
        System.out.println();

        Student s1 = new Student();

        s1.setID(1111);
        s1.setName("Kamal");
        s1.setAge(28);

        System.out.println("Student ID is "+ s1.getID());
        System.out.println("Student Name is "+ s1.getName());
        System.out.println(("Student Age is "+ s1.getAge()));


        //////////////Interfaces////////////////
        System.out.println();
        System.out.println();
        System.out.println("Interfaces");
        System.out.println();
        System.out.println();

        Common_Person cp;
        cp = new Person();

        System.out.println(cp.getName());
        cp = new Person2();
        System.out.println(cp.getName());

        //////////////Inner Class////////////////
        System.out.println();
        System.out.println();
        System.out.println("Inner Class");
        System.out.println();
        System.out.println();


        OuterClass ou = new OuterClass();
        OuterClass.InnerClass in =ou.new InnerClass();

        ou.Print();
        in.Print();



    }


















    public static void showInfo(OS obj){

       obj.Type();
        obj.OS_Req();
    }
}