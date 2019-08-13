import java.util.*;
public class recursion
{
long fact(int n)
{
if(n==1)
return 1;
else
return n*fact(n-1);
}
}
class main
{
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);
System.out.print("Enter a number:");
int a= read.nextInt();
recursion obj=new recursion();
long b=obj.fact(a);
System.out.print("factorial of "+a+"is:"+b);
}
}
