public class Incdec 
{
    public static void main(String [] inc)
    {
        int a=10,b,c,d,e,f,g,h,i;
        b=f=i=g=10;
        c=++a;
        d=b++;
        e=--f;
        h=g--;
        System.out.println("Increment and Decrement Operations on "+i+" are:");
        System.out.println("Preincrement on "+i+" is: "+c);
        System.out.println("Postdecrement on "+i+" is: "+d);
        System.out.println("Predecrement on "+i+" is: "+e);
        System.out.print("Postdecrement on "+i+" is: "+h);
        
    }
    
}
