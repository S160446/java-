class Static
{
static int a=10;
static int b;
//void display()
//{
//System.out.println(a);
//}
static void print()
{
System.out.println(a);
System.out.print(b);
}
static
{
System.out.println("Static");
b=a*20;
}
public static void main(String[] args)
{
System.out.println("Main");
print();
}
}