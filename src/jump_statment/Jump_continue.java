package jump_statment;

public class Jump_continue {

	
	public static void main(String[] args) {

		// a=1...2...3...4...5...6
		
		for( int a=1; a<=10; a++){
		
			if(a==5){      // 5==5 ahe mhnun continue hoil ani khalchi janar nAHI(sop) direct a++ honar
				continue;  
			}
			System.out.println(a);  // 1...2...3...4...6
		}
	}

}
