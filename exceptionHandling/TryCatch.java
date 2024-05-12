// package exceptionHandling;
import java.lang.Throwable;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc= new Scanner(System.in);  
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            System.out.println("a/b="+a/b);
        }
        catch(Exception e)
        {
            System.out.println("thise code throwing exception "+e);
        }
        System.out.println("exicution completed");
    }
    
}
