package homework;
import java.util.Scanner;

public class telephoneBill {

     
    
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    telephoneBill tb=new telephoneBill();
    
    String m_no;
    int calls_no, calls_no2;
    double bill, grossbill = 0;
    double tbill;
    double total;
    
    System.out.println("---------------------------WELCOME----------------------------");
    System.out.println("Enter your mobile number: ");
    m_no=sc.next();
    System.out.println("Enter your number of calls: ");
    calls_no=sc.nextInt();
        
        if(calls_no>300)
        {
            calls_no2=calls_no-300;
            bill=0.1*calls_no2;
            grossbill=bill+175;
        }
        else if(calls_no<=300 && calls_no>200)
        {
            calls_no2=calls_no-200;
            bill=0.25*calls_no2;
            grossbill=bill+150;
        }
        else if(calls_no<=200 && calls_no>100)
        {
            calls_no2=calls_no-100;
            bill=0.5*calls_no2;
            grossbill=bill+100;
        }
        else if(calls_no<=100 && calls_no>0)
        {
            bill=calls_no;
            grossbill=bill;
        }
        else
        {
            System.out.println("The number of calls can not be a negative number.");
        }
        tbill=grossbill*0.18;
        total=grossbill+tbill;
        
        System.out.println("\n\n\nYOUR TELEPHONE BILL FOR MOBILE NUMBER: "+m_no+" IS: "+total+"Rs.");
      
}
}
