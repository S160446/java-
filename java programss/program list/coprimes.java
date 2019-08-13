import java.util.Scanner;
class coprimes
{
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);
System.out.println("Enter two numbers:");
int dividend=read.nextInt();
int a=dividend,rem,gcd=0;
int divisor=read.nextInt();
int b=divisor;
while(true)
{
rem=dividend%divisor;
if(rem==0)
{
gcd=1;
break;
}
else
{
dividend=divisor;
divisor=rem;
}
}
if(gcd==1)
System.out.print(a+" and "+b+" are coprimes.");
else
System.out.print(a+" and "+b+" are not coprimes.");
}
}