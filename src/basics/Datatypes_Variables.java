package basics;

public class Datatypes_Variables {// title case
	// class is a block of code , which is having the properties in the form of
	// methods and variables
	int studentid;// global variable/instance variables
	static int mobileno;
	static Datatypes_Variables o=new Datatypes_Variables();
	public static void main(String[] args) {
		//object will be created by the instantiation of the class with the new keyword
		byte r = -120;
		byte marks = 90;// local variable
		short s = 32000;
		int c = 18000000;
		long l = 1287936785477l;
		System.out.println(r);// -120
		System.out.println(marks);
		System.out.println(c);
		System.out.println(l);
		System.out.println(s);
		// System.out.println(r);
		float f = 12.45f;
		double d = 123425.5667;
		char ch = 'P';
		boolean b = true;
		boolean fl = false;
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(fl);

		int i = 100;// implicit type casting
		byte m = (byte) 1000;// explicit type casting

		System.out.println(m);
		System.out.println(mobileno);
		System.out.println(o.studentid);
		sampleProgramm();
		//non primitive data type
		String studentname="Roshan";
		String address="H.No.4-234,madhapur,hyderabad,telanmgana, pin code-500081";
	}

	public static void sampleProgramm() {// camel case
		o.studentid=123;
		mobileno=987364712;
		System.out.println(o.studentid);
		System.out.println(mobileno);
	}

}
