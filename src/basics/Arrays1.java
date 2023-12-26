package basics;

public class Arrays1 {// array is an object ,where we can store the similiar data type elements with
						// contigious memory location

	public static void main(String[] args) {
		int marks = 70;
		// System.out.println(marks);
		marks = 90;
		System.out.println(marks);

		int[] stdmarks = new int[6];
		// in arrays, the values will starts to store from 0th index
		stdmarks[0] = 80;
		stdmarks[1] = 60;
		stdmarks[2] = 90;
		stdmarks[3] = 100;
		stdmarks[4] = 70;
		stdmarks[5] = 60;
		// stdmarks[6]=80;
		// System.out.println(stdmarks[0]);
		// System.out.println(stdmarks[3]);
		// System.out.println(stdmarks[5]);

		System.out.println(stdmarks.length);// 6

		for (int i = 0; i < stdmarks.length; i++) {
			System.out.println(stdmarks[i]);
		}

		int s[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		Object stddetails[] = new Object[8];
		stddetails[0] = "varun";
		stddetails[1] = 9878654321l;
		stddetails[2] = 'B';
		stddetails[3] = "GT123";
		stddetails[4] = "AB-";
		stddetails[5] = "CGR International school";
		stddetails[6] = 130;
		stddetails[7] = "3-145,madhapur,pincode-500081";
		for (int i = 0; i < stddetails.length; i++) {
			System.out.println(stddetails[i]);
		}

	}

}
