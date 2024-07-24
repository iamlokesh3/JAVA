import java.io.*;
import java.util.*;
class zigzag
{
	public static void main(String[] args)
	{
		int n ;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter your size");
		n = S.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		
		boolean flag= true;
		for(int i=0;i<n-1;i++)
		{
			if(flag)
			{
				int temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			else
            		{
                		if (a[i] < a[i + 1])
                		{
                			int temp = a[i];
                    			a[i] = a[i + 1];
                    			a[i + 1] = temp;
                		}
            		}
            		flag = !flag;
		}
		for (int i = 0; i < n; i++)
        	{
            		System.out.print(a[i] + " ");
        	}
	}
}