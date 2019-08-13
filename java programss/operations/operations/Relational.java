public class Relational
{
    public static void main(String [] rel)
    {
        int a=20,b=30;
        boolean c,d,e,f,g,h;
        c=a>b;
        d=a<b;
        e=a<=b;
        f=a>=b;
        g=a!=b;
        h=a==b;
        System.out.println("Relational operations on "+a+" and "+b+" are:");
        System.out.println(+a+" is greater than "+b+" :"+c);
        System.out.println(+a+" is less than "+b+" :"+d);
        System.out.println(+a+" is greater than or equal to "+b+" :"+f);
        System.out.println(+a+" is less than or equal to "+b+" :"+e);
        System.out.println(+a+" is equal to "+b+" :"+h);
        System.out.print(+a+" is not equal to "+b+" :"+g);
        
        
    }
}
