package basicknowledge;

public class IfElseIf_Assign {

	public static void main(String[] args) {
		
		char gender = 'm';
		
		if (gender == 'm')
		{
			System.out.println ("Ticket Price is : 20");
		}
		else if (gender == 'f')
		{
			System.out.println("Ticket Price is : Free");
		}
		else if (gender == 't')
		{
			System.out.println("Ticket Price is : 5");
		}
		else
		{
			System.out.println("No service");
		}
	}

}
