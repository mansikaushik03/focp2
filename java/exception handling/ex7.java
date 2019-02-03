class baseexception extends Exception{}
class base{
	base() throws baseexception{
	throw new baseexception();
	}
}
class derived extends base{
	//baseexception must be caught(no way) or
	//declared to be thrown:
	derived() throws baseexception{
	super();
	//not this way,'catch' without 'try'not allowed:
	//catch(baseexception e){}
	//not this way either,because,because call to super
	//must be first statement in constructor:
	//try{
	//super();
	//}catch(baseexception e){}
	}
}
public class ex7{
	public static void main(String args[]){
	try{
	derived d=new derived();
	}catch(baseexception e){
	System.out.println("baseexception caught in main()");
	}
	}
}