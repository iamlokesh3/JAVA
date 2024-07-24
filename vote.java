import java.io.*;
import java.util.Scanner; 
public class vote 
{ 
public static void main(String[] args) 
{ 
int age;
Scanner s = new Scanner(System.in); 
System.out.print("Enter your age: "); 
age = s.nextInt(); 
if (age >= 18) 
{ 
System.out.println("You are eligible to vote."); 
} else 
{ 
System.out.println("You are not eligible to vote."); 
} 
s.close(); 
} 
} 