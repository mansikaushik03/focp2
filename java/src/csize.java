import java.util.*;
interface geometricobject
{
	public double getperimeter();
	public double getarea();
}
class circle implements geometricobject
{double radius =1.0;
circle(double radius)
{this.radius=radius;}
public double getperimeter()
{double perimeter=2*3.14*radius;
return perimeter;}
public double getarea()
{double area=3.14*radius*radius;
return area;}}
interface resizable
{
	public double resize(int percent);
}
class resizablecircle extends circle implements resizable
{public resizablecircle(double radius)
{super(radius);}
public double resize(int percent)
{radius =(radius*percent)/100;
return radius;}}
class csize
{public static void main(String args[])
{resizablecircle c1= new resizablecircle(2);
Scanner s1 =new Scanner(System.in);
System.out.print("Enter the percentage");
int per = s1.nextInt();
double p=c1.getperimeter();
double a=c1.getarea();
System.out.println(p);
System.out.println(a);
System.out.println(c1.resize(per));}}


