import java.util.Scanner;

public class ErgazomenoiMain {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.out.println("Posous ergazomenous theleis na kataxwriseis? ");
		int n = scanner.nextInt();
		
	String [] onomata = new String[n];
	double [] misthos = new double[n];
	boolean isRunning = true;
	
	
	
	while(isRunning) {
		
		System.out.println("*****MENU******");
		System.out.println("1-KAtaxwrisi Stoixeiwn");
		System.out.println("2-Mesos misthos");
		System.out.println("3-Megaliteros misthos");
		System.out.println("4-Enimerwsi misthou ergazomenou");
		System.out.println("5-Emfanish olwn twn stoixeiwn");
		System.out.println("6-Eksodos");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		
		switch(choice) {
		
		case 1:
			kataxwrisiStoixeiwn(onomata,misthos);
			break;
			
		case 2:
			mesosMisthos(misthos);
			break;
		
		case 3:
			megaliterosMisthos(onomata,misthos);
			break;
			
		case 4:
			enimerwsiMisthou(onomata,misthos);
			break;
		case 5:
			emfanishOlwnTwnStoixeiwn(onomata,misthos);
			break;
		case 6:
			isRunning = false;
			System.out.println("Exiting the program");
			break;
			
		default:
			System.out.println("Dwse mia egiri epilogi");
			break;
			
		}
		
		
	}
		
		
	}
	static void kataxwrisiStoixeiwn(String [] array1, double [] array2) {
		for(int i = 0; i < array1.length;i++) {
			System.out.print("Onoma ergazomenou: ");
			array1[i] = scanner.nextLine();
			
			System.out.print("Misthos gia ton ergazomeno " + array1[i] + " : ");
			array2[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		System.out.println("Ta stoixeia kataxwrithikan me epitixia");
	}
	static void mesosMisthos(double [] array2) {
		int sum = 0;
		double average = 0;
		
		for(int i = 0; i < array2.length; i++) {
			sum += array2[i];
		}
		average = sum / array2.length;
		System.out.println("O mesos misthos einai: " + average);
		
		
		
	}
	static void megaliterosMisthos(String [] array1, double [] array2) {
		String ergazomenos = array1[0];
		double max = array2[0];
		for(int i = 0 ; i < array1.length; i++) {
			if(array2[i] > max) {
				max = array2[i];
				ergazomenos = array1[i];
			}
		}
		System.out.println("Megalitero mistho exei: " + ergazomenos + "me mistho: " + max);
	}
	static void enimerwsiMisthou(String [] array1, double [] array2) {
 
	boolean found = false;
	
	System.out.println("Poianou ergazomenou theleis na enimerwseis ton mistho: ");
	String ergazomenos = scanner.nextLine();
	
	for(int i = 0; i <array1.length; i++) {
		if(array1[i] != null && array1[i].equalsIgnoreCase(ergazomenos)) {
			System.out.println("Poso theleis na einai o misthos tou: ");
			array2[i] = scanner.nextDouble();
			
			found = true;
		}
	}
	if(found) {
		System.out.println("O misthos enimerwthike me epitixia"); //na min ksexnaw na vazw sinthiki 
		
	}else {
		System.out.println("den vrethike o ergazomenos");
	}
	
		
		
	}
	static void emfanishOlwnTwnStoixeiwn(String [] array1, double [] array2) {
		for(int i = 0; i < array1.length; i++) {
			System.out.println("Ergazomenos: " + array1[i] + " misthos: " + array2[i]);
		}
	}
}
