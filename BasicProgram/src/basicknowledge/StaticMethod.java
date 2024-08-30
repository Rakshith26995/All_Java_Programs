package basicknowledge;

public class StaticMethod {
	
	public static void add() 
	{
		System.out.println("Addition Method");
	}

	public static void main(String[] args) {
		add();// this output will execute 1st because it is 1st method called in main method
		System.out.println("Main Method");
		add();
		add();
	}

}
