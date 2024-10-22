package com.sunbeam.utils;

import java.util.Scanner;
import com.sunbeam.exception.*;

public class Tester {
	
	
	public static  int calculateLength (Scanner sc) throws ExceptionLineTooLong{
		 
		System.out.println("enter some text...");
		String text =sc.next() ; 
		int a = text.length() ;
		System.out.println(a);
		if (a  > 80 ) {
			throw new ExceptionLineTooLong("the string is too long") ; 
		}
		else {
			return text.length() ; 
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			int length = calculateLength(sc) ; 
			System.out.println("your length of string is " + length);
		}
		catch (ExceptionLineTooLong e)  {
			e.printStackTrace(); 
			
		}
		
		System.out.println("program is finishede ");
		
	}

}
