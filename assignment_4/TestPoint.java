package com.app.tester;
import java.util.Scanner ;

import com.app.geometry.Point2D; 

public class TestPoint {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("enter x1 and y1 for ");
		double x1 = sc.nextDouble() ; 
		double y1  = sc.nextDouble() ; 
		
		Point2D p1 = new Point2D(x1 , y1 ) ; 
		
		System.out.println("enter x2 and y2 for ");
		double x2 = sc.nextDouble() ; 
		double y2  = sc.nextDouble() ; 
		Point2D p2 = new Point2D(x2,y2) ; 
		
		System.out.println("variable of point p1 is " + p1.getDetails());
		System.out.println("variable of point p2 is " + p2.getDetails());
		
		  System.out.println("checking condition for is equal ");
		  boolean isequal = p1.isEqual(p2); 
		  
		  if(isequal) {
			  System.out.println("points are equal");
		  }
		  else {
			  System.out.println("points are not equal");
		  }
		  
		 double distance =  p1.calculateDistance(p2) ;
		 System.out.println("distance betn two points is " + distance);
	}

}
