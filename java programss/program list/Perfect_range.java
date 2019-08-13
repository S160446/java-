public class Perfect_range
{
    public static void main(String [] Perfect)
    {
        int a=1,b=1000,i,j,s=0;
        System.out.println("Perfect numbers between "+a+" and "+b+" are:");
        for(i=a;i<=b;i++)
        {
        for(j=1;j<i;j++)
        {
            if(i%j==0)
                s=s+j;
        }
        if(s==i)
            System.out.print(+i+"\t");
        s=0;
        }
        
            
    }
    
}
