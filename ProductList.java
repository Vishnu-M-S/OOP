import java.util.*;
class Product
{
int p_code,price;
String p_name;

/*void Product(int p_code,String p_name,int price)
{
	self.p_code=p_code;
	self.p_name=p_name;
	self.price=price;

}*/

	void read()
	{
	Scanner sc=new Scanner(System.in);
	Scanner st=new Scanner(System.in);
		System.out.println("Enter details of product:");
		System.out.print("Product Code: ");
		p_code=sc.nextInt();
		System.out.print("Product Name: ");
		p_name=st.nextLine();
		System.out.print("Price: ");
		price=sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Product Code: "+p_code+"\nProduct Name: "+p_name+"\nPrice: "+price);
	}
}
class ProductList
{
	public static void main(String args[])
	{	
		Product p1,p2,p3;
		p1=new Product();
		p1.read();
		p2=new Product();
		p2.read();
		p3=new Product();
		p3.read();
		
		System.out.println("The product with the lowest price is:");
		if(p1.price<p2.price && p1.price<p3.price)
		p1.display();
		
		else if(p2.price<p1.price && p2.price<p3.price)
		p2.display();
		
		else
		p3.display();
	}
}
		
