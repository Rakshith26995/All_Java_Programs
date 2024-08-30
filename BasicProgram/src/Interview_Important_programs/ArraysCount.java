package Interview_Important_programs;

public class ArraysCount {

	public static void main(String[] args) {
		
		int [] numb = new int [4];
		 
		numb [0] = 23;
		numb [1] = 26;
		numb [2] = 12;
		numb [3] = 26;
		
		
		int countofgivenNo = 0;
		int givenNo = 26;
		
		for(int i=0; i<numb.length; i++)
		{
			
			if(givenNo==numb[i])
				
			{	
				countofgivenNo++;
				System.out.println("It is Array");
			}
			else
			{
				System.out.println("Not Array");
			}
		}
		System.out.println("Count of Given number :"+countofgivenNo);
			
	}

}
