import java.util.Scanner;
 

public class diaxeirisiKatathesis {
	
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] trapeza = null ;
		boolean isRunning = true;
		
		
		while(isRunning) {
			
			System.out.println("1-Eisagwgi poswn");
			System.out.println("2-Emfanisi poswn");
			System.out.println("3-Megisto poso");
			System.out.println("4-Mesos oros poswn");
			System.out.println("5-orio poswn panw apo 3000");
			System.out.println("6-Eksodos");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1:
			    
					int size;
					System.out.println("Posa posa theleis na valeis? ");
					size = scanner.nextInt();
					trapeza = new int[size];
					
					for(int i = 0; i < trapeza.length; i++) {
						System.out.println("Poso");
						trapeza[i] = scanner.nextInt();
					}
				break;

			case 2:
				if (trapeza == null) {
				    System.out.println("Πρέπει πρώτα να εισάγεις ποσά!");
				    break;
				}else {

				emfanisiPoswn(trapeza);
				}
			    break;
			case 3:
				System.out.println("Megisto poso einai: " + maxPoso(trapeza));
			break;
			case 4:
				System.out.println("O mesos oros einai: " + mesosOros(trapeza));
				break;
			case 5:
				double orio;
				System.out.println("Dwse orio");
				orio = scanner.nextInt();
				System.out.println("Panw apo " + orio + "einai" + panwApo(trapeza,orio));
				
				break;
			case 6:
				isRunning = false;
				break;
				
			default:
				System.out.println("Lathos epilogi");
				break;
				
			}
			
			
			
			
			
			
			
		}
		

	}
		static void emfanisiPoswn(int [] array) {
		for(int i = 0; i < array.length;i++) {
			System.out.println(array[i]);
		}
	}
	static int maxPoso(int [] array) {
		int max = array[0];
		for(int i = 0; i < array.length;i++) {
			if(array[i] > max) {
				max = array[i];
				
			}
			
		}
		return max;
	}
	static int mesosOros(int [] array) {
		int sum = 0;
		
		
		for(int i = 0; i < array.length ; i++) {
			sum += array[i];
			
		}
		return sum / array.length;
	}
    static int panwApo(int [] array, double orio) {
    	int count = 0;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] > orio) {
    			count++;
    			
    		}
    	}
       return count;    	
    }
}
