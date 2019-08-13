class rectangle
{
    int l,b;
    int area()
    {
        return l*b;
    }
    void perimeter(int x,int y)
    {
        l=x;
        b=y;
        System.out.println("Perimeter of rectangle with length="+l+" and breadth="+b+" is:"+2*(l+b));
    }
}
class main
{
  public static void main(String [] met)
  {
      int r;
      rectangle r1=new rectangle();
      r1.l=10;
      r1.b=30;
      r=r1.area();
      r1.perimeter(10,20);
      System.out.println("area of rectangle with length="+r1.l+" and breadth="+r1.b+" is:"+r);
  }
}
