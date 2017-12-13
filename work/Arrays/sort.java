package Class.work.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class sort {
    
    Scanner sc=new Scanner(System.in);
    int n;
    
    void intSort()
    {
        System.out.println("Enter the number of integers you wish to sort: ");
        n=sc.nextInt();
        
        int[] sort=new int[10];
        System.out.println("Enter the integers you want to sort: ");
        for (int i=0;i<n;i++)
        {
            sort[i]=sc.nextInt();
        }
        
        for (int i=0; i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                int temp;
                if(sort[j]>sort[j+1])
                {
                    temp=sort[j];
                    sort[j]=sort[j+1];
                    sort[j+1]=temp;
                }
            }
        }
        
        System.out.println("\nThe Sorted list is: ");
        
        for(int i=0; i<n;i++)
        {
            System.out.println(sort[i]);
        }
    }
    
    void stringSort()
    {   
        //int x;
        //System.out.println("Enter the number of words you wish to sort: ");
        //x=sc.nextInt();
        
        String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };   
        
        /*String[] my_array2 = new String[10];
        System.out.println("Enter the words you want to sort: ");
        for (int i=0;i<x;i++)
        {
            my_array2[i]=sc.next();
        }
        
        Arrays.sort(ssort);
        System.out.println("Words after sorting: "+Arrays.toString(ssort));*/
                       
        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
        
    
    public static void main(String[] args)
    {
        sort sorting=new sort();
        
        sorting.intSort();
      //  sorting.stringSort();
    }
}
