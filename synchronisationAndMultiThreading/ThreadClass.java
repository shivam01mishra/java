// package synchronisationAndMultiThreading;
import java.lang.*;

public class ThreadClass {
    int c = 0;
    public  void increament()
    {
        c++;
    } 
    class A extends Thread {
        public void run() {
            for (int i = 0; i < 10000; i++)
            increament();
        }
    }

    class B extends Thread {
        public void run() {
            for (int i = 0; i < 10000; i++)
            increament();
        }
    }

    public static void main(String[] args) {
        ThreadClass obj1 = new ThreadClass();
        A a1 = obj1.new A();
        B b1 = obj1.new B();
        a1.start();
        b1.start();
        try {
            a1.join();
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
        try {
            b1.join();
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
        System.out.println("c value is : " + obj1.c);
    }
}
