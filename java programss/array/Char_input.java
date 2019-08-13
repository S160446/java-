import java.util.Scanner;
class read_char
{
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);
System.out.print("Enter Character:");
char a=read.next().charAt(0);
System.out.print("Entered Character is:"+a);
}
}