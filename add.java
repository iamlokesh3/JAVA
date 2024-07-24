import java.io.*;
import java.util.Scanner;
class add
{
public static void main(String[] args)
{
int a,b,c;
Scanner s=new Scanner (System.in);
System.out.println("Enter a two number");
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("sum of two numbers "+c);
}
}