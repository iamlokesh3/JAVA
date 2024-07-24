import java.io.*;
import java.util.*;

class l_word
{
	public static void main(String[] args)
	{
		int c=0;
		Scanner S = new Scanner(System.in);
		String a;
		System.out.println("Enter the string");
		a=S.nextLine();
		for(int i=a.length()-1;i>=0;i--)
		{
			if(String.valueOf(a.charAt(i)).equals(" "))
			{
				break;
			}
			else
			{
				c++;
			}
		}
		System.out.println(c);
	}
}