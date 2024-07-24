import java.io.*;
import java.util.Scanner;
class operation
{
public static void main(String[] agrs)
{
int a,b,add,sub,mul,mod,div;
Scanner o=new Scanner(System.in);
System.out.println("Enter a number for a ad b");
a=o.nextInt();
b=o.nextInt();
add=a+b;
sub=a-b;
mul=a*b;
mod=a%b;
div=a/b;
System.out.println("addition"+ add);
System.out.println("Substraction"+ sub);
System.out.println("Multiplication"+ mul);
System.out.println("Modules"+ mod);
System.out.println("Division" + div);
}
}