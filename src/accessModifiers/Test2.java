package accessModifiers;

public class Test2 {
	public void samp() {
		Test1 ob = new Test1();
		// System.out.println("private variable " + ob.a);// The field Test1.a is not
		// visible bcz a is private
		// cariable..private variable will be accessed only with in the
		// same class, where it is defined
		System.out.println("deafult variable " + ob.b);
		System.out.println("protected variable " + ob.c);
		System.out.println("public variable " + ob.d);

	}
}
