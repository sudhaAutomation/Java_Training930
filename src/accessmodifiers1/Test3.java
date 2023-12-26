package accessmodifiers1;

import accessModifiers.Test1;

public class Test3 extends Test1 {
	public void samp() {

		// System.out.println("private variable " + a);// The field Test1.a is not
		// visible,bcz this is a private
		// System.out.println("deafult variable " + b);// The field Test1.a is not
		// visible bcz this is dafault,will be
		// accessed only with in the package
		System.out.println("protected variable " + c);
		System.out.println("public variable " + d);
		display();
	}

}
