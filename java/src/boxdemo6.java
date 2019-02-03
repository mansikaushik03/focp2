class box{
	double width,w;
	double height,h;
	double depth,d;
	box(double width,double h,double d){
	this.width=width;
	this.height=height;
	this.depth=depth;

	}
	double volume(){
	return width*height*depth;
	}
}
class boxdemo6
{
	public static void main(String args[])
	{
	double volume;
	box box3=new box(12,34,67);
	volume=box3.volume();
	System.out.println(volume);
	}
}