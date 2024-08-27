package polymorphism;

public class Compile {
	
	public void login(int mobNo, int b ){
		
	System.out.println("navigate to home");
		 
	}
	
	
	public void login( String email , String pass ){
		
		
		System.out.println("navigate to home page");
	}

	
	public static void main(String[] args) {
		
	   Compile fb=new Compile();
	   
	   fb.login( 976351551 ,  45 );   // navigate by mob no and password
	   
	   

	}

}
