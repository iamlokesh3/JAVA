import java.io.*;
import java.util.Scanner;
import java.lang.math;
class intrest 
{
public static void main(String[] args)
{
float p,n,r,si,ci;
Scanner i=new Scanner(System.in);
System.out.println("Enter a number for p,n,r");
p=i.nextFloat();
n=i.nextFloat();
r=i.nextFloat();
si=p*n*r/100;
ci=p*pow[(1+r/100),n];
Syatem.out.println("Simple intrest "+si);
Syatem.out.println("Component intrest "+ci);
}
}