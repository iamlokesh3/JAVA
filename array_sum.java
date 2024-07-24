import java.io.*;
import java.util.Scanner;
class array_sum
{
public static void main(String[] args) 
{
int n,i,j, sum = 0;
Scanner s = new Scanner(System.in);  
System.out.print("Enter size of the array:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter array elements:");
for(i=0;i<n;i++)
{
a[i] = s.nextInt();
}
for(j=0;j<i-1;j++)
{
sum = sum + a[j];
}
System.out.println("Sum of the array is:"+sum);
}
}