
package homework;
import java.util.Random;

public class rNumber
{

    public static void main(String[] args)
    {
        rNumber num=new rNumber();
        System.out.println("Generating 10 random integers in range 1-10.");
        
        Random r=new Random();
        
        int random=r.nextInt(10);
        System.out.println("Number Generated: "+(random+1));
        
        if((random+1)<=5)
        {
            System.out.println("HEAD");
        }
        else
        {
            System.out.println("TAIL");
        }
        
    }
    
}
