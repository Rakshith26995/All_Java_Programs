package basicknowledge;

public class NonStaticMethod_InMainMethod {

	void add()
	{
		int a=100;
		int b=150;
		System.out.println(a+b);
	}
	
	void mul()
	{
		int a=100;
		int b=150;
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	
	{
		NonStaticMethod_InMainMethod r1= new NonStaticMethod_InMainMethod();
		r1.add();
		r1.mul();
	}

}
