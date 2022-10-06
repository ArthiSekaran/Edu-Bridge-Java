package student;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Marksheet 
{
 
String name1,dep;
String clg;
int roll1;
static int j=1,s1,s2,s3,s4,s5,total,roll;
static float percent;
static String name;
public void showmarksheet() 
{  
    System.out.println("Student name: " + name1); 
    System.out.println("Roll no.: " + roll1);  
    System.out.println("College: " + clg);
}
public boolean search(String roll) 
{ 
    if (roll.equals(roll )) 
    {  
        showmarksheet();  
        return (true);  
    }  
    return (false);  
}  
  public static void op(Scanner sc)
  {
   System.out.println("\t\t\t**STUDENT MANAGAEMENT**");
   System.out.println("\nHow many number of students do you want to add:");
   int n = sc.nextInt();
   Marksheet C[]=new Marksheet[n];
   for(int i=0;i<C.length;i++)
   {
    C[i]=new Marksheet();
    C[i].addstd(sc);
   }
int ch;
{
  do {
	  System.out.println("**Enter your choice to see : ** ");  
    System.out.println("\n 1.To Display all Student details \n 2.Marksheetprocess \n 3.Exit");  
   
  ch = sc.nextInt();  
   switch (ch) 
        {  
           case 1:  
                for (int i = 0; i < C.length; i++) 
                {  
                    C[i].showmarksheet();  
                }  
                break;  
                      
        case 2:
         marksheetprocess(sc) ;
         break;
         
        case 3:  
                System.out.println("Exited>>>Best Of Luck for the Future");
                break;                  
}  
    }  
    while (ch != 3);
}
}
public static void marksheetprocess(Scanner sc) 
{
  {
int j=1,s1,s2,s3,s4,s5,total;
for(int i=0;i<j;i++)
{
try
{
System.out.println("\n\t***WELCOME***");
System.out.print("\nEnter the name of Student :");
sc.nextLine();
name=sc.nextLine();
System.out.print("Enter the roll no of the student:\t");
roll=sc.nextInt();
System.out.print("\nEnter the Mark of Computer Graphics :\t");
s1=sc.nextInt();
System.out.print("Enter the Mark of Operating System :\t");
s2=sc.nextInt();
System.out.print("Enter the Mark of C++ :\t");
s3=sc.nextInt();
System.out.print("Enter the Mark of Java :\t");
s4=sc.nextInt();
System.out.print("Enter the Mark of DBMS :\t");
s5=sc.nextInt();
total=s1+s2+s3+s4+s5;
percent=total/5;
System.out.print("\n\t *Marksheet*");
System.out.print("\nName:"+name );
System.out.print("\nRoll No:"+roll);
System.out.print("\n\n*Subject Marks* \n");
System.out.print("\nComputer Graphics:"+s1);
System.out.print("\nOperating System:"+s2);
System.out.print("\nC++:"+s3);
System.out.print("\nJava:"+s4);
System.out.print("\nDBMS:"+s5);
System.out.print("\n\nTotal:"+total);
System.out.println("\nPercentage:"+percent);
if(percent>=80)
{
System.out.println("\n\tDivision\t:First!");
}
if(percent>=60 && percent<80)
{
System.out.println("\n\tDivision\t:Second!");
}
if(percent<40)
{
System.out.println("\n\tDivision\t:Third!");
}
System.out.println("\tpress 5 to continue marksheet process: :");
int h=sc.nextInt();
if(h!=5)
{
System.out.println("Exited>>Best Of Luck for the Future");
System.exit(0);
}
j++;
}
catch(InputMismatchException ex)
{
System.out.println("Input is not vaild");
System.exit(0);
}
}
}
}
public  void addstd(Scanner sc)
{
System.out.println("Enter the Student Name:");
sc.nextLine();
name1=sc.nextLine();
System.out.println("Enter the Student Department:");
dep=sc.nextLine();
System.out.print("Enter the College Name:");
clg=sc.nextLine();
System.out.println("Enter the Roll number:");
roll1=sc.nextInt();
}
public static void main(String args[])
{
int h=0,j=1;
Scanner sc = new Scanner(System.in);
op(sc);
marksheetprocess(sc);
}
}