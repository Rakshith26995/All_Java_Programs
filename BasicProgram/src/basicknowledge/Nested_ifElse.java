package basicknowledge;

public class Nested_ifElse {

	public static void main(String[] args) 
	{
		int a = 100;
		int b = 120;
		int c = 100;
		
		if (a>b)
		{
			if (a>c) 
			{
				System.out.println("A greater C");
			}
			else 
			{
				System.out.println("A equals C");
			}
		} 
		else
		{
			if (a<=c) 
			{
				System.out.println("A equals C");
			}
			else 
			{
				System.out.println("False");
			}
			System.out.println("A lesser than B");
		}
	}

}
