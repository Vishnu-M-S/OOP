import java.util.Scanner;
class Average
{
public static void main(String args[])
{
float sum=0,avr;
int a[]=new int[10],l;
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of array: ");
l=sc.nextInt();
System.out.println("Enter the elements: ");
	for(int i=0;i<l;i++)
	{
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
avr=sum/l;
System.out.println("The sum is:"+sum);
System.out.println("The average is:"+avr);
}
}

