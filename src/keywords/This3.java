package keywords;

public class This3 {    // @ use to invoke current class constructor
	
    This3(){  // no args
    	System.out.println(" no args constrictor");
    }
    
    This3(int a){ // args constructor
    	
    	this();
    	System.out.println(" args constructor");
    }
	
	public static void main(String[] args) {
		
		This3 t=new This3(20);

	}

}
