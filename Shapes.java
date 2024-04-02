import java.util.*;
class S_area
{
double pi=3.14,area;
void area(int a)
{
	area=a*a;
	System.out.println("area of square is "+area);
}
void area(int l,int b)
{
	area=l*b;
	System.out.println("area of rectangle is "+area);
}
void area(double r)
{
	area=pi*r*r;
	System.out.println("area of circle is "+area);
}
}
class Shapes
{
	public static void main(String args[])
	{
	S_area shape= new S_area();
	shape.area(5);
	shape.area(5,10);
	shape.area(5.0);
	}
}
