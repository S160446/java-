public class simpleif
{
    public static void main(String [] simpif)
    {
      int a=20,b=30,c=50,max=0;
      if(a>b&&a>c)
          max=a;
       if(b>a&&b>c)
          max=b;
        if(c>b&&c>a)
          max=c;
        System.out.println("Maximum of "+a+","+b+" and "+c+" is:"+max);
    }
}