import java.util.Scanner;
public class array
{
public static void main(String [] args)
{
Scanner read=new Scanner(System.in);
System.out.print("enter size of array:");
int n=read.nextInt();
int a[]=new int[n];
int i,j,temp=0;
System.out.println("enter elements of array:");
for(i=0;i<n;i++)
a[i]=read.nextInt();
System.out.print("entered array is:");
for(i=0;i<n;i++)
System.out.print(a[i]+"\t");
for(i=n;i>1;i--)
{
for(j=1;j<i;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.print("sorted array is:");
for(i=0;i<n;i++)
System.out.print(a[i]+"\t");
}
}