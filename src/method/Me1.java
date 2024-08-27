package method;

public class Me1 {                         // example of method 

 public void m1(){                         // create user define method --> accessmodifier returnType MethodName (){
	 System.out.println("hello lalit");
     System.out.println("this is a");
	 System.out.println("example of");
	 System.out.println("Method");
	 
 }
	public static void main(String[] args) {
	
		Me1 abc=new Me1();                 // create a class --> classname refveriable=new classname();
		abc.m1();                          // to call --> refveriable.MethodName(); 

	}

}
