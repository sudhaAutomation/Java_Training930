
public class ParentConstrcutor {
	public ParentConstrcutor(){
		
		System.out.println("Prent default costructor with 0 argumnets");
	}
	public ParentConstrcutor(String s) {
		this("2 arguments are", " Software Testing");
		
	System.out.println("parent parameterized constructor with String argument is "+s);	
	} 
	public ParentConstrcutor(String s, String s1) {
		this(3, "Manual testing", "Automation testing");
		System.out.println(" parent 2 argumnets constructor with s and s1 are "+s+"  "+s1);
		
	}
	public ParentConstrcutor(int i,String s, String s1) {
		
		System.out.println(" parent 3 argumnets constructor withint i, s and s1 are "+i+" "+s+"  "+s1);
		
	}
}
