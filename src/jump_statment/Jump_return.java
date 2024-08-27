package jump_statment;

public class Jump_return {        // ## return statement

	
	public static void main(String[] args) {

		// a=1...2...3....9...10
		
		for( int a=1; a<=20; a++){
			if(a==10){
				return;         // if return execute the flow of execution go to main method and skip all 
			}
	         System.out.println(a);  // 1..2...3.....9
		}
	}

}
