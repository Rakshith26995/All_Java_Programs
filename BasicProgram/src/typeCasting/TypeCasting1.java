package typeCasting;

//convert from int to double ----Primitive Type Casting

public class TypeCasting1 { 

	public static void main(String[] args) {
		
		int age =90;   //---Widening type
		double ageOfPerson = age; // Converting Implicitly 
		double ageOfPerson1 = (double)age; //Explicitly
		System.out.println(ageOfPerson);
		System.out.println(ageOfPerson1);
		
		int marks = 82; // int to long 
		long scholarship = 1000000;
		long updatedValue = marks;
		long updatedValue1 = (long) marks;
		System.out.println(updatedValue);
		System.out.println(updatedValue1);
		
		long bankBalance = 250000000;  // long to int 
		byte idNo = 12;		
		byte sbibankBalance = (byte) bankBalance;
		System.out.println(sbibankBalance);
		
		int score= 32; // int to float
		float average = score;
		System.out.println(average);
				
		double weight = 64.7489;	//convert from double to int ---Narrowing type
		int weightOfPerson = (int) weight;
		System.out.println(weightOfPerson);
		
		
	}

}
