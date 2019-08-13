import java.util.Scanner;
public class length
{
public static void main(String [] args)
{
Scanner key=new Scanner(System.in);
System.out.print("Enter a string:");
String s1=key.nextLine();
int n=s1.length();
System.out.print("Number of characters in '"+s1+"' is:"+n);
}
}