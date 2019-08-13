class Logical
{
    public static void main(String [] args)
    {
        boolean a=true,b=false,c,d,e;
        c=a&&b;
        d=a||b;
        e=!a;
        System.out.println("Logical AND on "+a+" and "+b+" is:"+c);
        System.out.println("Logical OR on "+a+" and "+b+" is:"+d);
        System.out.print("Logical NOT on "+a+" is:"+e);
    }
}
