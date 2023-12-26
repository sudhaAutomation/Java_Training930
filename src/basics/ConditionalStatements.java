package basics;

public class ConditionalStatements {

	public static void main(String[] args) {
		// conditional statements are used to apply the condition to filter the data
		// based on the condition
		/*
		 * simple if condition
		 */

		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b) {
			System.out.println("a is lesser than b");
		} else {
			System.out.println();
		}
		// nested if: for multiple conditions validation
		if (a == b) {
			System.out.println("a and b are equal");
		} else if (a < b & c < b) {
			System.out.println("a is lesser than b value and b is lesser than c ");

		} else if (a < b || a >= b) {
			System.out.println("a is lesser than b or  equal to b or greater than b ");
		} else {
			System.out.println("there is no relation between a and b");
		}

		// switch statment
		String course = "Testing";
		switch (course) {
		case "devops":
			System.out.println("my course is devops");
			break;
		case "java":
			System.out.println("my course is java");
			break;
		case "python":
			System.out.println("my course is python");
			break;
		case "Testing":
			System.out.println("my course is Testing");
			break;
		case "salesforce":
			System.out.println("my course is salesforce");
			break;
		case "testing1":
			System.out.println("my course is Testing");
			break;
		default:
			System.out.println("my course is not found");
			break;
		}

	}

}
