package Class.work;
import java.util.Scanner;

public class daysNumber {

public static void main(String[] args)
{
    int month;
    daysNumber dn=new daysNumber();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the month's number: ");
    month=sc.nextInt();
    switch(month)
    {
        case 1:
            System.out.println("There are 31 days in January.");
            break;
        case 2:
            int year;
            System.out.println("Enter the year: ");
            year=sc.nextInt();
            if(year%400==0||(year%4==0&&year%100!=0))
            {
                System.out.println("There are 29 days in February, "+year+".");   
            }
            else
            {
                System.out.println("There are 28 days in February, "+year+".");
            }
            break;
        case 3:
            System.out.println("There are 31 days in March.");
            break;
        case 4:
            System.out.println("There are 30 days in April.");
            break;
        case 5:
            System.out.println("There are 31 days in May.");
            break;
        case 6:
            System.out.println("There are 30 days in June.");
            break;
        case 7:
            System.out.println("There are 31 days in July.");
            break;
        case 8:
            System.out.println("There are 31 days in August.");
            break;
        case 9:
            System.out.println("There are 30 days in September.");
            break;
        case 10:
            System.out.println("There are 31 days in October.");
            break;
        case 11:
            System.out.println("There are 30 days in November.");
            break;
        case 12:
            System.out.println("There are 31 days in December.");
            break;
        default:
            System.out.println("The number you have entered is not a month");
            break;
    }
}
    
}
