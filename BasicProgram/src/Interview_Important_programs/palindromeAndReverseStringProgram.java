package Interview_Important_programs;

public class palindromeAndReverseStringProgram {

	public static void main(String[] args) {
		
		String input = "radar";
		String reverse = "";
		
		
		for (int i=input.length()-1; i>=0; i--)
		{
		   char ouput = input.charAt(i);
		   System.out.println(ouput);
		   reverse = reverse+ouput;
//		   System.out.println(reverse); This line will give another output.
		}
		System.out.println(reverse);
		if(input.equals(reverse))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}
	}

}
