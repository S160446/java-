public class fibonacci 
{
    public static void main(String [] fib)
    {
       int f1=0,f2=1,f3,n=10,i;
       System.out.println("First "+n+" numbers in fibonacci series are:");
       System.out.print(+f1+"\t");
       System.out.print(+f2+"\t");
       for(i=3;i<=n;i++)
       {
         f3=f1+f2;
         System.out.print(+f3+"\t");
         f1=f2;
         f2=f3;
       }
    }
}

