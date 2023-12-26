package oops;

public class MethodOverLoading {

	public void sum() {// MethodOverLoading feature also defined as Static polymorphism othr name is
						// compile time polymorphism
		System.out.println("No arguments method");
		int a = 10;
		int b = 20;
		System.out.println("addition of a and b is " + (a + b));
	}

	public void sum(int a, int b) {
		System.out.println("2 int data type arguments method");

		System.out.println("addition of a and b is " + (a + b));
	}

	public void sum(int a, String s, int b) {
		System.out.println("2 int data type arguments method");
		System.out.println("string  " + s);
		System.out.println("addition of a and b is " + (a + b));
	}

	public void sum(int a, int b, int c) {
		System.out.println("3 int data type arguments method");
		c = a + b;
		System.out.println("addition of a and b is " + c);
	}

	public void sum(int x, String y) {
		System.out.println("1 is int and 1 is String data type arguments method");

		System.out.println("concatination of x and y is " + x + "  " + y);
	}

	public static void main(String[] args) {
		MethodOverLoading j = new MethodOverLoading();
		j.sum();
		j.sum(20, 30);
		j.sum(1, "Testing", 10);
		j.sum(1, "Arjun");
		j.sum(2, "suma");
		j.sum(3, "arun");
		j.sum(1, 2, 1000);

	}
	public static void main(String[] args,int a) {}
}
