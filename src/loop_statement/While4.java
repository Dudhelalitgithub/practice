package loop_statement;

public class While4 {              //  // ## print odd number 200 to 150

	
	public static void main(String[] args) {

		int a=200;
		while(a>=150){
			if(a%2!=0){
				System.out.println(a);
			}
			
			a--;
		}
	}

}
