abstract class Shape
{
	double dim1;double area;
	double dim2;
	Shape(double a,double b)
	{
	dim1=a;
	dim2=b;
	}
	abstract double area();
	abstract  void displayarea();
}

class Rectangle extends Shape
{
	Rectangle(double a,double b)
	{
	super(a,b);
	}

	double area()
	{
	System.out.println("Inside area for rectangle");
	//turn dim1*dim2;
	area=dim1*dim2;
	return area;
	}

	void displayarea()
	{
	System.out.println("Area of rectangle is"+area);
	}

}
	class Triangle extends Shape
	{
	Triangle(double a,double b)
	{
	super (a,b);
	}
	double area()
	{
	System.out.println("Inside area for Triangle");
	area=dim1*dim2;
	return area;
	}
	void displayarea()
	{
	System.out.println("Area of Triangle is"+area);
	}
	}
	class ShapeDemo
	{
	public static void main(String args[])
	{
	Triangle tat=new Triangle(20,30);
	Rectangle bat=new Rectangle(20,30);
	Shape s;
	s=tat;
	s.area();
	s.displayarea();
	s=bat;
	s.area();
	s.displayarea();
	}
}