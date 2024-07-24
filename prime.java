import java.io.*;
class prime
{
public static void main(String[] args)
{
int f=0;
for (int i=100;i<=200;i++);
{
f=0;
for (int j=2;j<=i/2;j++);
{
if(i%j==0);
f++;
}
if(j==0);
{
System.out.println(i);
}
}
}
}