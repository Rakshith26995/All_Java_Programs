package basicknowledge;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_EqualsMethod {

	public static void main(String[] args) {
		
Scanner s1 = new Scanner (System.in);
		System.out.println("Array1");
		int rollno[] = new int [4];
		
		for (int i=0; i<4; i++)
		
		
		{
			System.out.println("Enter the array->"+i);
			rollno [i] = s1.nextInt();
//			System.out.println(rollno[i]);
			
		}
		
    System.out.println("Array2");
		int rollno1[] = new int [4];
		
		for (int i=0; i<4; i++)
		
		
		{
			System.out.println("Enter the array->"+i);
			rollno1 [i] = s1.nextInt();
//			System.out.println(rollno[i]);
			
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		
		if (Arrays.equals(rollno, rollno1) == true)
			{
			    System.out.println("Its Right Array");
			}
		else
		{
			System.out.println("Its Wrong Array");
		}
	}

}
