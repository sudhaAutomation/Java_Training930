package basics;

public class ExceptionaHandling {

	public static void main(String[] args) {
		System.out.println("Hello");

		try {
			System.out.println(10 / 0);
		} catch (Exception i) {
			// TODO Auto-generated catch block
			i.printStackTrace();
		} // 2

		finally {
			System.out.println("closing of the code, program implemented by the developer ");

		}
		System.out.println("Bye");
	}

}
