public class heartrate {
	String firstname,lastname;
	dob d;
	public heartrate(String fname,String lname,int mon,int da,int ye)
{
	firstname=fname;
	lastname=lname;
	d=new dob();
	d.setdob(da,mon,ye);
	}
	public void setfirstName(String fname){
	firstname=fname;
	}
	//get first name
	public String getlastname(){
	return firstname;
	}
	public void setlastname(String lname){
	lastname=lname;
	}
	public String getlastname(){
	return lastname;
	}
	public int getage(){
	return(2019-d.year);
	}
	public void targetheartrate(){
	System.out.print("target heart rate range: "+maximumheartrate()*0.5 + "to"+ maximumheartrate()*0.85);
}}