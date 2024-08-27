package keywords;

class a3{
	
	a3(int a){
		
		System.out.println("a3 constructor");
	}
}

public class Super3 extends a3 {
	
	Super3(){
		
		super(50);
		
		System.out.println("Super contructor");
		
	}

	
	public static void main(String[] args) {
		
		Super3 s=new Super3();  // constructor directly invoke at creation of object if u dont use super keyword

	}

}
