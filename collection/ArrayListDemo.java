import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		System.out.println("Initial size of al:"+al.size());
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("D");
		al.add("F");
		System.out.println("Initial size addition al:"+al.size());
		System.out.println("Initial size addition al:"+al);
		al.remove("F");
		al.remove(2);
		System.out.println("Initial size delection al:"+al.size());
		System.out.println("Initial size delection al:"+al);
	}
}