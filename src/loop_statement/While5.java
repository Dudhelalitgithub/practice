package loop_statement;

public class While5 {       // ## print odd number 50 to 100

	
	public static void main(String[] args) {

		int a=50;
		while(a<=100){
			if (a%2!=0){
				System.out.println(a);
			}
			
			a++;
		}
	}

}
