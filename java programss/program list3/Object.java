class obj
{
int a;
void display()
{
System.out.println(a);
}
}
class main
{
public static void main(String[] args)
{
obj a1=new obj();
a1.a=10;
obj a2=a1;
a1.display();
a2.display();
a2.a=20;
a1=null;
a1.display();
a2.display();//10 10 20 20
}
}
