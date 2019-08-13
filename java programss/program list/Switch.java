public class Switch
{
  public static void main(String [] switchex)
  {
      int a=20,b=30,d=0;
      char c;
      c='*';
      switch(c)
      {
          case '+':d=a+b;
                   System.out.println("Sum of "+a+" and "+b+" is:"+d);
                   break;
          case '-':d=a-b;
                   System.out.println("Difference between "+a+" and "+b+" is:"+d);
                   break;
          case '*':d=a*b;
                   System.out.println("Product of "+a+" and "+b+" is:"+d);
                   break;
          case '/':d=a/b;
                   System.out.println("Quotient of "+a+" when it is divided by "+b+" is:"+d);
                   break;
          case '%':d=a%b;
                   System.out.println("Remainder of "+a+" when it is divided by "+b+" is:"+d);
                   break;
          default:System.out.println("wrong operator.");
              
      }
      System.out.println(+a+" "+c+" "+b+"="+d);
  }
}