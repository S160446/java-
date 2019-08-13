import java.util.Scanner;
public class Factorial 
{
  public static void main(String [] factorial)
  {
   Scanner read=new Scanner(System.in);
   long f=1l;
   System.out.print("Enter a number:");
   int i=read.nextInt(),j;
   for(j=i;j>1;j--)
   {
       f=f*j;
   }
   System.out.println("Factorial of "+i+" is:"+f);
  }
}
