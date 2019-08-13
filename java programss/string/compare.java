import java.util.Scanner;
class compare
{
public static void main(String [] args)
{
Scanner key=new Scanner(System.in);
System.out.print("Enter a string:");
String s1=key.nextLine();
System.out.print("Enter another string:");
String s2=key.nextLine();
int n=s1.compareTo(s2);
System.out.println(n);
if(n==0)
{
System.out.print(s1+" and "+s2+" are equal.");
}
else
if(n>0)
{
System.out.print(s1+" is greater than "+s2);
}
else
{
System.out.print(s1+" is less than "+s2);
}
}
}