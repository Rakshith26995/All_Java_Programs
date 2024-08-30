package Interview_Important_programs;

import java.util.Arrays;

public class countOfSplChar {
	
	static int countOfALpha = 0;
	static int countOfDigit = 0;
	static int countOfSpace = 0;
	static int countOfSplChar = 0;

	public static void main(String[] args) {
		
		String name = "Rakshith Adi Kannadiaga 26995 &^$#@@";
		String alphanumericspace = "";
		
		char[] c1 = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		int lengthOfString = name.length();    //To find length of String 
		System.out.println("Length of String :"+lengthOfString);
		
		for(int i=0; i<name.length(); i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);		
			if(b1==true)
			{
				countOfALpha++;
			}
			boolean b2 = Character.isDigit(c1[i]);
			if(b2==true)
			{
				countOfDigit++;
			}
			boolean b3 = Character.isSpaceChar(c1[i]);		
			if(b3==true)
			{
				countOfSpace++;
			}										
		}
		System.out.println("Count Of Alpha :"+countOfALpha);
		System.out.println("Count Of Digit :"+countOfDigit);
		System.out.println("Count Of Digit :"+countOfSpace);
		
		int totalOfThree = countOfALpha + countOfDigit + countOfSpace;
		System.out.println("Total count of three: "+totalOfThree);
		
//		int countOfSplChar = name.length() - totalOfThree;
//		System.out.println("Total count of Special characters :"+ countOfSplChar); My own method 
		
		countOfSplChar = name.length() - totalOfThree;
		System.out.println("Total count of Special characters :"+ countOfSplChar);
 	}

}
