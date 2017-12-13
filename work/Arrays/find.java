package Class.work.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class find {
    
   public void compare(int[] arr, int item)
   {
       int x=0;
      for (int n : arr)
      {
         if (item == n)
         {
            x=1;
            break;
         }
      }
      if (x==1)
      {
          System.out.println("\n\nThe array contains the item you are looking for.");
      }
      else
      {
            System.out.println("\n\nThe array does not contain the item you are looking for.");
      }
      
   }
   public static void main(String[] args) 
   {
        find f=new find(); 
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of integers you wish to add in the array: ");
        int n=sc.nextInt();
        
        int[] array=new int[20];
        System.out.println("Enter the numbers in the array: ");
        for(int i=0; i<n;i++)
        {
        array[i]=sc.nextInt();
        }
        System.out.println("Enter the number you wish to find in the array: ");
        int num1=sc.nextInt();
        //int[] array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
                        
        f.compare(array, num1);
   } 
   
}
