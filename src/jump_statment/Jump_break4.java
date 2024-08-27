package jump_statment;

public class Jump_break4 {

	
	public static void main(String[] args) {
		
		int var;
		for (var =100; var>=10; var --){
			System.out.println("var: "+var);
			if (var==99) 
			{
				break; 
			}
		}

		System.out.println("Out of for-loop");
	}

}
