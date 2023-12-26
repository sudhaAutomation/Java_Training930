package basics;

public class ATMProcess {

	String actHolderName = "Ramu";
	int acountNUmber = 1234567;
	int currentBal = 5000;

	public void dispalyDetails() {
		System.out.println(actHolderName.concat(" is the account holder name"));
		System.out.println("my account number is " + acountNUmber);
		System.out.println("my current balance is " + currentBal);
	}

	public void withDraw(int amount) throws Exception {
		System.out.println("withDrawn amount is " + amount);
		if (amount <= currentBal) {
			currentBal = currentBal - amount;
			dispalyDetails();
		} else {
			//System.out.println("insuffienct funds in your account");
			throw new Exception("insuffienct funds in your account");
		}

	}

	public void deposit(int amount) {
		System.out.println("deposited amount is " + amount);
		currentBal = currentBal + amount;
		dispalyDetails();

	}

}
