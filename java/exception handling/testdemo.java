class test{
	public void display()
	{
	System.out.println("test is displayed");
	}
	class testdemo
	{
	public static void main(String args[])
	{
	test t=null;
	try{
	t.display();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}}}
