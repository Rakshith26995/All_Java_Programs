package basicknowledge;

public class MethodOverLoading {
	
	void add()
	{
		int a = 100;
		System.out.println(a+100);
	}
	
	void add(int a)
	{
		System.out.println(a+300);
	}
	static void add(int a, int b)
	{
		System.out.println(a+b+100);
	}
	static void add(char a, String b)
	{
		System.out.println("Static Method with args");
	}
	static void add(float a, double d)
	{
		System.out.println(a+d+100);
	}

	public static void main(String[] args) {
		
		add(10.00f,20.0000);
		MethodOverLoading r1 = new MethodOverLoading();
		r1.add();
		r1.add(200);
		add(200,500);
		add('R',"Rakshith Chikkaswamy");
	}

}
