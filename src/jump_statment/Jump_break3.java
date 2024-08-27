package jump_statment;

public class Jump_break3 {

	
	public static void main(String[] args) {

		int a=0;
		while(a<=100) 
		{ 
			System.out.println("Value of variable is: "+a);
			if (a==2)
			{ 
				break; 
			}
			
			 a++;
		}
		   System.out.println("Out of while-loop"); 
	}
}


