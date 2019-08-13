import java.util.Scanner;
public class great
{
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);
System.out.println("enter three  num:");
int a=read.nextInt();
int b=read.nextInt();
int c=read.nextInt();
int max=a;
if(b>c && b>a)
max=b;
else if(c>a)
max=c;
System.out.print("Maximum of "+a+","+b+ "and"+c+"is:"+max);
}
}