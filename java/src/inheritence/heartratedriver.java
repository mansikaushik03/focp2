import java.util.*;
class heartratesdriver{
public static void main(String[] args){
Scanner input =new Scanner(System.in);
heartrates myheartrate[]=new heartrates[2];
for(int count=0;count<(myheartrate.length);count++)
{
System.out.println("enter first name:");
String firstname=input.nextLine();
System.out.println("enter last name:");
String lastname=input.nextLine();
System.out.println("enter birthdate:"+"\nmm"+"\ndd"+"\nyear");
int month=input.nextInt();
int day=input.nextInt();
int year=input.nextInt();
input.nextLine();
myheartrate[count]=new heartrates(firstname,lastname,month,day,year);
System.out.println("firstname"+"\t"+"lastname"+"\t"+"age in years"+"\t"+"maximum heartrate"+"\t"+"targetheartrate\n");
System.out.print(firstname+"\t"+lastname+"\t"+myheartrate[count].getage()+"\t"+"targetheartrate\n");
myheartrate[count].targetheartrate();
}
}
}