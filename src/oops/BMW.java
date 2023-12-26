package oops;

public class BMW extends Car {

	public void sunroof() {
		
		System.out.println("bmw sun roof implemented");

	}

	public void drive() {
		System.out.println(carcolour);
		System.out.println("BMW car is ready to drive");
	}

	public void manualGear() {
		
		System.out.println(carcolour);
		System.out.println("BMW Car MAnual gear system implemeted");
	}

	public static void main(String[] args) {
		Car r = new BMW();// child class object can be reffered with the parent class reference
							// variable,by this we can call the all parent class methods with that object
							// ,but at run time child classs methods will over ride the parent class methods
							// and execute the child class methods implementation, this is called as dynamic
							// polymorphism/run time polymorphism,D.P will be achieved by the method over
							// riding feature
		r.carBody();
		r.carStart();
		r.carStop();
		r.drive(10);
		r.manualGear();
		
		
		System.out.println(r.carcolour);

	}

}
