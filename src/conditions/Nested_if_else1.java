package conditions;

public class Nested_if_else1 {

	
	public static void main(String[] args) {
		int age=12;
		int weight=50;
		if(age>=20){   //if 1st  condition is true then check next condition 
	                   // if 1st condition is not true then ignore all & print else
			       
			       if (weight>=50){
				   System.out.println("you can donate blood");
			                   }
			       else{
			       System.out.println("you can't donate blood");
					   }
		           } // <-- close 1st condition
			
		else{
		System.out.println("you can't donate blood");
			}
}// <-- close main method 
} // <-- close class
	


	


