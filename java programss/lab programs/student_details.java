public class student_details
{
int rno;
String name;
long mobno;
void display()
{
System.out.println("Student details are:");
System.out.println("Student Name is:"+name);
System.out.println("Roll number is:"+rno);
System.out.println("Mobile number is:"+mobno);
}
}
class main
{
public static void main(String [] args)
{ 
student_details s1=new student_details();
s1.rno=17;
s1.name="kavya";
s1.mobno=9502708;
s1.display();
}
} 