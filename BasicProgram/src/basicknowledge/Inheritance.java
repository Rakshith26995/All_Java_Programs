package basicknowledge;

class Parent //parent cls
{
	static void add()
	{
		int a = 12;
		int b = 26;
		System.out.println(a+b);
	}
	
	void sub()
	{
		int a = 52;
		int b = 26;
		System.out.println(a-b);
	}
}

public class Inheritance extends Parent //child cls

{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Inheritance r1 = new Inheritance();
		add();
		mul();
		r1.sub();
		r1.div();
	}
	
	static void mul()
	{
		int a = 12;
		int b = 26;
		System.out.println(a*b);
	}
	
	void div()
	{
		int a = 52;
		int b = 26;
		System.out.println(a/b);
	}
}

