class shape
{
	public void display()
	{
	System.out.println("this is a shape");
	}
}
class rectangle extends shape
{
	public void display()
	{
	System.out.println("this is a rectangle");
	}
public void increaselength()
{
	System.out.println("length is increased");
}
}
class rectangledemo extends rectangle
{
	public static void main(String args[])
	{
	shape s;
s = new rectangle();
s.display(); 
//s.increaselength(); 
}
}