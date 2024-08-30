package basicknowledge;

import java.util.Arrays;

public class String_Letter_nos {

	static int countofNumbers =0;  //countofNumbers can be anything bec it is a variable
	
	public static void main(String[] args) 
	{

		String name = "Rakshith Rakshu";
		
		char [] c1 = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for (int i=0; i<c1.length; i++)
		{
		    boolean alpha = Character.isAlphabetic(c1[i]);
		    if (alpha==true)
		    {
		    	countofNumbers++;
		    }
		}
		System.out.println("Count of Alphabets " +countofNumbers );
	}

}
