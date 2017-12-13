package Class.work;
import java.util.Scanner;


public class multipleDmc {

    Scanner sc=new Scanner(System.in);
    int n;
    double[] eng=new double[12];
    double[] math=new double[12];
    double[] hindi=new double[12];
    double[] phy=new double[12];
    double[] chem=new double[12];
    String[] f_name=new String[12];
    String[] l_name=new String[12]; 
    double[] total=new double[12];
    double[] score=new double[12];
    String[] grade=new String[12];
    
public void storeDetails()
{
    System.out.println("Enter the number of students in the class(MAX 12): ");
    n=sc.nextInt();
    for(int i=0; i<n; i++)
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter the first name of the child: ");
        f_name[i]=sc.next();
        System.out.println("Enter the last name of the child: ");
        l_name[i]=sc.next();
        System.out.println("Enter the marks scored by "+f_name[i]+" "+l_name[i]+" in English: ");
        eng[i]=sc.nextDouble();
        System.out.println("Enter the marks scored by "+f_name[i]+" "+l_name[i]+" in Maths: ");
        math[i]=sc.nextDouble();
        System.out.println("Enter the marks scored by "+f_name[i]+" "+l_name[i]+" in Hindi: ");
        hindi[i]=sc.nextDouble();
        System.out.println("Enter the marks scored by "+f_name[i]+" "+l_name[i]+" in Physics: ");
        phy[i]=sc.nextDouble();
        System.out.println("Enter the marks scored by "+f_name[i]+" "+l_name[i]+" in Chemistry:");
        chem[i]=sc.nextDouble();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

public void showDetails()
{
    for(int i=0; i<n;i++)
    {
        total[i]=eng[i]+math[i]+hindi[i]+phy[i]+chem[i];
        score[i]=total[i]/5;
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("-------------------------DETAILED MARKSHEET---------------------------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Student Name: "+f_name[i]+" "+l_name[i]);
        System.out.println("Marks scored in subjects(MAX 100 each):-> ");
        System.out.println("ENGLISH: "+eng[i]);
        System.out.println("MATHEMATICS: "+math[i]);
        System.out.println("HINDI: "+hindi[i]);
        System.out.println("PHYSICS: "+phy[i]);
        System.out.println("CHEMISTRY: "+chem[i]);
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Marks Scored: "+total[i]);
        System.out.println("Average Marks: "+score[i]);
        System.out.println("Percentage Scored: "+score[i]+"%");
        
        if(score[i]<90 &&score[i]>75)
        {
            grade[i]="EXCELLENT";
        }
        else if (score[i]>90)
        {
            grade[i]="OUTSTANDING";
        }
        else if(score[i]<75 && score[i]>60)
        {
            grade[i]="VERY GOOD";
        }
        else if(score[i]<60 && score[i]>50)
        {
            grade[i]="GOOD";
        }
        else if(score[i]<50 && score[i]>33)
        {
            grade[i]="FAIR";
        }
        else
        {
            grade[i]="FAIL";
        }
        
        System.out.println("Grade Obtained: "+grade[i]);
        System.out.println("------------------------------------------------------------\n\n");
        
    }
}

public static void main(String[] args)
{
    multipleDmc dmc=new multipleDmc();
    dmc.storeDetails();
    dmc.showDetails();
}
}