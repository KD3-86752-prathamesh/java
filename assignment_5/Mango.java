package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		// TODO Auto-generated constructor stub
		
		super() ; 
	}
	
	public Mango (String color, double weight, String name, boolean isFresh) {
		super( color,  weight,  name,  isFresh) ; 
	}
	
	public Mango (String color , double weight , String name ) {
		 super(color , weight , name ) ; 
		}
	
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet and sour" ;
	}


}
