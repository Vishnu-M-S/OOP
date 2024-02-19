import java.util.*;
class Product
{
int p_code,price;
String p_name;

Product(int p_code,String p_name,int price)
{
	this.p_code=p_code;
	this.p_name=p_name;
	this.price=price;

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
		p1=new Product(101,"apple",25);
		p2=new Product(102,"grape",30);
		p3=new Product(103,"pear",20);
		
		System.out.println("The product with the lowest price is:");
		if(p1.price<p2.price && p1.price<p3.price)
		p1.display();
		
		else if(p2.price<p1.price && p2.price<p3.price)
		p2.display();
		
		else
		p3.display();
	}
}
		
