public class Bitwise {
    public static void main(String [] bit)
    {
        int a=3,b=4,c,d,e,f,g,h,i;
        i=a;
        c=a&b;
        d=a|b;
        e=a^b;
        f=~i;
        g=a<<1;
        h=b>>1;
        System.out.println("Bitwise operations on "+a+" and "+b+" are:");
        System.out.println("Bitwise AND on "+a+" and "+b+" is:"+c);
        System.out.println("Bitwise OR on "+a+" and "+b+" is:"+d);
        System.out.println("Bitwise XOR on "+a+" and "+b+" is:"+e);
        System.out.println("Bitwise NOT on "+a+" is:"+c);
        System.out.println("Bitwise left shift on "+a+" by 1 is:"+g);
        System.out.println("Bitwise right shift on "+b+" by 1 is:"+h);
    }
    
}
