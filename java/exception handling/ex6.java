class leveloneexception extends Exception {}
class leveltwoexception extends leveloneexception {}
class levelthreeexception extends leveltwoexception {}
class A{
	void f () throws leveloneexception{
		throw new leveloneexception();

	}
}
class B extends A {
	void f() throws leveltwoexception{
		throw new leveltwoexception();
	}
}
class C extends B {
	void f() throws levelthreeexception{
		throw new levelthreeexception();
	}
}
public class ex6{
	 public static void main(String[] args) {
	A a=new C();
	try{
		a.f();
	}	catch(levelthreeexception e3){
		System.out.println("caught e3");
	} catch(leveltwoexception e2){
		System.out.println("caught e2");
	}catch(leveloneexception e1){
		System.out.println("caught e1");
	          }
       }
}