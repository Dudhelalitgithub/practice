package task;

interface RBI {

	 void personalloan();
	 void homeloan();
	 void rateofinterest();
}

class ICICI implements RBI{

	public void personalloan() {
		System.out.println("ICICI rate of interest for personalloan is 10%");
	}

	public void homeloan() {
		System.out.println("ICICI rate of interest for homeloan is 9%");
	}

	public void rateofinterest() {
		System.out.println("ICICI rate of interest is 6.5%");
	}
	
}



class SBI implements RBI{

	public void personalloan() {
		System.out.println("SBI rate of interest for presonalloan is 11%");
	}

	public void homeloan() {
		System.out.println("SBI rate of interest for homeloan is 8%");
	}

	public void rateofinterest() {
		System.out.println("SBI rate of interest is 6.5%");
	}
	
}

public class Bank {

	
	public static void main(String[] args) {

		ICICI icici=new ICICI();
		icici.personalloan();
		icici.homeloan();
		icici.rateofinterest();
		
		System.out.println();
		
		SBI sbi=new SBI();
		sbi.personalloan();
		sbi.homeloan();
		sbi.rateofinterest();
	}

}
