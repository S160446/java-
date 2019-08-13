class example
{
  int a;
  void display()
  {
      a=10;
      System.out.println(a);
  }
}
class main
{
   public static void main(String [] sir)
   {
       example k9=new example();
       k9.a=30;
       System.out.println(k9.a);
       k9.display();
       System.out.println(k9.a);
       
   }
}
