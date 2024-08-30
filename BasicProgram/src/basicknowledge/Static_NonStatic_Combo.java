package basicknowledge;

public class Static_NonStatic_Combo {
	
	static void add()
	{
		int a = 100;
		int b = 300;
		int c= 1000;
		System.out.println(a+(b*c));
	}
	
	void mutli()
	{
		int a = 28;
		int c = 19;
		System.out.println(a*c);
	}

	public static void main(String[] args) 
	
	{
		Static_NonStatic_Combo r1 = new Static_NonStatic_Combo();
		r1.mutli();
		add();
	}

}
