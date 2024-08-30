package basicknowledge;

public class Constructor_Method {
	
	Constructor_Method()	//1st Method 
	{
		System.out.println("Constructor Method");
	}
	 void add() //2nd Method
	 {
		 System.out.println("Non Static Method"); 
	 }
	 
	 static void sub()  // 3rd Method
	 {
		 System.out.println("Static Method");
	 }

	public static void main(String[] args)  // 4th main method
	{
		Constructor_Method r1 = new Constructor_Method(); //Inside main method, which ever methods is called will execute in same manner 
		r1.add();
		sub();
		System.out.println("Main Method");
		
	}

}


// We have 4 types of method above 
// We can create multiple objects to call constructor