package Unit4.Unit4_2;

public class Animal {
    private int age;
    Animal(){
        System.out.println("Animal defalt constructor");
    }
    Animal(int a){
        age=a;
        System.out.println("Animal constructor");
    }
    void setAge(int a){
        age=a;
    }
}
