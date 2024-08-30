package Interview_Important_programs;

import java.util.Arrays;

public class CountOf_Special_Characters {

	static  int countOfSpecialChar = 0;
	
	public static void main(String[] args) {
		
		String name = "Rakshith26995&*%#$";
		
		char [] c1 = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for (int i=0; i<c1.length; i++)
		{
		boolean b1 = Character.isLetterOrDigit(c1[i]);
		if (b1==false)
		{
			countOfSpecialChar++;
		}
		}
		System.out.println("Number of special charaters is : "+countOfSpecialChar);
		
	}
	
}
