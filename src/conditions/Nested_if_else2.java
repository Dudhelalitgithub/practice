package conditions;

public class Nested_if_else2 {

	
	public static void main(String[] args) {
	int a=50;
	int b=50;
	int c=50;
	
	if(a==b){     //if 1st  condition is true then check next condition 
		           // if 1st condition is not true then ignore all & print else 
		
	      if(b==c){
	    	  System.out.println("b is equal to c");
	              }
	      else {
	    	  System.out.println("b is not equal to mc");
	           }
	
	       }  // <-- 1st if close
	 
	
    else {
		System.out.println("values are not equal");
		   }
	
	} // <-- close main method 
	} // <-- close class

