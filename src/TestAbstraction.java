
public class TestAbstraction extends Abstraction1 {

	public static void main(String[] args) {
		TestAbstraction n=new TestAbstraction();
		n.sample();
		n.sum();
		n.i=1000;
		System.out.println(n.i);

	}

	@Override
	public void sum() {
		System.out.println("sum abstract method implemetd in concrete class");
		
	}

}
