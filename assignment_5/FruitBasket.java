package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Oranges");
		System.out.println("3.Add Apple");
		System.out.println("4.display names of all fruits in the basket ");
		System.out.println("5.Fresh fruits in the basket");
		System.out.println("6.stale fruits in the basket");
		System.out.println("7.Mark a frut as a stale");
		System.out.println("8.mark all sour fruits  stale");
		System.out.println("enter your choice:");
		return sc.nextInt() ; 
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		Fruit [] f = new Fruit[10] ; 
		int counter = 0 ; 
		 int choice ; 
		while((choice = menu(sc)) != 0) {
			if (choice == 1) {
				f [counter++]=new Mango("yellow",20.00,"alphanso mango");
				System.out.println(f[counter-1].name + "is added in the basket.");
				System.out.println();
			}
			else if (choice == 2) {
				f [counter++]  = new Orange("Orange" , 30.00 , "nagpuri oranges") ;
				System.out.println(f[counter-1].name + "is added in the basket.");
				System.out.println();
			}
			else if (choice == 3) {
				f[counter++] = new Apple("red" , 10.00 , "kashmiri apples") ;
				System.out.println(f[counter-1].name + "is added in the basket.");
				System.out.println();
			}
			
			else if (choice == 4 ) {
				for (Fruit fruit :f) {
					if(fruit!=null) {
						System.out.println(fruit.name);
						System.out.println();
						
					}
					else {
						System.out.println("add fruits first");
					}
				}
			}
			else if (choice == 5) {
				for (Fruit fruit : f) {
					if (fruit!= null && fruit.isFresh()) {
						System.out.println(fruit);
						System.out.println("taste of fruit is " +fruit.taste());
						if(fruit.isFresh()) {
							System.out.println("fruit is fresh");
							System.out.println();
						}
						
					}
				}
			}
			
			else if (choice == 6) {
				for (Fruit fruit : f) {
					if (fruit!= null) {
						if (fruit.isFresh() == false ) {
							System.out.println(fruit.name);
							System.out.print("fruit is not fresh and its taste is");
							System.out.println(fruit.taste());
							
						}
					}
				}
			}
			else if (choice == 7) {
			 System.out.println("enter index number of fruit which you want to make stale");
			 int index  = sc.nextInt() ; 
			 if (f[index] != null) {
				 f[index].setFresh(false);
				 System.out.println(f[index].name );
				 System.out.println("at index " + index +" is no more fresh, it has been declared as stale ");
			 }
			 else {
				 System.out.println("you entered wrong index, fruit is not available at this index");
			 }
				
			}
			
			else if (choice == 8) {
				for (int i = 0 ; i < counter ; i ++ ) {
					if(f[i].taste().equals("sour") || f[i].taste()== "sweet and sour" ) {
						f[i].setFresh(false);
						System.out.println();
						System.out.println("we  declared all the sour fruits( mangoes and oranges) as a stale .....");
					}
				}
			}
		}
		

	}

}
