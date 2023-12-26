package oops;

public class ProjectCls implements MultipleInheritance,InterfaceA,InterfaceB {//has a relationship

	public static void main(String[] args) {
		ProjectCls v = new ProjectCls();
		v.accountOpening();
		v.savingsAccount();
		v.CurrentAccount();
		v.mobileBanking();
		v.myAccount();
		v.scholarshipAccount();

	}

	@Override
	public void accountOpening() {
		System.out.println("account opening method");

	}

	@Override
	public void savingsAccount() {
		System.out.println("savings account method");

	}

	@Override
	public void CurrentAccount() {
		System.out.println("Cuurent Account method");

	}

	@Override
	public void mobileBanking() {
		System.out.println("mobile banking method");

	}

	@Override
	public void scholarshipAccount() {
		System.out.println("scholarship acount method");

	}

	@Override
	public void myAccount() {
		String acountholdername = "Swhizz";
		String acountNUmber = "9887236";
		System.out.println("My acount details");
		System.out.println(acountholdername);
		System.out.println(acountNUmber);
	}

}
