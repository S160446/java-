

class rectangle
{
int l,b;
void rec1()
{
l=30;
b=40;
System.out.println("\nMethod without arguments and without return value");
System.out.println("Area of rectangle is:"+(l*b));
System.out.println("Perimeter of rectangle is:"+(2*(l+b)));
}
void rec2(int l,int b)
{
System.out.println("\nMethod with arguments and without return value");
System.out.println("Area of rectangle is:"+(l*b));
System.out.println("Perimeter of rectangle is:"+(2*(l+b)));
}
int rec3()
{
System.out.println("\nMethod without arguments and with return value");
l=20;
b=30;
return (l*b);
}
int rec4(int l,int b)
{
System.out.println("\nMethod with arguments and with return value");
return (l*b);
}
}
class main
{
public static void main(String[] args)
{
rectangle obj=new rectangle();
obj.rec1();
obj.rec2(10,40);
int area=obj.rec3();
System.out.println("Area of rectangle is:"+area);
int perimeter=obj.rec4(10,35);
System.out.print("Perimeter of rectangle is:"+perimeter);
}
}



