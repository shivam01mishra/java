// package synchronisationAndMultiThreading;
import java.lang.*;
public class RunableInterface  {
    int c = 0;
    public  synchronized void increament()
    {
        c++;
    } 
    class A2 implements Runnable {
        public void run() {
            for (int i = 0; i < 10000; i++)
            increament();
        }
    }

    class B2 implements Runnable {
        public void run() {
            for (int i = 0; i < 10000; i++)
            increament();
        }
    }

    public static void main(String[] args) {
        RunableInterface obj1 = new RunableInterface();
        A2 a = obj1.new A2();
        B2 b = obj1.new B2();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
        System.out.println("c value is : " + obj1.c);
    }
}
