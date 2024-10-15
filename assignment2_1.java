package assignments;

import java.util.Scanner; 
public class assignment2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ; 
		
		System.out.println("enter the number : "); 
		int a= sc.nextInt() ; 
		Integer ai = new Integer(a) ; 
		String binary = ai.toBinaryString(a) ; 
		String octal = ai.toOctalString(a) ; 
		String hexadecimal = ai.toHexString(a) ; 
		
		System.out.println(binary) ; 
		System.out.println(octal) ; 
		System.out.println(hexadecimal) ; 
	}

}
