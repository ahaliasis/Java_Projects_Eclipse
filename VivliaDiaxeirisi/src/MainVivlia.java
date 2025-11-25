import java.util.Scanner;
public class MainVivlia {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.out.print("Posa vivlia theleis na kataxwriseis sto programma: ");
		int n = scanner.nextInt();
		
		String [] vivlia = new String [n];
		int [] diathesimaAntitipa = new int[n];
		boolean isRunning = true;
		
		while(isRunning) {
			
			System.out.println("**********MENU********");
			System.out.println("1-kataxwrisi vivliwn");
			System.out.println("2-Emfanisi olwn");
			System.out.println("3-Daneismos vivlioy");
			System.out.println("4-Epistrofi vivliou");
			System.out.println("5-elegxos poia vivlia exoun eksantlithei");
			System.out.println("6-eksodos");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			
			switch(choice) {
			
			case 1:
				
				kataxwrisiStoixeiwn(vivlia,diathesimaAntitipa);
				break;
				
			case 2:
				
			emfanisi(vivlia,diathesimaAntitipa);
			break;
			
			case 3:
				
			daneismosVivliou(vivlia,diathesimaAntitipa);
			break;
			
			case 4:
				
			epistrofiVivliou(vivlia,diathesimaAntitipa);
			break;
			
			case 5:
				
			elegxosVivliou(vivlia, diathesimaAntitipa);
			break;
			
			case 6:
				isRunning = false;
				System.out.println("Exiting the program");
				break;
				
			default:
				System.out.println("Lathos epilogi");
				
			}
			
			
			
			
			
		}
		
		
		
	
	}

	static void kataxwrisiStoixeiwn(String [] array1, int [] array2) {
		for(int i = 0; i < array1.length;i++) {
			System.out.print("Onoma vivliou: ");
			array1[i] = scanner.nextLine();
			
			
			System.out.print("Diathesima antitipa gia to vivlio: " + array1[i] + " ");
			array2[i] = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("Ta vivlia kataxwrithikan me epitixia");
	}
	static void emfanisi(String [] array1, int [] array2) {
		for(int i = 0; i < array1.length; i++) {
			System.out.println("Vivlio: " + array1[i] + " diathesima antitipa: " + array2[i]);
		}
	}
	
	static void daneismosVivliou(String [] array1, int [] array2) {
		boolean found = true;
		System.out.println("Poio vivlio tha itheles na daneisteis? ");
		String onoma = scanner.nextLine();
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != null && array1[i].equalsIgnoreCase(onoma)) {
				if(array2[i] > 0) {
					array2[i] -= 1;
					System.out.println("To vivlio daneistike me epitixia");
					 found = true;
				}else if(array2[i] == 0) {
					System.out.println("To vivlio einai eksantlimeno");
					
				}
			}
		}
		
	}
	static void epistrofiVivliou(String [] array1, int [] array2) {
		boolean found = false;
		System.out.println("Poio vivlio theleis na epistrepseis? ");
		String vivlio = scanner.nextLine();
		for(int i = 0; i < array1.length;i++) {
			if(array1[i] != null && array1[i].equalsIgnoreCase(vivlio)) {
					array2[i] += 1;
					System.out.println("To vivlio epistrafike me epitixia");
					found = true;
				
			}
		}
	}
	static void elegxosVivliou(String [] array1, int [] array2) {
		for(int i = 0; i < array1.length;i++) {
			if(array2[i] == 0) {
				System.out.println("Ta vivlia poy exoyn eksantlithei einai: " + array1[i]);
			}
		}
	}
}
