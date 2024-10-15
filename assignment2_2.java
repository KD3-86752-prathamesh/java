package assignments;
import java.util.Scanner;
public class assignment2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ; 
		
		boolean running  = true ;
		int bill= 0 ;
		
		
		while (running) {
			
			
			// inside mainSystem.out.println("hello customer");
			System.out.println("1.give order");
			System.out.println("2.generate bill.");
			System.out.println("3.exit.");
			System.out.print("what is your wish...");
			int choice = sc.nextInt() ; 
			
		
			
			if (choice == 1) {
				System.out.println("1.Dos -- 20");
				System.out.println("2.samos -- 15");
				System.out.println("3.idli -- 30");
				System.out.println("4.vadapav --10");
				System.out.println("5.udid vadd--30");
				System.out.println("6.kachori --15");
				System.out.println("7.keli --10");
				System.out.println("8.cramroll --10");
				System.out.println("9.biscuit --5");
				System.out.println("10.pohe --10");
				System.out.println("11. exit ");
				
				System.out.println("exit");

				System.out.println("choose what you want : ");
				boolean condition = true; 
				while ( condition  ) {
					int order = sc.nextInt(); 
					switch (order) {
					case 1 : 
						bill = bill + 20 ; 
						System.out.println("dosa is added. anything else .. ");
						System.out.println(bill + " rupee");
						break ; 
					case 2 : 
						bill = bill + 15 ;
						System.out.println("samosa is added. anyting else ...");
						System.out.println(bill + " rupee");
						break ; 
					case 3 : 
						bill = bill +30 ; 
						System.out.println("idli is adde anything else ...");
						System.out.println(bill + " rupee");
						break ; 
					case 4 : 
						bill = bill + 10 ; 
						System.out.println("vadapav is added. anything else.. ");
						System.out.println(bill + " rupee");
						break ; 
						
					case 5 : 
						bill = bill + 30 ; 
						System.out.println("udidvada is added. anything else.. ");
						System.out.println(bill + " rupee");
						break ;
					case 6 : 
						bill = bill + 50 ; 
						System.out.println("kachori is added. anything else.. ");
						System.out.println(bill + " rupee");
						break ;
					case 7 : 
						bill = bill + 10 ; 
						System.out.println("keli is added. anything else.. ");
						System.out.println(bill + " rupee");
						break ;
					case 8 : 
						bill = bill + 10 ; 
						System.out.println("creamroll is added. anything else.. ");
						System.out.println(bill + " rupee");
						break ;
					case 9 : 
						bill = bill + 10 ; 
						System.out.println("biscuit is added. anything else.. ");
						System.out.println(bill + " rupee");
						break ;
					case 10 : 
						bill = bill + 10 ; 
						System.out.println("pohe is added. anything else.. ");
						System.out.println(bill + " rupee");
						break ;
						
					case 11: 
						System.out.println("thank you for your order....");
						condition = false ; 
						break ; 
					
				
			
					}
				}
			}
			else if (choice == 2) {
				if(bill != 0 ) {
					System.out.println("your payment bill is " +bill+ " rupee");
					System.out.println("thank your for coming...");
				}
				else {
					System.out.println("buy something, your bill is still 0 rupee");
				}
			}
			else {
				System.out.println("thank you, VISIT AGAIN....");
				running = false ; 
			}
			
		}
		
		
		
		
		
		
		
			

	 	}// inside main

	}//inside public class 

