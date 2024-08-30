package basicknowledge;

public class Method_Priority {
	
	Method_Priority()    //COnstructor
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		Method_Priority r1 = new Method_Priority();
	}
	static //SIB
	{
		System.out.println("SIB-1");
	}
	static 
	{
		System.out.println("SIB-2");
	}
	{                       //IIB
		System.out.println("IIB-1");
	}
	{
		System.out.println("IIB-2");
	}

}
