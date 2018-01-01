package Unit4.Unit4_2;

public class SubClass extends BaseClass{
    SubClass(){
        System.out.println("SubClass constructor");
    }
    {
        System.out.println("SubClass initial scope");
    }

    public static void main(String[] args) {
        SubClass s=new SubClass();
    }
}
