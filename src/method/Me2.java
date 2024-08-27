package method;

public class Me2 {                           // ## Static Method ##
                                              
	static int a=10;                         // use static keyword
	static int b=20;
	static int c=30;
    static int d=40;              
          
   static public void m2(){                 // create user define method --> accessmodifier returnType MethodName (){
    	int e=a+b;
    	int f=b+c;
    	int g=c+d;
    	int h=a+b+c+d;
    	
    	System.out.println(e);
    	System.out.println(f);
    	System.out.println(g);
    	System.out.println(h);
    }
	
	public static void main(String[] args) {   // we can call by two type 1( help of object) 2(help of class )
		
		Me2 abc=new Me2();                     // with the help of object --> cteate a object -> classname refveriable=new classname ();
		abc.m2();                              // to call -> refvariableofobject.methodname();
	        
		Me2.m2();                              // with the help of class -> classname.methodname();
		
		
     
	}

}
