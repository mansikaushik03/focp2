interface one
{
	void print1();
	void print2();
}
interface two extends one
{
	void print3();
}
class test implements two
{
	public void print1()
	{
	System.out.println("one-1");
	}
	public void print2()
	{
System.out.println("two-2");
	}
	public void print3()
	{
	System.out.println("three-3");
	}
}
class test1
{
	public static void main(String args[])
	{
	test t1=new test();
	t1.print1();
	t1.print2();
	t1.print3();
	}
}