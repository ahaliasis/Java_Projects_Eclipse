import java.util.Scanner;
public class Bank {
static Scanner scanner = new Scanner(System.in);
static double amount = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		double posoKatathesis;
		double posoAnalipsis;
		boolean isRunning = true;
		int choice;
		
		while(isRunning) {
			
			System.out.println("*****Banking program***");
			System.out.println("1--katathesi");
			System.out.println("2--analipsi");
			System.out.println("3--Emfanisi ipoloipou");
			System.out.println("4--Eksodos");
			
			choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("ti poso theleis na kaneis katathesi? ");
				posoKatathesis = scanner.nextDouble();
				System.out.println("To neo ipoloipo einai: " + katathesi(posoKatathesis));
				break;
				
			case 2:
				System.out.println("ti poso theleis na kaneis analipsi? ");
				posoAnalipsis= scanner.nextDouble();
				System.out.println("To neo ipoloipo einai: " + analipsi(posoAnalipsis));
				break;
				
			case 3:
				ypoloipo();
				break;
			
			case 4:
				isRunning = false;
				System.out.println("Eksodos...");
				break;
			
			default:
				System.out.println("Lathos epilogi");
			}
			
			
		}
		
		
		
	}
	static void ypoloipo() {
		
		System.out.println("To ypoloipo einai: " + amount);
	}
	static double katathesi(double posokatathesis) {
		amount += posokatathesis;
		return amount;

	}
	static double analipsi(double posoanalipsis) {
	    if (posoanalipsis > amount) {
	        System.out.println("Den iparxei arketo ypoloipo!");
	    } else {
	        amount -= posoanalipsis;
	    }
	    return amount;
	}

	

}
