public class rectangle
{
void display(int x,int y)
{
System.out.println("Area of rectangle is:"+(x*y));
System.out.println("Perimeter of rectangle is:"+(2*(x+y)));
}
}
class main
{
public static void main(String [] args)
{
rectangle k9=new rectangle();
k9.display(5,6);
}
}
