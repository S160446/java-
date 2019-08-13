import java.util.Scanner;
class gcd
{
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);
System.out.println("Enter two numbers:");
int dividend=read.nextInt();
int a=dividend,rem=0;
int divisor=read.nextInt();
int b=divisor;
while(true)
{
rem=dividend%divisor;
if(rem==0)
{
System.out.print("GCD of  "+a+" and "+b+" is:"+divisor);
break;
}
else
{
dividend=divisor;
divisor=rem;
}
}
}
}