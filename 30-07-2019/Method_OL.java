

import java.util.Scanner;
class Area
{
void area(float r)
{
System.out.println("Area of circle is:"+(Math.PI*r*r));
}
void area(int l,int b)
{
System.out.println("Area of rectangle is:"+(l*b));
}
void area(double b,double h)
{
System.out.println("Area of triangle is:"+((b*h)/2));
}
}
class Switch
{
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);
Area obj=new Area();
System.out.println("Area Menu:");
System.out.println("1.Circle");
System.out.println("2.Rectangle:");
System.out.println("3.Triangle");
System.out.print("Enter your choice:");
int a=read.nextInt();
switch(a)
{
case 1:System.out.print("Enter radius of the circle:");
           float r=read.nextFloat();
           obj.area(r);
           break;
case 2:System.out.print("Enter length of the rectangle:");
           System.out.print("Enter breadth of the rectangle:");
           int l=read.nextInt();
           int b=read.nextInt();
           obj.area(l,b);
           break;
case 3:System.out.print("Enter base of the triangle:");
          double d=read.nextDouble();
          System.out.print("Enter height of the triangle:");
          double h=read.nextDouble();
           obj.area(d,h);
           break;
default:System.out.println("Sorry........You have chosen wrong option.");
}
}
}


