import java.util.Scanner;
class input
{
public static void main(String [] args)
{
Scanner key=new Scanner(System.in);
System.out.print("Enter integer value:");
int a=key.nextInt();
System.out.print("Enter Double value:");
double b=key.nextDouble();
System.out.print("Enter Float value:");
float c=key.nextFloat();
System.out.print("Enter Long value:");
long d=key.nextLong();
System.out.print("Enter String:");
String e=key.next();
System.out.print("Enter Short value:");
short f=key.nextShort();
System.out.print("Enter Booleanvalue:");
boolean g=key.nextBoolean();
System.out.print("Enter Byte value:");
byte h=key.nextByte();
System.out.println("Entered integer value is:"+a);
System.out.println("Entered Double value is:"+b);
System.out.println("Entered float value is:"+c);
System.out.println("Entered Long value is:"+d);
System.out.println("Entered String is:"+e);
System.out.println("Entered Short value is:"+f);
System.out.println("Entered Boolean value is:"+g);
System.out.println("Entered Byte value is:"+h);
}
}
