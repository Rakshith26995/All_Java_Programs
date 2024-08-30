package basicknowledge;

public class Rakshu_Const_2 { //Assignment 
	
	Rakshu_Const_2()
	{
		System.out.println("Non parameterized Const");
	}
	Rakshu_Const_2(int a)
	{
		System.out.println(a+100);
	}
	Rakshu_Const_2(int a, char b)
	{
		System.out.println("Parameterized Const");
	}
	Rakshu_Const_2(int a, char b, boolean c, float d, double e, String f, long g)
	{
		System.out.println("Parameterized Const");
	}
	public static void main(String[] args) 
	{
       new Rakshu_Const_2();
       new Rakshu_Const_2(32000);
       new Rakshu_Const_2(32000, 'r');
       new Rakshu_Const_2(32000, 'r', true, 26.17f, 17.999999, "RD Bros", 1000000);// or it can be called as below also
       Rakshu_Const_2 r1 = new Rakshu_Const_2();
       Rakshu_Const_2 r2 = new Rakshu_Const_2(32000);
	}

}
