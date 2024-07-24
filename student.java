import java.io.*;
import java.util.Scanner;
class student
{
public static void main(String[] args)
{
int m1,m2,m3,m4,m5,T;
Scanner s=new Scanner(System.in);
System.out.println("Enter a Student marks");
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
m4=s.nextInt();
m5=s.nextInt();
T=m1+m2+m3+m4+m5;
System.out.println("Total marks " +T);
System.out.println("Average marks "+T/5);
}
}