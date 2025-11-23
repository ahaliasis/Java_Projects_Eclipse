import java.util.Scanner;
public class MainVivlia {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String [] onomaVivliou = new String [5];
		boolean [] isBorrowed = new boolean [5];
		boolean isRunning = true;
		
		
		for(int i = 0;i < isBorrowed.length; i++) {
			isBorrowed[i] = true;
		}
		
		while(isRunning) {
			
		
			
			
			System.out.println("********MENU******");
			System.out.println("1-Prosthiki Vivliou");
			System.out.println("2-Emfanisi olwn twn vivliwn");
			System.out.println("3-Daneismos vivliou");
			System.out.println("4-Epistrofi Vivliou");
			System.out.println("5-Eksodos");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
			case 1:
				prosthikiVivliou(onomaVivliou,isBorrowed);
				break;
				
			case 2:
				emfanisiVivliou(onomaVivliou,isBorrowed);
				break;
				
			case 3:
				daneismosVivliou(onomaVivliou,isBorrowed);
				break;
				
			case 4:
				epistrofiVivliou(onomaVivliou,isBorrowed);
				break;
				
			case 5:
				isRunning= false;
				break;
				
			default:
				System.out.println("Dwse mia egiri epilogi");
				break;
				
			}
			
			
			
			
			
		}
		
		
		
	}
	static void prosthikiVivliou(String [] array, boolean [] array2) {
		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] ==null) {
			System.out.println("Dwse onoma vilviou");
			array[i] = scanner.nextLine();
			array2[i] = true;
			System.out.println("To vivlio prostethike");
			break;
			}
		}
	}
    static void emfanisiVivliou(String [] array, boolean [] array2) {
    	for(int i = 0; i < array.length; i++) {
    		
    		System.out.println(array[i] + "  ->  " + array2[i]);    	}
    	
    }
    static void daneismosVivliou(String [] array, boolean [] array2) {
    	System.out.println("Poio vivlio theleis na daneisteis? ");
    	String apadisi = scanner.nextLine();
    	boolean found = false;
    	
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] != null && array[i].equalsIgnoreCase(apadisi)) {
    			found = true;
    		
    		if(array2[i]) {
    			array2[i] = false;
    			System.out.println("Epitixis danesimos");
    			
    		}else {
    			System.out.println("To vivlio einai hdh daneismeno");
    		}
    		break;
    	}
    	}
    	if(!found) {
    		System.out.println("Den iparxei ayto to vivlio");
    	}
    	
    }
    static void epistrofiVivliou(String [] array, boolean [] array2) {
    	System.out.println("Poio vivlio theleis na epistrepseis? ");
    	String book = scanner.nextLine();
    	boolean found = false;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i]!= null && array[i].equalsIgnoreCase(book)) {
    		 found = true;
    		if(!array2[i]) {
    			array2[i] = true;
    			System.out.println("To vivlio epistrafike");
    		}else {
    			System.out.println("To vivlio den htan stin lista");
    		}
    		break;
    		}
    	}
    	if(!found) {
    		System.out.println("den vrethike vivlio me ayto to onoma");
    	}
    }
}
