package basicknowledge;

public class Package_level_AccSpecifierEx2 {
	
	public void add() //we are adding access specifier for each method
	{
		System.out.println("1");
	}
	protected void sub()
	{
		System.out.println("2");
	}
	private void mul(int a)
	{
		System.out.println("3");
	}
     void div()
	{
		System.out.println("4");
	}
	
	public static void main(String[] args) {

		Package_level_AccSpecifierEx2 a1 = new Package_level_AccSpecifierEx2();
		a1.add();
		a1.sub();
		a1.mul(100);
		a1.div();
	}

}
//within the package we can access 3 except private