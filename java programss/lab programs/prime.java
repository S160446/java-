public class prime
{
public static void main(String [] args)
{
int count=0,i,j;
System.out.println("prime num between 1 and 100 are:");
for(i=2;i<=100;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
count++;
}
if(count==0)
System.out.print(i+"\t");
count=0;
}
}
}