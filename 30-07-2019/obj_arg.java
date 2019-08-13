class first
{
int a,b,c;
void on(first y)
{
a=y.a;
b=y.b;
c=y.c;
}
void one(int i,int j,int k)
{
a=i;
b=j;
c=k;
}
int calc()
{
return a+b+c;
}
}
class obj_arg
{
public static void main(String [] args)
{
first obj1=new first();
obj1.one(29,48,67);
first obj2=new first();
obj2.on(obj1);
System.out.println("Arguments passed result is:"+obj1.calc());
System.out.println("Object passed result is:"+obj2.calc());
}
}

