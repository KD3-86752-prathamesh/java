package com.sunbem;

/**
 * @author Admin
 *
 */
public class Invoice {
	String partNumber ; 
	String partDescription ; 
	int quantity ; 
	double partPrice ; 
	double invoice ; 
	
	
	
	public double getInvoice  () {
		invoice = quantity * partPrice ; 
		return invoice ; 
		
	}
	
	
	
	public Invoice() {
		this.partDescription = "" ; 
		this.partNumber = "" ; 
		this.quantity = 0 ; 
		this.partPrice = 0 ; 
	}



	public String getPartNumber() {
		return partNumber;
	}



	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}



	public String getPartDescription() {
		return partDescription;
	}



	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		if (quantity < 0) {
			quantity = 0 ; 
		}
		this.quantity = quantity;
	}



	public double getPartPrice() {
		return partPrice;
	}



	public void setPartPrice(double partPrice) {
		if (partPrice< 0) {
			partPrice = 0 ; 
		}
		this.partPrice = partPrice;
	}



	public Invoice(String partNumber, String partDescription, int quantity, double partPrice) {
		if (quantity < 0) {
			quantity = 0 ; 
		}
		if (partPrice < 0) {
			partPrice = 0 ; 
		}
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.partPrice = partPrice;
		
	}
	
	

	
	
	
	
	
	
	
}
