package Unit4;

public class Employee {
    public String name;
    public boolean isMale;
    public double wage;
    public double bonus;
    public Employee(){
        name="";
        isMale=true;
    }
    public Employee(String  n,boolean m){
        name=n;
        isMale=m;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return  name;
    }
    public void setWage(double w){
        wage=w;
    }
    public double getWage(){
        return  wage;
    }
    public void setBonus(double b){
        bonus=b;
    }
    public double getBonus(){
        return bonus;
    }
    public void raiseWage(double p){
        wage += wage * p;
    }
}
