package polymorphism;

public class Compile2 {
	
	void m1(int a, String b){
		
	}
	
	void m2(String a , String b){
		
	}
	
	void m3(int a){
		
		System.out.println("hello");
	}

	
	public static void main(String[] args) {

		Compile2 a=new Compile2();
		a.m3('z');     //  z autotransform hoto int a medhe // lower to higher
		
	}
	
	public static void main(int a){
		
	}

}
