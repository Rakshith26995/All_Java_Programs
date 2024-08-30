package basicknowledge;

public class MathClass {

	public static void main(String[] args) {

		System.out.println(Math.PI);
		// we can also write it as 
		// double pi = Math.PI
		//System.out.println(pi);
		System.out.println(Math.addExact(261, 299));
		System.out.println(Math.subtractExact(2896, 1009));
		System.out.println(Math.max(45, 78));
		System.out.println(Math.random());// it gives unique value from 0 to 1...the return type of math.random is double
		
		for(int a=0; a<100; a++ )
		{
			System.out.println(Math.random());
		}
	}

}
