import java.io.*;
import java.util.*;
class arr 
{
public static void main(String[] args)
{
int[10] arr = { 9, -5, 5, 10, 0, 3, 20, 25, 12,77 };
System.out.print("Elements of given array are: ");
for (int i = 0; i <=arr.length; i++)  
{
if (i%2!=0)
System.out.print(arr[i] + " ");
}
}
}