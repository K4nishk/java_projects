package my.practice.projects;
import java.util.Scanner;

public class balanceDenominations {
    
    public void twoThousand(int a)
    {
        int b=a/2000;
        int c=a%2000;
        System.out.println("Number of 2000 rupees notes= "+b);
        int d=c/500;
        int e=c%500;
        System.out.println("Number of 500 rupees notes= "+d);
        int f=e/200;
        int g=e%200;
        System.out.println("Number of 200 rupees notes= "+f);
        int h=g/100;
        int i=g%100;
        System.out.println("Number of 100 rupees notes= "+h);
        int j=i/50;
        int k=i%50;
        System.out.println("Number of 50 rupees notes= "+j);
        int l=k/20;
        int m=k%20;
        System.out.println("Number of 20 rupees notes= "+l);
        int n=m/10;
        int o=m%10;
        System.out.println("Number of 10 rupees notes= "+n);
        int p=o/5;
        int q=o%5;
        System.out.println("Number of 5 rupees notes= "+p);
        int r=q/2;
        int s=q%2;
        System.out.println("Number of 2 rupees notes= "+r);
        System.out.println("Number of 1 rupee notes= "+s);
    }
    
    
    
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        balanceDenominations bd=new balanceDenominations();
        int amt,amt_rec, balance;
        System.out.println("Enter Bill Amount: ");
        amt=sc.nextInt();
        System.out.println("Enter the Amount Received: ");
        amt_rec=sc.nextInt();
        balance=amt_rec-amt;
        System.out.println("The balance to be given: "+balance);
        System.out.println("\n\n");
        bd.twoThousand(balance);
    }
}
