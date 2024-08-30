package basicknowledge;

public class Access_Spec {
	
	public void add() //we are adding access specifier for each method
	{
		System.out.println("1");
	}
	protected void sub()
	{
		System.out.println("2");
	}
	private void mul()
	{
		System.out.println("3");
	}
	static void div()
	{
		System.out.println("4");
	}

	public static void main(String[] args) {

		Access_Spec a1 = new Access_Spec();
		a1.add();
		a1.sub();
		a1.mul();
		div();
	}

}
