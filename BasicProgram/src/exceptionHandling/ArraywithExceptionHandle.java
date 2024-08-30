package exceptionHandling;

import java.util.Scanner;

public class ArraywithExceptionHandle {

	public static void main(String[] args) {
		
		
		String ss[] = new String [4];
		
		ss [0] = "Rakshu";
		ss [1] = "Ram";
		ss [2] = "Sita";
		ss [3] = "Meera";
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter an index (0 to 4) to access an element in the array: ");
		
		int index = s1.nextInt(); 
		
		
		try {
			System.out.println("Element at index " + index + ": " + ss[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception if the index is out of bounds
            System.out.println("Exception caught: Index " + index + " is out of bounds. Please enter a valid index.");
        } finally {
            // Close the Scanner object
            s1.close();
        }

		
	}

}
