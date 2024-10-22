package com.app.fruits;

import java.util.Objects;

public  abstract class Fruit {
	
	String color ; 
	double weight  ; 
	String name ;  
	boolean isFresh ; 
	
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}


	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public Fruit (String color , double weight , String name ) {
	this.color = color ; 
	this.weight = weight ; 
	this.name = name ; 
	this.isFresh  = true ; 
	}
	
	
 @Override
public String toString() {
	return this.name + " "+ this.color + " "+  this.weight ; 
	
}
 

 
 @Override
public int hashCode() {
	return Objects.hash(color, isFresh, name, weight);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Fruit other = (Fruit) obj;
	return Objects.equals(color, other.color) && isFresh == other.isFresh && Objects.equals(name, other.name)
			&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
}


public boolean isFresh() {
	return isFresh;
}


public void setFresh(boolean isFresh) {
	this.isFresh = isFresh;
}


public abstract String taste(); 

}
