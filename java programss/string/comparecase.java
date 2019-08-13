import java.util.Scanner;
class equals
{
public static void main(String [] args)
{
Scanner key=new Scanner(System.in);
System.out.print("Enter a string:");
String s1=key.nextLine();
System.out.print("Enter another string:");
String s2=key.nextLine();
boolean n=s1.compareToIgnoreCase(s2);
if(n==true)
System.out.print(s1+" and "+s2+" are equal.");
else
System.out.print(s1+" and "+s2+" are not equal.");
}