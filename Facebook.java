package my.practice.projects;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Facebook {
   
    JFrame fr;
    
   
    Choice chdt;
    Choice chmon;
    Choice chyr;
    JLabel lblhd;
    JPanel pnlnm;
    JRadioButton rbmale;
    JRadioButton rbfemale;
    JRadioButton rbother;
    ButtonGroup bggender;
    //JLabel lblques;
    JLabel lblinfo;
    //JLabel lblfnm;
    JTextField txtfnm;
    //JLabel lblsnm;
    JTextField txtno;
    JTextField txtpass;
    JTextField txtsnm;
    JPanel pnlnxt;
    JLabel lblbday;
    JButton btnnxt;
    JButton btnacc;
    
    
    public void settings()
    {
        
    fr=new JFrame("WELCOME TO FACEBOOK");
    fr.setLayout(null);
    
    lblhd=new JLabel("SIGN UP");
    //pnlnm=new JPanel();
   //pnlnxt=new JPanel();
    
    fr.add(lblhd);
    //fr.add(pnlnm);
    //fr.add(pnlnxt);
    
    //PANEL NAME:
    lblinfo=new JLabel("It's Free and always will be.");
    txtfnm=new JTextField("First Name");
    txtsnm=new JTextField("Last Name");
    txtno=new JTextField("Enter Mobile no. or E-Mail.");
    txtpass=new JTextField("New Passwowrd");
    fr.add(lblinfo);
    fr.add(txtfnm);
    fr.add(txtsnm);
    fr.add(txtno);
    fr.add(txtpass);
    
   /* pnlnm.add(lblinfo); 
    pnlnm.add(txtfnm);
    pnlnm.add(txtsnm);
    pnlnm.add(txtno);*/
    
    
    //PANEL NEXT:
    lblbday=new JLabel("BIRTHDAY");
    btnacc=new JButton("Already have an account?");
    btnnxt=new JButton("Create Account");
    chdt=new Choice();
    chmon=new Choice();
    chyr=new Choice();
    
    fr.add(chdt);
    //DATE:
    chdt.add("DATE");
    chdt.add("1");
    chdt.add("2");
    chdt.add("3");
    chdt.add("4");
    chdt.add("5");
    chdt.add("6");
    chdt.add("7");
    chdt.add("8");
    chdt.add("9");
    chdt.add("10");
    chdt.add("11");
    chdt.add("12");
    chdt.add("13");
    chdt.add("14");
    chdt.add("15");
    chdt.add("16");
    chdt.add("17");
    chdt.add("18");
    chdt.add("19");
    chdt.add("20");
    chdt.add("21");
    chdt.add("22");
    chdt.add("23");
    chdt.add("24");
    chdt.add("25");
    chdt.add("26");
    chdt.add("27");
    chdt.add("28");
    chdt.add("29");
    chdt.add("30");
    chdt.add("31");
    
    fr.add(chmon);
    //MONTH:
    chmon.add("MONTH");
    chmon.add("JAN");
    chmon.add("FEB");
    chmon.add("MAR");  
    chmon.add("APR");
    chmon.add("MAY");
    chmon.add("JUN");
    chmon.add("JUL");
    chmon.add("AUG");
    chmon.add("SEPT");  
    chmon.add("OCT");
    chmon.add("NOV");
    chmon.add("DEC");
    
    fr.add(chyr);
    //YEAR:
    chyr.add("YEAR");
    chyr.add("1980");
    chyr.add("1981");
    chyr.add("1982");
    chyr.add("1983");
    chyr.add("1984");
    chyr.add("1985");
    chyr.add("1986");
    chyr.add("1987");
    chyr.add("1988");
    chyr.add("1989");
    chyr.add("1990");
    chyr.add("1991");
    chyr.add("1992");
    chyr.add("1993");
    chyr.add("1994");
    chyr.add("1995");
    chyr.add("1996");
    chyr.add("1997");
    chyr.add("1998");
    chyr.add("1999");
    chyr.add("2000");
    chyr.add("2001");
    chyr.add("2002");
    chyr.add("2003");
    chyr.add("2004");
    chyr.add("2005");
    chyr.add("2006");
    chyr.add("2007");
    chyr.add("2008");
    chyr.add("2009");
    chyr.add("2010");
    chyr.add("2011");
    chyr.add("2012");
    chyr.add("2013");
    chyr.add("2014");
    chyr.add("2015");
    chyr.add("2016");
    chyr.add("2017");
    
    JRadioButton rbmale=new JRadioButton("MALE");
    JRadioButton rbfemale=new JRadioButton("FEMALE");
    JRadioButton rbother=new JRadioButton("OTHER");
    
    ButtonGroup bggender=new ButtonGroup();
    bggender.add(rbmale);
    bggender.add(rbfemale);
    bggender.add(rbother);
    
    fr.add(btnacc);
    fr.add(btnnxt);
    
    /*pnlnxt.add(btnnxt);
    pnlnxt.add(btnacc);
    pnlnxt.add(chdt);
    pnlnxt.add(chmon);*/
   // pnlnxt.add(chyr);
        
    /*lblhd.setBounds(20,10,200,70);
    pnlnm.setBounds(30,300,400,200);
    pnlnxt.setBounds(30,501,400,199);
  */  
    lblinfo.setBounds(20,300,300,40);
    txtfnm.setBounds(20,350,150,40);
    txtsnm.setBounds(170,350,150,40);
    txtno.setBounds(20,400,320,40);
    txtpass.setBounds(20,450,320,40);

    lblbday.setBounds(20,501,200,40);
    chdt.setBounds(20,550,30,40);
    chmon.setBounds(60,550,30,40);
    btnnxt.setBounds(20,650,200,40);
    btnacc.setBounds(20,600,200,40);
    
    fr.setSize(1000,1000);
    fr.setVisible(true);
    
    }
    
    public static void main(String[] args)
    {
        Facebook fb=new Facebook();
        fb.settings();
    }
           
}
