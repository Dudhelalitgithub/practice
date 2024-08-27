package switch_case;

public class Switch_w_break {     // ## Switch without using break

	
	public static void main(String[] args) {
		int i=2; 
		switch(i) 
	  { 
		case 1: System.out.println("Case1 ");
		case 2: System.out.println("Case2 "); 
		case 3: System.out.println("Case3 "); 
		case 4: System.out.println("Case4 "); 
	
		default: System.out.println("Default ");
	  }
	} 
 }

//the control switched to the case 2, however we don’t have break statement after the case 2 
// that caused the flow to pass to the subsequent cases till the end.