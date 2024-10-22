package com.app.fruits;


public class Apple extends Fruit {
	
	public Apple() {
		// TODO Auto-generated constructor stub
		
		super() ; 
	}
	
	public Apple (String color, double weight, String name, boolean isFresh) {
		super( color,  weight,  name,  isFresh) ; 
	}
	
	
	public Apple (String color , double weight , String name ) {
		 super(color , weight , name ) ; 
		}
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet and sour " ;
	}


}
