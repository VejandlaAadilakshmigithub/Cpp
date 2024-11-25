
import java.util.*;
class Shape
{
	protected int x; 
	
	public Shape(int x) 
	{
	  this.x= x;
	  System.out.println("x value is :"+this.x);
	}	
}

class Circle extends Shape
{
	protected final double PI = 3.14;
	public Circle(int radius)
	{
		super(radius);
	}
	
	public void getAreaOfCircle()
	{
		double area = PI*x*x;
		System.out.println("Area of Circle is :"+area);
	}
	
}

class Rectangle extends Shape
{
	protected int breadth;
	public Rectangle(int length, int breadth)
	{
		super(length);
		this.breadth = breadth;
	}
	
	public void getAreaOfRectangle()
	{
		double area = breadth * x;
		System.out.println("Area of Rectangle is :"+area);
	}	
}
public class Hierarical 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle :");
		int radius = sc.nextInt();
		
		Circle c1 = new Circle(radius);
		c1.getAreaOfCircle();
		
		System.out.print("Enter the length of the Rectangle :");
		int length = sc.nextInt();
		
		System.out.print("Enter the breadth of the Rectangle :");
		int breadth = sc.nextInt();
		
		Rectangle rr = new Rectangle(length, breadth);
		rr.getAreaOfRectangle();
		
	}

}