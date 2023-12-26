package basics;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		System.out.println("Hello 6");
		System.out.println();
		System.out.println("while loop output");

		// loops:while
		int i = 1;// initialisation
		while (i < 11) {// conditional part
			System.out.println("Hello " + i);
			// i = i + 1;
			i = i + 2;// incremental part
		}
		System.out.println();
		System.out.println("while loop output");
		int j = 10;// initialisation
		while (j < 0) {// conditional part
			System.out.println("Hello " + j);
			// i = i + 1;
			j--;// incremental part
		}
		System.out.println();
		System.out.println("do while loop output");
		int k = 10;// initialisation
		do {// conditional part
			System.out.println("Hello " + k);
			// i = i + 1;
			 k--;//incremental part
		} while (k < 0);
		System.out.println();
		System.out.println("for loop output");

		for (int m = 1; m < 10; m++) {
			System.out.println("Hello " + m);

		}
	}

}
