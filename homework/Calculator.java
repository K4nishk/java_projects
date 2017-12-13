package homework;
import java.util.Scanner;

public class Calculator {
    
    
    public static void main(String[] args)
    {
        Calculator calc=new Calculator();
        Scanner sc=new Scanner(System.in);
        
        double no1, no2;
        int ch;
        
        System.out.println("----------------------WELCOME------------------------");
        System.out.println("Enter 1st no.: ");
        no1=sc.nextDouble();
        System.out.println("Enter 2nd no.: ");
        no2=sc.nextDouble();
        
        System.out.println("Enter '1' to add these 2 numbers.");
        System.out.println("Enter '2' to subtract these 2 numbers.");
        System.out.println("Enter '3' to multiply these 2 numbers.");
        System.out.println("Enter '4' to divide these 2 numbers.");
        ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
                System.out.println("The sum of these 2 numbers is: "+(no1+no2));
                break;
            case 2:
                System.out.println("The difference of these 2 numbers is: "+(no1-no2));
                break;
            case 3:
                System.out.println("The product of these 2 numbers is: "+(no1*no2));
                break;
            case 4:
                System.out.println("The 2 numbers when divided with each other gives: "+(no1/no2));
                break;
            default:
                System.out.println("INVALID INPUT");
                break;
        }
    }
}
