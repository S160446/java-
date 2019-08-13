import java.util.Scanner;
class reverse
{
public static void main(String [] args)
{
String s2
Scanner read=new Scanner(System.in);
System.out.print("enter String:");
String s1=read.nextline();
int n=s1.length(),i;
for(i=(n-1);i>=0;i--)
String s2=s2+charAt(i);
System.out.print("Reverse of "+s1+"is:"+s2);
}
}