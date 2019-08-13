class static_ex
{
static int a=10;
static void display()
{
System.out.print(a);
}
static
{
a=30;
System.out.println("Executing Static block");
}
public static void main(String [] args)
{
System.out.println("Executing main block");
display();
}
}
