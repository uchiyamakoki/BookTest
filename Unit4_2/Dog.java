package Unit4.Unit4_2;

public class Dog extends Animal{
    String kind;
    Dog(String k,int a){
        super(a);
        kind=k;
        System.out.println("Dog constructor");
    }
    void whipTail(){
        System.out.println("The dog wiggles his tail");
    }
}
