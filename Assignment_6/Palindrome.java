package com.sunbeam.question3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		System.out.println("enter text to check if it is palindrome....."); 
		Scanner sc = new Scanner(System.in); 
		String palindrome = sc.next() ; 
		boolean ispalindrome = true ; 
		StringBuilder sb= new StringBuilder(palindrome) ; 
		for (int i =0 , iterator = sb.length()-1 ; i < iterator ; i ++ , iterator--) {
			if ((sb.charAt(i) == sb.charAt(iterator)) && true) {
				ispalindrome = true ; 
			}else {
				ispalindrome = false ; 
			}
		}
		if(ispalindrome) {
			System.out.println(sb + " is a palindrome");
			
		}
		else {
			System.out.println(sb + " is not a palindrome");
		}
		sc.close();
	}

}
