package basics;

public class MultiDimensArray {

	public static void main(String[] args) {
		String[][] swhizz = new String[5][3];
		
		swhizz[0][0] = "S.No.";
		swhizz[0][1] = "madhapur courses";
		swhizz[0][2] = " kphb courses   ";
		swhizz[1][0] = " 1 ";
		swhizz[1][1] = "Software Testing";
		swhizz[1][2] = "  Data science  ";
		swhizz[2][0] = " 2 ";
		swhizz[2][1] = "     mulesoft   ";
		swhizz[2][2] = "     Python     ";
		swhizz[3][0] = " 3 ";
		swhizz[3][1] = "    Salesforce  ";
		swhizz[3][2] = "      Devops    ";
		swhizz[4][0] = " 4 ";
		swhizz[4][1] = "      Devops     ";
		swhizz[4][2] = "     salesforce  ";
		System.out.println(swhizz[4][2]);
		System.out.println(swhizz[3][1]);

		System.out.println(swhizz.length);// 5
		System.out.println(swhizz[4].length);// 3
		for (int i = 0; i < swhizz.length; i++) {// repeats fro rows
			for (int j = 0; j < swhizz[i].length; j++) {
				System.out.print(swhizz[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Bye");
	}

}
