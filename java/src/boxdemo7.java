class box
{
	double width;
	double height;
	double depth;

	box(){
	System.out.println("constructing box");
	
	width=-1;
	height=-1;
	depth=-1;

	}
	box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
box(double len)
{
width=height=length=len;
}
	double Volume(){
	return width*height*depth;
	}
}
	
	class boxdemo7{
		public static void main(String args[])
	{

box mybox1=new box();
box mybox2=new box(3,6,9);
double vol1;
vol1=mybox1.volume();
System.out.println("Volume is" +Vol);
Vol=mybox2.volume();
System.out.println("Volume is" +Vol);
box mycube=new box(7);
Vol=mycube.volume();
System.out.println("Volume of mycube is" +vol);
//vol=mybox3.volume();
//System.out.println("volume is" +vol);
}
}