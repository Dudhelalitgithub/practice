package keywords;

public class This2 {   // @ use to call/invoke current class method
	
	public void m1(){
		System.out.println("method 1");
	}
	
	public void m2() {
		this.m1();
		System.out.println("methid 2");
	}


	public static void main(String[] args) {
		
		This2 t=new This2();
		t.m2();

	}

}
