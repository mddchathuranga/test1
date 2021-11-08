abstract  class OS {
  public abstract void Type();
  public abstract void OS_Req();
}

class Windows extends OS
{

    public void Type() {

        System.out.println("Windows 10");

        System.out.println("General Purpose");

    }

    public void OS_Req() {
        System.out.println("4GB RAM/core2duo/40GB HDD");

    }
}

class HiveOS extends OS{


    public void Type() {

        System.out.println("Hive OS");

        System.out.println("Crypto Mining");

    }


    public void OS_Req() {
        System.out.println("4Gb RAM/core i5 10th gen/40GB SSD");

    }
}




