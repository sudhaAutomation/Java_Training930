package basics;

public class TestATMProcess {

	public static void main(String[] args) throws Exception {
		ATMProcess atm = new ATMProcess();
		atm.dispalyDetails();
		atm.deposit(10000);
		atm.withDraw(20000);
		
		
	}

}
