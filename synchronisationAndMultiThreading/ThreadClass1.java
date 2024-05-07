// package synchronisationAndMultiThreading;
import java.lang.*;

public class ThreadClass1 {
    int c = 0;
    public  synchronized void increament()
    {
        c++;
    } 
    class A1 extends Thread {
        public void run() {
            for (int i = 0; i < 10000; i++)
            increament();
        }
    }

    class B1 extends Thread {
        public void run() {
            for (int i = 0; i < 10000; i++)
            increament();
        }
    }

    public static void main(String[] args) {
        ThreadClass1 obj1 = new ThreadClass1();
        A1 a1 = obj1.new A1();
        B1 b1 = obj1.new B1();
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
