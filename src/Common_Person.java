public interface Common_Person {

    public abstract int getAge() ;



    public abstract String getName();

    public abstract int getPassword();

    public abstract String getID();

}


class Person2 implements Common_Person{
    private String ID="5555";
    private String name ="Person2";
    private int password = 45466;
    private int age= 45;



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public String getID() {
        return ID;
    }
}

class Person implements Common_Person{
   private String ID="6666";
   private String name ="Person";
   private int password = 2545;
   private int age= 35;



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public String getID() {
        return ID;
    }
}


