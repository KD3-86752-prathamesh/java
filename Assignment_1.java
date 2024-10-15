package assignments;

import java.util.Scanner; 

public class Assignment_1 {
	
	public static void main (String [] args) {
			
		double d1,d2;
	Scanner sc = new  Scanner(System.in) ; 
	System.out.println("enter 1st double") ;
	
	
	if (sc.hasNextDouble()&& !(sc.hasNextInt())) {
		d1 =sc.nextDouble() ; 
		System.out.println("enter 2nd double") ; 
	
	if (sc.hasNextDouble() && !(sc.hasNextInt()))
	{
		 d2 =sc.nextDouble() ; 
			double sum = d1 + d2 ; 
			double average = sum / 2 ; 
			System.out.println("average of given input is " + average);
	}
	else {
		System.out.println("you have entered wrong input please  enter dobule ");
	}
	}
	else {
		System.out.println("you have entered wrong input please  enter dobule ");
	}
	}

}
