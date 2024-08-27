package method;

public class Nonargument {          // ## Non Argument method ##

	public void m1(){          // <-- here we not use Argument in Parameters  // create user define method --> accessmodifier returnType MethodName (){
		
		System.out.println("this is non argument method");
		
	}
	public static void main(String[] args) {
	
		Nonargument abc=new Nonargument();              // with the help of object --> cteate a object -> classname refveriable=new classname ();
		abc.m1();                                       // to call -> refvariableofobject.methodname();

	}

}
