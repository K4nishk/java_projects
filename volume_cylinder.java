package my.practice.projects;
import java.util.Scanner;

public class volume_cylinder {
Scanner sc=new Scanner(System.in);
double r;
double h;
double vol;

void storeInput()
{
    System.out.println("Enter the radius of the cylinder: ");
    r=sc.nextDouble();
    System.out.println("Enter the height of the cylinder: ");
    h=sc.nextDouble();
    vol=r*r*h*3.142;
}

void showOutput()
{
    System.out.println("The volume of the cylinder is: "+vol);
}

public static void main(String[] args)
{
    volume_cylinder obj=new volume_cylinder();
    obj.storeInput();
    obj.showOutput();
}
}
