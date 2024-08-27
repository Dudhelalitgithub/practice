package loop_statement;

public class Odd_50 {               //## Odd number 1 to 50 

	
	public static void main(String[] args) {
		// Print Odd number 1 to 50
		
		// a= 1...2..3...3%2=1.5 = true .....4(4%2=2)= false...5...6........50...51(exit)
		
		for(int a=1; a<=50; a++){
			
			if(a%2!=0){
				System.out.println("odd number " +a);
			  }
		}
	}

}
