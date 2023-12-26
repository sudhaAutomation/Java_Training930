package oops;

 public class Car {
	final String carcolour="white";
	String carNo;
	String model;

	public void carBody() {
		System.out.println(carcolour);
		System.out.println("Parent Car body implemented");
	}

	public void carStart() {
		System.out.println("Parent Car start method implemented");

	}

	public void carStop() {
		System.out.println("Parent Car stop method implemented");

	}
	public void drive(int i) {
		System.out.println("Paretn Car is ready to drive "+i);
	}
	public void manualGear() {
		System.out.println(carcolour);
		System.out.println("Parent Car MAnual gear system implemeted");
	}

}
