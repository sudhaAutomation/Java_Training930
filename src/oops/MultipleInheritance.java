package oops;

public interface MultipleInheritance extends InterfaceA,InterfaceB {//is a relationship
	int min_bal = 2000;// The blank final field i may not have been initialized

	public void myAccount();
	// public void sample();// Abstract methods do not specify a body
	//
	// public void sample1();// Abstract methods do not specify a body
	//
	// public void sample2();// Abstract methods do not specify a body
	//
	// public void sample3();// Abstract methods do not specify a body
	//
	// public void sample4();// Abstract methods do not specify a body

	// public static void main(String[] args) {
	// // new MultipleInheritance(); we can't create an object fro an interface bcz
	// ,
	// // this will contains the abstract methods
	// }

}

/*
 * in an interface varibales will act as final & static in nature implicitly
 * Abstract methods: are the methods which are not having the method body we
 * can't create an object fro an interface bcz , this will contains the abstract
 * methods in an interface we can have the method body fro static methods, bcz
 * we can call them any where directly ,so JVM will not get any ombiguity while
 * running
 */
