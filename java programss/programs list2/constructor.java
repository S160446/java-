class example
{
int a,b;
example(int x)
{
a=x;
}
}
class main
{
public static void main(String [] args)
{
example obj=new example(30);
obj.b=10;
System.out.println(obj.a);
System.out.println(obj.b);
}
}
