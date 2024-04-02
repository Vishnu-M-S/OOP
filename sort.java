import java.util.*;
class sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[size];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			System.out.print("Element "+(i+1)+":");
			arr[i]=sc.nextLine();
		}
		System.out.println("The original array is: ");
		for(String str:arr)
		{
			System.out.print(str+" ");
		}
		Arrays.sort(arr);
		System.out.println("The sorted array is: ");
		for (String str : arr)
		{
			System.out.print(str+" ");
		}
		sc.close();
	}
}
