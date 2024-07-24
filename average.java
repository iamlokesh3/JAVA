import java.io.*;
import java.util.Scanner;
class average
{
public static void main(String[] args)
{
int a,b,c,d,e,z;
Scanner v=new Scanner(System.in);
System.out.println("Enter a five numbers");
a=v.nextInt();
b=v.nextInt();
c=v.nextInt();
d=v.nextInt();
e=v.nextInt();
z=a+b+c+d+e;
System.out.println("The sum of 5 numbers " +z);
System.out.println("Average of 5 numbers "+z/5);
}
}