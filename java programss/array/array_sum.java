class array_sum
{
public static void main(String [] args)
{
int marks[]={20,39},n,i,total=0;
n=marks.length;
for(i=0;i<n;i++)
 total=total+marks[i];
System.out.println("Total marks is:"+total);
}
}