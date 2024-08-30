package basicknowledge;

import java.util.Arrays;

public class Arrays_assign {

	public static void main(String[] args) {
		
		String [] names = new String[3];
		names[0] = "Rakshith";
		names[1] = "Malathi";
		names[2] = "Darshan";
		
		System.out.println(Arrays.toString(names)); // this is appropriate method
		
		int [] rollno = new int [3];
		rollno [0] = '1';
		rollno [1] = '2';
		rollno [2] = '3';
		
		char [] gender =new char [3];
		gender [0] = 'M';
		gender [1] = 'F';
		gender [2] = 'M';
		
		System.out.println("Names"+"   "+"Rollno"+"   "+"Gender" );
		
		for (int i=0; i<3; i++)
		{
			System.out.println(names[i]+" "+rollno[i]+"   "+gender[i]);
		}
	}

}
