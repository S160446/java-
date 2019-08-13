public class student
{
int rno;
String name;
long mobno;
void display()
{
System.out.println("Student details are:");
System.out.println("Name is:"+name);
System.out.println("Roll number is:"+rno);
System.out.println("Mobile number is:"+mobno);
}
}
class main
{
public static void main(String [] args)
{
student s1=new student();
student s2=new student();
student s3=new student();
s1.rno=1;
s1.name="Praveena";
s1.mobno=9849202900l;
s2.rno=2;
s2.name="Prameela";
s2.mobno=9849202901l;
s3.rno=1;
s3.name="Praveen";
s3.mobno=9849202902l;
s1.display();
s2.display();
s3.display();
}
}