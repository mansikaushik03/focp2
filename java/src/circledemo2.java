public void getradius()
{
	System.out.print(radius);
}
void findarea()
{
	area=3.14*radius*radius;
}
void displayarea()
{
	System.out.println("the area of triangle is :" +area);
}
}
class circledemo2
{
	public static void main(String args[])
	{
	circle c=new circle();
	c.setradius();
	c.getradius();
	c.findarea();
	c.displayarea();
	}
}
