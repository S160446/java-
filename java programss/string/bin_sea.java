import java.util.Scanner;
class binary
{
public static void main(String [] args)
{
int i,n,s,f,l,m;
Scanner key=new Scanner(System.in);
System.out.print("Enter size of the array:");
n=key.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of the array:");
for(i=0;i<n;i++)
    a[i]=key.nextInt();
System.out.print("Enter search element:");
s=key.nextInt();
f=0;
l=n-1;
for(i=0;i<n;i++)
{
    m=(f+l)/2;
    if(s==a[m])
    {
    System.out.println("Element found.");
    break;
    }
    else if(a[m]>s)
    {
    l=m-1;
    }
    else if(a[m]<s)
    {
    f=m+1;
    }
    if(i==n-1)
    {
    System.out.println("Element not found.");
    }
}
}
}
}

