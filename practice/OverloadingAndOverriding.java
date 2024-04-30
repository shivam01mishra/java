import java.util.*;
class person{
    protected String name;
    protected int age;
    public void setData(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void showData()
    {
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }
};
class student extends person{
   int rollNo;
   
    public void setData(String name, int age,int rollNo)// function overloading 
    {
        super.name=name;
        super.age=age;
        this.rollNo=rollNo;
    }
    @Override
    public void showData()
    {
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("rollNo :"+rollNo);
    }
}
public class OverloadingAndOverriding {
    public static void main(String []args)
    {
        person p1=new person();
        p1.setData("vonod", 35);
        p1.showData();
        student s1=new student();
        s1.setData("shivam",25,22210044);
        s1.showData();
    }
    
}
