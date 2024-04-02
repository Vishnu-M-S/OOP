import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int l;
String org,rev="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string: ");
org=sc.nextLine();
l=org.length();
	for (int i=l-1;i>=0;i--)
		rev=rev+org.charAt(i);
System.out.println("Reverse of string: "+rev);
	if(org.equals(rev))
		System.out.println("It is a palindrome.");
	else
		System.out.println("It is not a palindrome.");
}
}

