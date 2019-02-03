public class rectangle
{
	private double length;
	private double width;
	double area,perimeter;
	public rectangle(){
	length=10;
	width=10;
	}
	public rectangle(double 1,double w){
	length=1;
	width=w;
	}
	public void setdimension(double a,double b)
	{
	length=a;
	width=b;
	}
	public double getlength(){
	return length;
	}
	public double getwidth(){
	return width;
	}
	public double area(){
	area=length*width
	return area;
	}
	public double perimeter(){
	perimeter=length+width;
	return perimeter;
	}
	public void print()
	{
	System.out.print("the area is:" +area);
	System.out.print("the perimeter is:"+perimeter);
	}
}