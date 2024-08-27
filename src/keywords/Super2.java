package keywords;

class a2{
	
	void m1(){
	System.out.println("method m1");	
	}
	
}

public class Super2 extends a2{

	void m2(){
		
		super.m1();
		
		System.out.println("method m2");
	}
	
	public static void main(String[] args) {
		
		Super2 s=new Super2();
		s.m2();
	

	}

}
