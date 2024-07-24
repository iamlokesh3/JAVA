import java.io.*;
import java.util.*;
class vowel 
{
public static void main(String[] args) 
{
String str = "HEllo, World!";
int vowels = 0;
str = str.toLowerCase();
for (int i=0;i<str.length();i++) 
{
char ch = str.charAt(i);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
{
vowels++;
}
}
System.out.println("Number of vowels in the given string: " + vowels);
}
}
