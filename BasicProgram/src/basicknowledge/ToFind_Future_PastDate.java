package basicknowledge;

import java.util.Date;

public class ToFind_Future_PastDate {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);   // Present Date
		
		Date d3 = new Date(d1.getTime()+(60*60*24*1000*7));
		System.out.println(d3); // Future Date 
		
		Date d4 = new Date(d1.getTime()-(60*60*24*1000*7));
		System.out.println(d4); // Past Date 
	}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
}
