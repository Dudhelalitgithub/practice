package keywords;

class a1{        //  super keyword refer to parent class of instance variable
	
	int a;
}

public class Super1 extends a1{
	
    Super1(int a){
    	super.a=a;
    	System.out.println(a);
		
	}

	
	public static void main(String[] args) {
		
		Super1 s=new Super1(20);

	}

}
