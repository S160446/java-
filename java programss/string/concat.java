import java.util.Scanner;
class concat
{
public static void main(String [] args)
{
Scanner key=new Scanner(System.in);
System.out.print("Enter a string:");
String s1=key.nextLine();
System.out.print("Enter another string:");
String s2=key.nextLine();
String s3=s1.concat(s2);
System.out.println("Concatenation of "+s1+" and "+s2+" is: "+s3);
}
}