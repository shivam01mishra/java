import java.util.*;
class parson{
    String name;
    int age;
    public parson(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
   

};

class student extends parson{
    int rollNo;
    public student(String name, int age, int rollNo )
    {
        super(name,age);
        this.rollNo=rollNo;
    }
};

class inharitance{
    public static void main(String []arg)
    {
        student s1=new student("shivam", 25, 2221004);
        System.out.println("name is:"+s1.name);
        System.out.println("age is:"+s1.age);
        System.out.println("rollNo is:"+s1.rollNo);
    }
}