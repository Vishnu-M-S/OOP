import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int l,sum=0;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of array: ");
l=sc.nextInt();
System.out.println("Enter the elements: ");
	for(int i=0;i<l;i++)
	{
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
System.out.println("The sum is:"+sum);
}
}

