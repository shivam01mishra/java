import java.util.*;
class ract{
    int l,b;
    public  void setData(int l, int b)
    {
        this.l=l;
        this.b=b;;
    }
    public void showData()
    {
        System.out.println("length is: "+l);
        System.out.println("width is: "+b);
    }
}

class hello{
    public static void main(String arg[])
    {
         
        ract r1=new ract();
        r1.setData(4, 6);
        r1.showData();
        r1.l=7;
        r1.b=9;
        r1.showData();
    }

};