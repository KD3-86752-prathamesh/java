package assignment7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;



//class that implements comparator and gives the logic for sorting the array based on the 
class StdSortOnCity implements Comparator<Students> {

	
	@Override
	public int compare(Students o1, Students o2) {
		 String oone = o1.getCity() ; 
		 String otwo = o2.getCity() ; 
		return oone.compareTo(otwo);
	}
}


class StdSortOnMarks implements Comparator<Students> {
	boolean ascending  = true   ; 
	
	public StdSortOnMarks () {
		
	}
	
	
	public StdSortOnMarks(boolean ascending){
		this.ascending = ascending ; 
	}
	
	@Override
	public int compare(Students o1, Students o2) {
		
		double oone = o1.getMarks() ; 
		double otwo = o2.getMarks() ; 
			
		if(ascending)
			return Double.compare(oone, otwo) ; 
		return Double.compare(otwo, oone) ; 
	}
}


class StdSortOnName implements Comparator<Students> {
	
	public  int compare(Students o1 , Students o2 ) {
		
		String oone = o1.getName() ; 
		String otwo = o2.getName() ; 
		return oone.compareTo(otwo) ; 
	}
}








public class Students implements Comparable<Students>{
	
private	int rollno ; 
private	String city  ; 
private	double marks ; 
private	String name ; 
	





	public String getCity() {
	return city;
}

public double getMarks() {
	return marks;
}

public String getName() {
	return name;
}

	public  void Students() {
		// TODO Auto-generated method stub

	}

	public Students(int rollno, String city, double marks, String name) {
	
		this.rollno = rollno;
		this.city = city;
		this.marks = marks;
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Students other = (Students) obj;
//		return rollno == other.rollno;
//	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", city=" + city + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Students o) {
		
		return this.rollno- o.rollno;
	}

	
	
	
	

	public static int menu( Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1.sorted on city");
		System.out.println("2.sorted on marks");
		System.out.println("3.sorted on name");
		System.out.println("4.sorted on rollno");
		System.out.println("enter your choice>>");
		return sc.nextInt() ; 
	}
	
	public static void  displayarry(Students [] arr) {
		for (Students ele:arr) {
			System.out.println(ele);
		}
	}
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);  
		
		Students [] arrst = new Students[6] ;
		
		arrst[0] = new Students(1, "pune" , 60.00 , "sandip") ; 
		arrst[1] = new Students (5, "mumbai" , 70.00  , "shriprasad" )  ; 
		arrst[2]= new Students (4, "nashik" , 80.00 , "abhay") ; 
		arrst[3] = new Students(3, "nagpur" , 90.00 , "saksham" ) ;
		arrst[4] = new Students (2 , "pandharpur " , 99.00 , "prathamesh" ) ; 
		arrst[5] = new Students (6 , "aurangabad" , 85.00 , "nishikant") ; 
 
		
		int choice ; 
		
		Comparator<Students> comp ; 
		
		while((choice= menu(sc)) != 0) {
			
			switch (choice) {
			case 1 : 
				comp = new StdSortOnCity() ; 
				Arrays.sort(arrst,comp) ; 
				displayarry(arrst) ; 
				
				break ; 
					
			case 2  : 
				
				comp = new StdSortOnMarks(false) ; 
				Arrays.sort(arrst,comp) ; 
				displayarry(arrst) ; 
				break ;
			
			case 3  : 

				comp = new  StdSortOnName() ; 
				Arrays.sort(arrst , comp) ; 
				displayarry(arrst) ; 
				break ; 
				
			case 4 : 
				Arrays.sort(arrst);
				displayarry(arrst) ; 
				break ; 
				
			
			default : 
				System.out.println("you entered wrong choice");
				break ; 
			
			}		
		}		
	}
}
