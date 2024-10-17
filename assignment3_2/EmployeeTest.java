package com.sunbem;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee() ; 
		emp1.setFirstName("sandip"); 
		emp1.setMonthlySalary(-13000);  
		emp1.setLastName("nale"); 
		
		System.out.println("firstname " + emp1.getFirstName());
		System.out.println("last name " +emp1.getLastName());
		System.out.println("monthly salary " + emp1.getMonthlySalary()); 
		System.out.println("yearly salary before rais "+emp1.getYearlySalary());
		System.out.println("raised salary after rais "+emp1.raisedSalary());
		
		System.out.println("-----------------------------------------------------");
		
		Employee emp2 = new Employee() ; 
		emp2.setFirstName("prathamesh"); 
		emp2.setMonthlySalary(120000);  
		emp2.setLastName("hendre"); 
		
		System.out.println("firstname " + emp2.getFirstName());
		System.out.println("last name " +emp2.getLastName());
		System.out.println("monthly salary " + emp2.getMonthlySalary()); 
		System.out.println("yearly salary before raise "+emp2.getYearlySalary());
		System.out.println("raised salary after raise "+emp2.raisedSalary());
		
		

	}

}
