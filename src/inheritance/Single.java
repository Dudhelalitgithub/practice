package inheritance;

class a1{
	void m1(){
		System.out.println("m1 method");
	}
}

public class Single extends a1{             // single is the name of call which is created in package
	void m2(){
		System.out.println("m2 method");
	}

	
	public static void main(String[] args) {

	Single a=new Single();
	a.m1();
	a.m2();
	}

}
