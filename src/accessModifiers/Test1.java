package accessModifiers;

public class Test1 {

	private int a;
	int b;// default
	protected int c;
	public int d;

	public void display() {
		System.out.println("private variable " + a);
		System.out.println("deafult variable " + b);
		System.out.println("protected variable " + c);
		System.out.println("public variable " + d);
	}

}
