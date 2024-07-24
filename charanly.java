import java.io.*;
import java.util.Scanner;
class charanly 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a string (end with *): ");
String input = scanner.next();
char[] characters = input.toCharArray();        
int uppercase = 0, lowercase = 0, number = 0, special = 0;
for (char c : characters) 
{
if (c == '*') 
{
break;
} 
else if (Character.isUpperCase(c)) 
{
uppercase++;
} else if (Character.isLowerCase(c)) 
{
lowercase++;
} else if (Character.isDigit(c)) 
{
number++;
} else 
{
special++;
}
}       
System.out.println("Uppercase: " + uppercase);
System.out.println("Lowercase: " + lowercase);
System.out.println("Numbers: " + number);
System.out.println("Special Symbols: " + special);
scanner.close();
}
}
