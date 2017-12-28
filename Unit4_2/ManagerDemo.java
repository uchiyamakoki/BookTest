package Unit4.Unit4_2;

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m=new Manager("张三",true);
        m.setWage(5000.0);
        m.setBonus(3000.0);
        m.setDividend(4000.0);
        System.out.println("Manager:"+m.getName());
        System.out.println("工资："+m.getWage());
        System.out.println("奖金："+m.getBonus());
        System.out.println("分红："+m.getDividend());
    }
}
