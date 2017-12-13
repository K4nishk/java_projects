package Class.work;
import java.util.Scanner;

public class evenOdd {
    
    public static void main(String[] args)
    {
        int n;
        evenOdd eo=new evenOdd();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        
        if(n%2==0)
        {
         if(n==2||n==4)
         {
             System.out.println("Not Weird");
         }
         else if(n>=6&&n<=20)
         {
             System.out.println("Weird");
         }
         else 
         {
             System.out.println("Not Weird");
         }
        }
        else
        {
            System.out.println("Weird");
        }
    
    }
    
}
