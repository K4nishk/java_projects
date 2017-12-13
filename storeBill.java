package my.practice.projects;
import java.util.Scanner;

public class storeBill {
    Scanner sc=new Scanner(System.in);
    double  disc_amt;
    public double clacBill(double p, double q)
    {
        double z;
        z=p*q;
        return z;
    }
    
    public double discountApproved(double x)
    {
        Scanner s=new Scanner(System.in);
        double disc;
        System.out.println("Enter the discount percentage: ");
        disc=s.nextDouble();
        disc_amt=disc*x/100;
        return disc_amt;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String p_name;
        double price, a, gross_bill, net_bill;
        double qty;
        storeBill sb=new storeBill();
        System.out.println("**************WELCOME***************");
        System.out.println("Enter Product name: ");
        p_name=sc.next();
        System.out.println("Enter the price: ");
        price=sc.nextDouble();
        System.out.println("Enter the quantity: ");
        qty=sc.nextDouble();
        gross_bill=sb.clacBill(price, qty);
        System.out.println("Gross Bill is: "+gross_bill);
        a=sb.discountApproved(gross_bill);
        System.out.println("Discount allowed is: "+a);
        System.out.println("************************************");
        System.out.println("\n\n\n---------------RECIEPT---------------");
        System.out.println("The product is: "+p_name);
        System.out.println("Thhe price of the product is: "+price);
        System.out.println("The quantity of the product is: "+qty);
        System.out.println("Gross bill =\t"+gross_bill);
        System.out.println("Discount allowed=\t"+a);
        net_bill=gross_bill-a;
        System.out.println("\nAmount payable is \t"+net_bill);
        
    }
    
}
