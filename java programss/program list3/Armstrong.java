public class Armstrong 
{
public static void main(String [] arm)
  {
      int c=0,n,j,r,m,o,k;
      double sum=0;
      System.out.println("Armstrong numbers between 1 and 10 are:");
      for(n=1;n<=10;n++)
      {
      m=n;
      o=n;
      while(n>0)
      {
              c++;
              n=n/10;
      }
      for(j=1;j<=c;j++)
      {
          r=m%10;
           sum=sum+Math.pow(r,c);
          m=m/10;
      }
      if(sum==o)
          System.out.print(+o+"\t");
      sum=0;
      c=0;
      }
      
  }
}