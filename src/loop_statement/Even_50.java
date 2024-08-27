package loop_statement;

public class Even_50 {       // ## 1 to 50 even number 

	
	public static void main(String[] args) {
		// Print even number 1 to 50
		
		// a= 1...2..3...3%2=1.5 = false .....4(4%2=2)= true...5...6........50...51(exit)
		
		for(int a=1; a<=50; a++)
			
		if(a%2==0){
			System.out.println(a);  // 2...4...6........50
		}

	}

}
