package basicknowledge;

public class If_else_condition {

	public static void main(String[] args) 
	{
		int a = 12;
		int b = 35;
		int c =10;
		if (a<=c)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		VotingCriteria();
	}
	 
	static void VotingCriteria()
	{
		int age = 21;
		if (age>=18) {
			System.out.println("Eligible for Voting");		
		}
		else {
			System.out.println("Not Eligible for Voting");
		}
		
	}
	 
	

}
