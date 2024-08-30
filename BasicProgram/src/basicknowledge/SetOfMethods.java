package basicknowledge;

public class SetOfMethods {
	
	static void add() 
	{
		int a = 26;
		int b = 17;
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void sub() 
	{
		int a = 26;
		int b = 17;
		int sum = a-b;
		System.out.println(sum);
	}
	
	static void mul() 
	{
		int a = 26;
		int b = 17;
		int sum = a*b;
		System.out.println(sum);
	}
	
	static void div() 
	{
		int a = 26;
		int b = 17;
		int sum = a/b;
		System.out.println(sum);
	}
	

	public static void main(String[] args) 
	{
	   sub();
	   mod();
       System.out.println("Set of Methods below");
       add();
       mul();
       div();
	}
	
	static void mod() 
	{
		int a = 26;
		int b = 17;
		int sum = a%b;
		System.out.println(sum);
	}

}
