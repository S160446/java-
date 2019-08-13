class static_ex
{
static int a;
static void display()
{
a=20;
System.out.println(a);
}
}
class main
{
public static void main(String [] args)
{
static_ex.display();
}
}