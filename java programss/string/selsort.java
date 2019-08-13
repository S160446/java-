import java.util.Scanner;
class Selection
{
public static void main(String [] args)
{
int i,n,s,t=0,c=0,m,j;
Scanner key=new Scanner(System.in);
System.out.print("Enter size of the array:");
n=key.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of the array:");
for(i=0;i<n;i++)
   a[i]=key.nextInt();
System.out.println("Entered array is:");
for(i=0;i<n;i++)
{
   System.out.print(a[i]+"\t");
}
for(i=0;i<n;i++)
{
   m=i;
   for(j=i;j<n;j++)
   {
   if(a[m]>a[j])
   {
   t=j;
   }
   c=a[i];
   a[i]=a[t];
   a[t]=c;
   }
}
System.out.print("Sorted array is:");
for(i=0;i<n;i++)
   System.out.print(a[i]+"\t");
}
}



