/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.practice.projects;

/**
 *
 * @author kchaw
 */
public class Student {
 String name, age, course;
 char fpaid;
 double fees;
 
 void info()
 {
     name="Kanishk";
     age="18";
     course="JAVA";
     fees=13000;
     fpaid='Y';
 }
 
 void show()
 {
     System.out.println(" Name: "+name);
     System.out.println(" Age: "+age);
     System.out.println(" course: "+course);
     System.out.println(" Is Fee paid? "+fpaid);
 }
 
 public static void main(String[] args)
 {
     Student std=new Student();
     std.info();
     std.show();
 }
 
}