package com.sunbem;

public class Employee {
	
	String firstName ; 
	String lastName ; 
	double monthlySalary ; 
	
	public Employee () {
		this.firstName = "" ; 
		this.lastName = "" ; 
		this.monthlySalary= 0 ; 
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary >  0) {
			this.monthlySalary = monthlySalary;
		}
		
	}
	
	public double getYearlySalary () {
		return   monthlySalary*12   ; 
	}
	
	public double raisedSalary() {
		double  increasedSalary =  monthlySalary*12 + monthlySalary*12*0.10 ; 
		return increasedSalary; 
	}
	

}
