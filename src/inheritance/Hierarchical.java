package inheritance;

class b1{                  // ## Hierarchical Inheritance 
	void m1(){
		System.out.println("m1 method");
	}
}

class b2 extends b1{
	void m2(){
		System.out.println("m2 method");
	}
}

class b3 extends b1{
	void m3(){
		System.out.println("m3 method");
	}
}

public class Hierarchical extends b1 {        // Hierarchical is a class name in the package
	void m4(){
		System.out.println("m4 method ");
	 }


	
	public static void main(String[] args) {
	 b2 r=new b2();          // You can call any child class no need to call all 
	 r.m1();
	 r.m2();
	 b3 t=new b3();
	 t.m3();
	 Hierarchical c=new Hierarchical();
	 c.m4();
	 
	
	}
}

