package Functions;

public class Functions {
	// 1.with out arguments with out return type
	int b;
	public void sum() {
		System.out.println("with out arguments with out return type");
		int a = 10;
		int b = 20;
		System.out.println("addition of a and b is " + a + b);
		System.out.println("addition of a and b is " + (a + b));

	}

	// 2 with arguments with out return type
	public void multi(int a, int b) {
		System.out.println("with arguments with out return type");
		System.out.println("multiplication of a and b is " + (a * b));

	}

	// 3 without arguments with return type
	public int div() {// void means returns nothig
		System.out.println("without arguments with return type");
		int a = 10;
		int b = 5;
		System.out.println("division of a and b"+(a / b));
		return a / b;
	}

	// 4 with arguments with return type
	public int sub(int a, int b) {
		System.out.println("with arguments with return type");
		int c = a - b;
		System.out.println("substarction of a and b is " + c);
		return c;
	}
}
