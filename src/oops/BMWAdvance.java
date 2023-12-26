package oops;

public class BMWAdvance extends BMW {
	static int bsample=20;

	public void gmapsConnectivity() {
		System.out.println("Gmaps Connectivity is implemented");

	}

	public static void main(String[] args) {
		BMWAdvance c = new BMWAdvance();
		//c.carcolour = "Maroon";
		c.carNo = "34Ts1234";
		c.model = "7890";
		System.out.println(c.carcolour);
		System.out.println(c.model);
		System.out.println(c.carNo);
		c.carStart();
		//c.automaticGear();
		c.carBody();
		c.drive();
		c.gmapsConnectivity();
		c.carStop();

	}

}
