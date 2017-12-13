package Class.work.Arrays;
import java.util.Scanner;

public class arraySum {
    
    
    public static void main(String[] args)
    {
        int n;
        int[] nos=new int[100];
        int sum=0;
        
        Scanner sc=new Scanner(System.in);
        arraySum arr=new arraySum();
        
        System.out.println("Enter the number of integers you wish to add: ");
        n=sc.nextInt();
        
        System.out.println("Enter the integers you want to add: ");
        for (int i=0;i<n;i++)
        {
            nos[i]=sc.nextInt();
            sum=sum+nos[i];
        }
        
        System.out.println("Sum of integers is: "+sum);
    }
}
