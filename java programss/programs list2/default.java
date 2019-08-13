class Default
{
long h;int a;short b;byte c;float d;double e;boolean f;char g;
}
class main
{
public static void main(String [] args)
{
Default obj=new Default();
System.out.println("Long default value using object:"+obj.h);
System.out.println("Integer default value using object:"+obj.a);
System.out.println("short default value using object:"+obj.b);
System.out.println("Byte default value using object:"+obj.c);
System.out.println("Float default value using object:"+obj.d);
System.out.println("double default value using object:"+obj.e);
System.out.println("Boolean default value using object:"+obj.f);
System.out.println("Character default value using object:"+obj.g);
}
}