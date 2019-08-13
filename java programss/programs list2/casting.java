class Narrowing
{
public static void main(String [] args)
{
byte b;
int a=128,d;
b=(byte)a;
float c=12.34f;
//byte c=128; error:Possible lossy conversion from integer to byte.
System.out.println(b);
System.out.println((int)c);
}
}