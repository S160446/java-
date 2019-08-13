import java.util.Scanner;
class arrayinput
{
public static void main(String [] args)
{
int n,i;
System.out.print("Enter size of the array:");
Scanner arr=new Scanner(System.in);
n=arr.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of the array:");
for(i=0;i<n;i++)
{
a[i]=arr.nextInt();
}
System.out.println("Entered array is:");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
}
}