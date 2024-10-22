package com.sunbeam.question2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the text ....");
		String text = sc.next() ; 
		System.out.println(text.charAt(2));
		String temp = text ; 
		
		StringBuilder sb =new StringBuilder(temp) ; 
		System.out.println(sb);
		
		
		for (int i = 0, iterator = sb.length() - 1; i < iterator; i++, iterator--) {
		    char temp1 = sb.charAt(i);
		    sb.setCharAt(i, sb.charAt(iterator));
		    sb.setCharAt(iterator, temp1);
		}
		
		

		
		System.out.println(sb);
		
		
	}

}
