package accessmodifiers1;

import accessModifiers.Test1;


public class Test4 {
	public void samp() {
		Test1 ob = new Test1();
		//System.out.println("private variable " + ob.a);// The field Test1.a is not
		// visible bcz a is private
		// cariable..private variable will be accessed only with in the
		// same class, where it is defined
		//System.out.println("deafult variable " + ob.b);
		//System.out.println("protected variable " + ob.c);// protected variable can be accessed with in the package, and
															// also in the child class which is in an other package also
		System.out.println("public variable " + ob.d);// we can access in any where in the project
		ob.display();
	}

}
