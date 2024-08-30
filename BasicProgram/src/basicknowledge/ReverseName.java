package basicknowledge;

public class ReverseName {
	
	public static void main(String[] args) 
	{
		String name = "Rakshith";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			char c = name.charAt(i);
			System.out.println(c);
		}
				
	}

}
