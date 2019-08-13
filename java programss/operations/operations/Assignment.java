public class Assignment
{
    public static void main(String [] assign)
    {
        int a=20,b=30,c;
        c=a;
        a+=b;
        System.out.println("Assignment operations are:");
        System.out.println(+c+" + = "+b+" is:"+a);
        c=a;
        a-=b;
        System.out.println(+c+" - = "+b+" is:"+a);
        c=a;
        a*=b;
        System.out.println(+c+" * = "+b+" is:"+a);
        c=a;
        a/=b;
        System.out.println(+c+" / = "+b+" is:"+a);
        c=a;
        a%=b;
        System.out.println(+c+" % = "+b+" is:"+a);
        
        
    }
}
