package Unit4.Unit4_2;

public class Cat extends Animal {
    private String name;
    Cat(String n,int a){
        name=n;
        setAge(a);
        System.out.println("Cat constructor");
    }
}
