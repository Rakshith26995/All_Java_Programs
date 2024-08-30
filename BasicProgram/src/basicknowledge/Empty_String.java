package basicknowledge;

public class Empty_String {
	
	static void subString()
	{
		String name = "Rakshith Adi Kannadiga";
		{
			System.out.println(name.substring(3));
			System.out.println(name.substring(9, 12)); // Here count space between words and also in 2 parameters. Always count 1 extra when you are want to print middle words
		}
	}

	public static void main(String[] args) {

		String empty = "";
		{
			System.out.println(empty.isEmpty());
			subString();
		}
	}

}
