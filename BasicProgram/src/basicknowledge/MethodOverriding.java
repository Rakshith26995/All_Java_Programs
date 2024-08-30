package basicknowledge;

class Method_Parent
{
	void login() 
	{
		System.out.println("Login with Mobile No");
	}
}

public class MethodOverriding extends Method_Parent
{
	void login() 
	{
		System.out.println("Login with e-mail id");
	}

	public static void main(String[] args) {
		
		MethodOverriding m1 = new MethodOverriding();
		m1.login();
		
	}

}
