package my.practice.projects.strings;
import java.util.Scanner;

public class stringManipulation {

public static void main(String[] args)
{
    stringManipulation sm=new stringManipulation();
    Scanner sc=new Scanner(System.in);

    String s1;
    String s2;
    int loc, loc2;
    String ch, ch2;
    
    System.out.println("ENTER 1st STRING: ");
    s1=sc.next();
    System.out.println("ENTER 2nd STRING: ");
    s2=sc.next();
    
    //Length()
    System.out.println("\n\nThe length of the first string is: "+s1.length());
    System.out.println("The length of the second string is: "+s2.length());
    
    //charAt()
    System.out.println("\n\nEnter the location of the character you wish to see in the first string: ");
    loc=sc.nextInt();
    System.out.println("Enter the location of the character you wish to see in the second string: ");
    loc2=sc.nextInt();
    System.out.println("The character in the first string at number "+loc+" location is: "+s1.charAt(loc));
    System.out.println("The character in the second string at number "+loc2+" location is: "+s2.charAt(loc2));
    
    //equals()
    System.out.println("\n\nIt would be TRUE if the 1st string is completely equal to 2nd string, otherwise it would be FALSE: "+s1.equals(s2));
    
    //equalsIgnoreCase()
    System.out.println("\n\nIt would be TRUE if the 1st string is equal to 2nd string, otherwise it would be FALSE: "+s1.equalsIgnoreCase(s2));
    
    //compareTo()
    System.out.println("\n\nIt would be '0' if the 1st string is completely equal to 2nd string, otherwise it would be a negative number: "+s1.compareTo(s2));

    //compareToIgnoreCase()
    System.out.println("\n\nIt would be '0' if the 1st string is equal to 2nd string, otherwise it would be a negative number: "+s1.compareToIgnoreCase(s2));
    
    //startsWith()
    System.out.println("\n\nIt would be TRUE if the 1st string starts with 2nd string, otherwise it would be FALSE: "+s1.startsWith(s2));

    //endsWith()
    System.out.println("\n\nIt would be TRUE if the 1st string ends with 2nd string, otherwise it would be FALSE: "+s1.endsWith(s2));

    //indexOf()
    System.out.println("\n\nEnter the character whose location you want to find in 1st string: ");
    ch=sc.next();
    System.out.println("Enter the character whose location you want to find in 2nd string: ");
    ch2=sc.next();
    System.out.println("The first occurence of the character found in the 1st string is at: number "+s1.indexOf(ch)+" location");
    System.out.println("The first occurence of the character found in the 2nd string is at: number "+s2.indexOf(ch2)+" location");

    //lastIndexOf()
    System.out.println("\n\nEnter the character whose location you want to find in 1st string: ");
    String lch=sc.next();
    System.out.println("Enter the character whose location you want to find in 2nd string: ");
    String lch2=sc.next();
    System.out.println("The last occurence of the character found in the 1st string is at: number "+s1.lastIndexOf(lch)+" location");
    System.out.println("The last occurence of the character found in the 2nd string is at: number "+s2.lastIndexOf(lch2)+" location");
    
    //substring()
    System.out.println("\n\nEnter the location from which onwards you want to see the substring in the second string: ");
    int h=sc.nextInt();
    System.out.println("Enter the location from which onwards you want to see the substring in the second string: ");
    int h2=sc.nextInt();
    System.out.println("The substring from "+h+" position from 1st string is: "+s1.substring(h-1));
    System.out.println("The substring from "+h2+" position from 2nd string is: "+s2.substring(h2-1));
    
    //concat()
    System.out.println("\n\nThe concatenated new string is: "+s1.concat(s2));
    
    //replace()
    System.out.println("\n\nEnter the character(s) you want to replace from the first string: ");
    String find=sc.next();
    System.out.println("Enter the character(s) you want to replace '"+find+"' with: ");
    String rep=sc.next();
    System.out.println("The new string after replacement is: "+s1.replace(find, rep));
    
    //toUpperCase()
    System.out.println("\n\nThe second string in upper case is: "+s2.toUpperCase());
    
    //toLowerCase()
    System.out.println("\n\nThe first string in lower case is: "+s1.toLowerCase());

    //trim()
    System.out.println("\n\nThe first string after spaces trimmed is: "+s1.trim());
    
    //toCharArray()
    System.out.println("\n\nThe string is converted into array of the same length as that of the string:");
    System.out.println(s2.toCharArray());
    
    //valueOf()
    System.out.println("\n\nThe integer/float/double are converted into string: "+String.valueOf(h));
    
    
    
}
    
}
