class if_else
{
    public static void main(String [] nestedif)
    {
      int a=60,b=30,c=50,max;
      if(a>b)
      {
          if(a>c)
          max=a;
          else
          max=c;   
      }
      else
      {
          if(b>c)
            max=b;
          else
            max=c;
      }
      System.out.println("Maximum of "+a+","+b+" and "+c+" is:"+max);
    }
}
