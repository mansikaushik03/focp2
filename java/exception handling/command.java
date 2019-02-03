class checkargument extends Exception{
}
class command
{
	public static void main (String args[]){
	int i,j;
	int ans=0;
	int s[]=new int[5];
	try
	{
	int cnt=0;
	for(i=0;i<s.length;i++)
	{
	s[i]=Integer.parseInt(args[i]);
	cnt++;
	if(args.length<5){
	throw new checkargument();
	}
	else if(args.length>5){
	throw new checkargument();
	}
	}
	for(i=0;i<s.length;i++)
	{
	ans=ans+s[i];
	}
	}
	catch(checkargument m)
	{
	System.out.println("passed 5 integer");
	}
	System.out.println( "the sum is"+ans);
	System.out.println( "the avg is"+ans/5);
}}