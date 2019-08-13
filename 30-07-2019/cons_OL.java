class constructor
{
display()
{

System.out.println("This is the example for constructor without arguments.");
}
display(int a)
{
System.out.println("This is the example for constructor with one argument:");
System.out.println("The argument passed is:"+a);
}
display(int a,int b)
{
System.out.println("This is the example for constructor with two arguments:");
System.out.println("The arguments passed are:"+a+" and "+b);
}
}
class overloading
{
public static void main(String [] args)
{
display obj1=new display();
display obj2=new display(10);
display obj3=new display(20,30);
}
}
