public class Palindrome 
{
    public static void main(String [] palin)
    {
         int a=909,r,n,s=0;
        n=a;
        boolean i=true;
        while(i)
        {
            if(n==0)
                break;
            else
            {
              r=n%10;
              s=(s*10)+r;
              n=n/10;
            }
        }
        if(s==a)
            System.out.println(+a+" is palindrome.");
        else
            System.out.println(+a+" is not palindrome.");
    }
}
