package com.app.fruits;

public class Orange extends Fruit {
	
	
	public Orange() {
		// TODO Auto-generated constructor stub
		
		super() ; 
	}
	
	public Orange (String color, double weight, String name, boolean isFresh) {
		super( color,  weight,  name,  isFresh) ; 
	}
	
	public Orange (String color , double weight , String name ) {
		 super(color , weight , name ) ; 
		}
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour" ;
	}

}
