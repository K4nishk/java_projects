package homework;
import java.util.Scanner;

public class groceryBill {
    
    public static void main(String[] args)
    {
        String pname,ref;
        double price, qty, grossbill, discount, temp, bill=0;
                
        Scanner sc=new Scanner(System.in);
        groceryBill gb=new groceryBill();
        System.out.println("-----------------------WELCOME--------------------------");
        System.out.println("Enter Product Name: ");
        pname=sc.next();
        System.out.println("Enter Price: ");
        price=sc.nextDouble();
        System.out.println("Enter Quantity: ");
        qty=sc.nextDouble();
        
        grossbill=price*qty;
        
        if(grossbill>=10000 && qty>=3)
        {
            System.out.println("Greetings, You are eligible to get 20% discount.");
            temp=grossbill*0.8;
            System.out.println("\n\nDo you have any employee Reference?(Yes/No)");
            ref=sc.next();
            if(ref.equalsIgnoreCase("Yes"))
            {
                bill=temp-(grossbill*0.1);
            }
            else if(ref.equalsIgnoreCase("No"))
            {
                bill=temp;
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }
        else 
        {
            System.out.println("\n\nDo you have any employee Reference?(Yes/No)");
            ref=sc.next();
            if(ref.equalsIgnoreCase("Yes"))
            {
                bill=grossbill*0.9;
            }
            else if(ref.equalsIgnoreCase("No"))
            {
                bill=grossbill;
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }
        System.out.println("----------------HERE IS YOUR BILL------------------");
        System.out.println("Product: "+pname);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+qty);
        System.out.println("\n\nAmount Payable: "+bill);
    }
    
}
