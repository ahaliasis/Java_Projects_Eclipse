import java.util.Scanner;
public class mainDemata {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Gia posous pelates thes na kataxwriseis: ");
		int n = scanner.nextInt();
		
		String [] onomataPelatwn = new String[n];
		double [] varosDematwn = new double[n];
		double  poso = 0 ;
		int xrewsiAnaKilo = 2;
		boolean isRunning = true;
		
		
		while(isRunning) {
			
			System.out.println("********MENU********");
			System.out.println("1-kataxwrisi Stoixeiwn");
			System.out.println("2-emfanisi olwn");
			System.out.println("3-Eyresi pelati me to pio vari dema");
			System.out.println("4-Sinolika posa eispraksewn");
			System.out.println("5-Eksodos");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
			case 1:
				
			kataxwrisiStoixeiwn(onomataPelatwn, varosDematwn);
			
			break;
			
			case 2:
				emfanishOlwn(onomataPelatwn,varosDematwn);
				
			break;
			
			case 3:
				
			evresiMegaliterou(onomataPelatwn,varosDematwn);
			break;
			
			case 4:
				
			sinolikoPoso(varosDematwn,poso,xrewsiAnaKilo);
			break;
			
			case 5:
				isRunning = false;
				break;
				
			default:
				System.out.println("Dwse mia egiri epilogi");
				break;
			}
			
			
		}
		
		
		
		
	}
	static void kataxwrisiStoixeiwn(String [] array1, double [] array2) {
		for(int i = 0; i < array1.length; i++) {
			System.out.print("Dwse onoma pelati: ");
			array1[i] = scanner.nextLine();
			
			System.out.print("Dwse varos Dematos gia: " + array1[i] + " : ");
			array2[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		System.out.println("Oi pelates prostethikan");
	}
	static void emfanishOlwn(String [] array1, double [] array2) {
		for(int i = 0; i < array1.length; i++) {
			System.out.println("Pelatis: " + array1[i] + " varos dematos: " + array2[i]);
		}
	}
	static void evresiMegaliterou(String [] array1, double [] array2) {
		String pelatis = array1[0];
		double max = array2[0];
		
		for(int i = 0; i < array1.length; i++) {
			if(array2[i] > max) {
				max = array2[i];
				pelatis = array1[i];
				
			}
			
		}
		System.out.println("To pio vari dema to exei o pelatis: " + pelatis + " me varos: " + max);
	}
	static void sinolikoPoso(double [] array2, double c,int x) {
		
		for(int i = 0; i < array2.length;i++) {
		c += x * array2[i]; //edw thelei += 
		
		}
		System.out.println("to sinoliko poso eispraksewn einai: " + c);
	}

}
