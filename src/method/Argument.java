package method;

public class Argument {           // ## Argument Method ##

public void m1(int a,int b,int c, int d ) {     // create user define method --> accessmodifier returnType MethodName (){
	                                            // here we use Argument in Parameters -> (int a int b, int c, int d)
	
	 int e= a+b+c+d;
		System.out.println(e);
		
	}
	public static void main(String[] args) {
	 
	 Argument abc=new Argument();
	 abc.m1(10,20,30,40);

	}

}
