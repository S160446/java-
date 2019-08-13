import java.util.Scanner;
class factorial
{
long fact(int n)
{
if(n==0)
return 1;
else
return n*fact(n-1);
}
}
class Main
{
public static void main(String [] args)
{
factorial k=new factorial();
Scanner o=new Scanner(System.in);
System.out.print("Enter a number:");
int d=o.nextInt();
long f=k.fact(d);
System.out.print("Factorial of "+d+" is:"+f);
}
}


