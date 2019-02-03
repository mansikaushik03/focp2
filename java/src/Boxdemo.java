import java.util.*;class Box
{
	double width,w;
	double height,h;
	double depth,d;
	void setdim()
	{
	w=width;
	h=height;
	d=depth;
	}
	double volume()
	{
	return w*h*d;
	}
}
class Boxdemo
{
	public static void main(String args[])
	{
	double volume;
	Scanner input=new Scanner(System.in);
	
	Box b1=new Box();
	Box b2=new Box();
	System.out.print("enter valus for box");
	b1.width=input.nextInt();
	b1.height=input.nextInt();
	b1.depth=input.nextInt();
	b1.setdim();
	volume=b1.volume();
	System.out.print("volume is :" +volume);
	}
}