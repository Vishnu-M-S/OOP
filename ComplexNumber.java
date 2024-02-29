import java.util.Scanner;

class complex
{
	int r, i;
	complex(int r, int i)
	{
		this.r = r;
		this.i = i;
	}
}

class ComplexNumber
{
	public static void main(String args[])
	{
			
		Scanner sc = new Scanner(System.in);
		System.out.println("First number:");
		System.out.print("Enter real part: ");
		int r = sc.nextInt();
		System.out.print("Enter image : ");
		int i = sc.nextInt();
		
		complex c1 = new complex(r, i);
		
		System.out.println("Second number:");
		System.out.print("Enter real part : ");
		r = sc.nextInt();
		System.out.print("Enter the image : ");
		i = sc.nextInt();
		
		complex c2 = new complex(r, i);
		
		int real = c1.r + c2.r;
		int image = c1.i + c2.i;
		
		System.out.println("Complex number : " + real + " + " + image +"i");
	}
}
