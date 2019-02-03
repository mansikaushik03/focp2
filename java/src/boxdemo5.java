class box
{
	double width,w;
	double height,h;
	double depth,d;

	box(){
	System.out.println("constructing box");
	
	width=10;
	height=10;
	depth=10;

	}
	box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	return width*height*depth;
	{
	
	class boxdemo5{
		public static void main(String args[])
	{

box mybox1=new box();
box mybox2=new box(3,6,9);
double vol1;
vol=mybox.volume();
System.out.println("volume is" + vol);
vol1=mybox2.volume();
System.out.println("volume is" + vol);
}
}