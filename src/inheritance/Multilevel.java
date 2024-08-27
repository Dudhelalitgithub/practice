package inheritance;

class a2{
	void m1(){
		System.out.println("m1 method");
	}
}

class a3 extends a2{
	void m2(){
		System.out.println("m2 method");
	}
}


public class Multilevel extends a3 {
	void m3(){
		System.out.println("m3 method");
	}

	
	public static void main(String[] args) {
		
		Multilevel x=new Multilevel();
		x.m1();
		x.m2();
		x.m3();
		
	}
	

}
