package Unit4.Unit4_2;

import Unit4.Employee;

public class Manager extends Employee{
    double dividend; //股利
    Manager(String n,boolean m){
        name=n;
        isMale=m;
    }
    public void setDividend(double d){
        dividend=d;
    }
    double getDividend(){
        return dividend;
    }
}
