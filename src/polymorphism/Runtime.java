package polymorphism;
class a4 {
	
	public void  grt(){
		System.out.println("Goog Morning");
	}
}

public class Runtime extends a4 {
	
	public void  grt(){
		System.out.println("Hello");
	}



 public static void main (String[] args) {
		
    Runtime b=new Runtime();
	b.grt();
	}
}


