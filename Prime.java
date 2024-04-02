import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
int a,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
for(int i=2;i<=a/2;i++)
	{
	if(a%i==0)
		{
		flag=1;
		break;
		}
	}
if(flag==1)
	System.out.println("It is not a prime number.");
else
	System.out.println("It is a prime number.");	
}
}


