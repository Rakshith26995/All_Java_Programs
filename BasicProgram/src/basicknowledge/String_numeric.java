package basicknowledge;

import java.util.Arrays;

public class String_numeric {

	static int countOfNumeric = 0;
	
	public static void main(String[] args) 
	
	{
       String name = "Rakshith26995";
       
       char c1[] = name.toCharArray();
       System.out.println(Arrays.toString(c1));
       
       for(int i=0; i<c1.length; i++)
       {
          boolean numeric = Character.isDigit(c1[i]);
          if (numeric==true)
          {
        	  countOfNumeric++;
          }
       }
       System.out.println("Count of Numeric digit is "+countOfNumeric);
	}

}
