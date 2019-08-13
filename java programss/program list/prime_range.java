public class prime_range
{
    public static void main(String [] Prime)
    {
        int i,c=0,j;
        System.out.println("Prime numbers between 1 and 100 are:");
        for(i=1;i<=100;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                    
                    c++;
            }
            if(c==2)
                System.out.print(+i+"\t");
            c=0;
        }
    }
}
 
