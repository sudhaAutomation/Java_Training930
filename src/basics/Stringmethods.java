package basics;

public class Stringmethods {

	public static void main(String[] args) {
		String name = "Swhizz Technologies";// by literal method
		// System.out.println(name);
		name = "Arjun";
		System.out.println(name);
		// String str=new String("Ramu");//by new keyword
		// System.out.println(str);

		String acttext = "Swhizz technologies is avaialable in madhapur and kphb";

		String exptext = "is";
		String number = "9876543210";
		int nmleng = number.length();
		System.out.println(nmleng);
		if (number.length() == 10) {
			System.out.println("mobile noumber is matched with 10 digits");
		}
		System.out.println(acttext.equals(exptext));// false
		if (acttext.contains(exptext)) {
			System.out.println("my test case is passed");
		} else {
			System.out.println("my test case is failed");

		}

		System.out.println(acttext.toUpperCase());
		System.out.println(acttext.toLowerCase());

		System.out.println(name.equals("arjun"));// false
		System.out.println(name.equalsIgnoreCase("arjun"));// true
		String date = "13-9-2023";
		System.out.println(date.replace('-', '/'));
		String text[] = acttext.split("");
		System.out.println(text.length);
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		}

	}

}
