package encapsulation;

class Facebook_application
{
	private String name = "RakshithAdiKannadiga@gmail.com";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation_Program {

	public static void main(String[] args) {
		
		Facebook_application f1 = new Facebook_application ();
		f1.setName("Rakshu@gmail.com");
		System.out.println(f1.getName());
	}

}
