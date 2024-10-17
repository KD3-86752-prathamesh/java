package com.sunbem;




public class assignment3_1 {

	public static void main(String[] args) {
		
		Invoice cust1 = new Invoice ("123" , "screw" , 5, 10.5) ; 
		
		System.out.println(" part discription  " + cust1.getPartDescription() );

				 
		System.out.println(" part number " + cust1.getPartNumber() );

		System.out.println("price of part :  " + cust1.getPartPrice() );
		System.out.println("total quantity " + cust1.getQuantity() );
		
		
		System.out.println("--------------------------------------------"); 
		
		Invoice cust2 = new Invoice() ; 
		cust2.setPartDescription("pana");
		cust2.setPartNumber("1212");
		cust2.setPartPrice(120); 
		cust2.setQuantity(12) ; 
		System.out.println("your total invoice is " + cust2.getInvoice() );

		

	}

}
