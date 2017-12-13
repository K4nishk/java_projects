package Class.work.Arrays;
import java.util.Scanner;

public class minMax {
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[10];
        
        System.out.println("Enter the number of elements you want to store in array: ");
        int n=sc.nextInt();
        
        System.out.println("Enter the numbers of the array: ");
        for(int i=0; i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        
        int min = num[0];
        int max = num[0];
      
        for(int i = 1; i<num.length; i++) 
        {
            if(num[i] > max)
            {
                max = num[i];
            }
            else if (num[i] < min)
            {
                min = num[i];
            }
        } 
        System.out.println("Largest Number is : "+max);
        System.out.println("Smallest Number is : "+min);
    }
    
}
