import java.util.Scanner;
import java.io.*;
public class reverse
{
public static void main(String [] args)
{
Scanner key=new Scanner(System.in);
System.out.print("Enter a string:");
String s1=key.nextLine();
StringBuilder s2=new StringBuilder();
s2=s2.append(s1);
s2=s2.reverse(s1);
System.out.print("Reverse of '"+s1+"' is:'"+s2+"'");
}
}