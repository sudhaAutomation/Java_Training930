
public class Conctructor1 extends ParentConstrcutor {
	int i;
	String s;
	boolean b;
	double d;
	char c;

	public Conctructor1() {// special method in a class, which is having the sam ename as the class name
					// only
		// implement the functionality or the bussiness lagic
		// constructor will not return anything
		// constructor can't be called with out object ,that's why we can not use the
		// static for the constructors
		// can we over load the constructor? ans:yes
		//can we perform the inheritance on constructor?:: ans:yes
		//can we over ride the constructor? ans::no
		this(30);
		System.out.println("child default constructor");
		System.out.println("a) 0 arguments constrctor and also called as default constructor");
		int i = 10;
		System.out.println(i);

	}

	public Conctructor1(int i) {
		//Constructor call must be the first statement in a constructor
		this(100, 1000);
		System.out.println("b) child Parameterized constructor");
		System.out.println("1 int data type argument constructor i is  " + i);
	
	}

	public Conctructor1(int i, int j) {
		super("one argumnets parent cons");
		System.out.println("2 child int data type arguments constructor " + (i + j));

	}

	public static void main(String[] args) {
	new Conctructor1();
//		System.out.println(ob.i);
//		System.out.println(ob.s);
//		System.out.println(ob.b);
//		System.out.println(ob.d);
//		System.out.println(ob.c);
//		System.out.println(ob);
//		new Conctructor1(100);
//		new Conctructor1(1, 2);
//		new Conctructor1(100, 100);
//		new Conctructor1(10, 30);
//		new Conctructor1(9999);
//		new ParentConstrcutor("software manual testing");
//		new ParentConstrcutor("manual   and ", "Automation Testing");
		

	}

}
