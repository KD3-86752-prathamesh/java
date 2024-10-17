package com.app.geometry;

public class Point2D {
	double  x  ; 
	double  y ;
	
	
	
	public Point2D(double x, double  y) {
	
		this.x = x;
		this.y = y;
	} 
	
	public String getDetails() {
		
		String stringifyX = Double.toString(x) ; 
		String StringifyY = Double.toString(y); 
		
		return  stringifyX + " and " +   StringifyY ; 
		
	}
	
	public  boolean isEqual (Point2D other) {
		if ((this.x == other.x) && (this.y == other.y)) {
			return true ; 
		}
		else {
			return false ; 
		}
	}
	
	public  double   calculateDistance(Point2D other) {
		if ( this.isEqual(other)) {
			return 0 ; 
 		}
		else {
			double x4 =this.x-other.x ; 
				double x3 = Math.pow(x4, 2) ; 
				double y4 = this.y - other.y ; 
				double y3 = Math.pow(y4, 2) ; 
				double distance = Math.sqrt((x3+y3)) ; 
				return distance ; 
			
		}
	}
	

}
