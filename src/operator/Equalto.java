package operator;

public class Equalto {

	public static void main(String[] args) {
		int a = 10;
		 int b = 20;
		 System.out.println("a == b = " + (a == b) ); //Checks if the values of two operands are equal or not,
		                                               //....if yes then condition becomes true.--> (A == B) is not true. 		                                              
		 
		 System.out.println("a != b = " + (a != b) ); // Checks if the values of two operands are equal or not, 
		                                              //....if values are not equal then condition becomes true.-->(A != B) is true. 
		 
		 System.out.println("a > b = " + (a > b) );   //Checks if the value of left operand is greater than the value of right operand,
		                                              //...if  yes then condition becomes true. --> (A > B) is not true. 
		
		 System.out.println("a < b = " + (a < b) );   // Checks if the value of left operand is less than the value of right operand, 
		                                              //.... if yes then condition becomes true.--> (A < B) is true.
		
		 System.out.println("b >= a = " + (b >= a) );  //Checks if the value of left operand is greater than or equal to the value of right
		                                                //...operand, if yes then condition becomes true.--> A >= B) is not true
		 
		 System.out.println("b <= a = " + (b <= a) );  // Checks if the value of left operand is less than or equal to the value of right
		                                               //.... operand, , if yes then condition becomes true.--> (A <= B) is true. 

	}

}
