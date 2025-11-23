import java.util.Scanner;
public class KsenodoxeioMain {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ονόματα πελατών, αριθμός διανυκτερεύσεων, τιμή ανά διανυκτέρευση.

          Υπολογισμός συνολικού ποσού κράτησης.

         Εμφάνιση όλων των κρατήσεων.

         Εύρεση πελάτη με τη μεγαλύτερη κράτηση.

          Υπολογισμός συνολικών εσόδων ξενοδοχείου.
		 */
		
		System.out.println("Posous pelates theleis na kataxwriseis? ");
		int n = scanner.nextInt();
		
		String[] onomataPelatwn = new String[n]; 
		int [] arithmosDianiktereusewn = new int[n];
		int timiAnaDianiktereusi = 80;
		boolean isRunning = true;
		
		
		while(isRunning) {
			
			System.out.println("*********MENU********");
			System.out.println("1-Kataxwrisi Pelatwn");
			System.out.println("2-Ypologismos sinolikou posou kratisis");
			System.out.println("3-Emfanish olwn twn kratisewn");
			System.out.println("4-Evresi pelati me tin megaliteri kratisi");
			System.out.println("5-Ypologismos sinolikwn esodwn ksenodoxeiou");
			System.out.println("6-Eksodos");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			
			
			switch(choice) {
			
			case 1:
				kataxwrisiPelatwn(onomataPelatwn, arithmosDianiktereusewn);
				break;
				
			case 2:
			    
				ipologismosSinolikouPosouKratisis(onomataPelatwn, arithmosDianiktereusewn,timiAnaDianiktereusi);
				break;
				
			case 3:
				emfanishOlwnTwnKratisewn(onomataPelatwn, arithmosDianiktereusewn);
				break;
				
			case 4:
				megaliteriKratisi(onomataPelatwn, arithmosDianiktereusewn);
				break;
			
			case 5:
				System.out.println("Ta sinolika esoda tou ksenodoxeiou einai: " + sinolikaEsoda(arithmosDianiktereusewn,timiAnaDianiktereusi));
				break;
			   
			case 6:
				isRunning = false;
				System.out.println("Exiting the program....");
				break;
				
			default:
				System.out.println("Dwse mia egiri epilogi!!");
				break;
				
			}
			
			
			
			
		}

	}
	static void kataxwrisiPelatwn(String [] array1, int [] array2) {
		for(int i = 0; i < array1.length; i++) {
			System.out.print("Dwse Onoma Pelati: ");
			array1[i] = scanner.nextLine();
			
			System.out.print("Meres dianiktereysis gia: " + array1[i] + " :");
			array2[i] = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("Oi pelates kataxwrithikan");
	}
	static void ipologismosSinolikouPosouKratisis(String [] array1, int [] array2, int x) {
	
		for(int i = 0; i < array1.length; i++) {
			double poso = array2[i] * x;
			
		System.out.println("O pelatis: " + array1[i] +" tha plirwsei: " + poso + "$");
		}
	}
	static void emfanishOlwnTwnKratisewn(String [] array1, int [] array2)
	{
		for(int i = 0; i < array1.length;i++) {
			System.out.println("Onoma: " + array1[i] + "meres dianiktereusis: " + array2[i]);
		}
	}
	static void megaliteriKratisi(String [] array1, int [] array2) {
		int max2 = array2[0];
		String pelatis = array1[0];
		for(int i = 0; i < array1.length;i++) {
			if(array2[i] > max2) {
				max2 = array2[i];
				pelatis = array1[i];
			}
		}
		System.out.println("Megaliteri kratisi exei o pelatis: " + pelatis + " me arithmo imerwn: " + max2);
		
	}
	static double sinolikaEsoda( int [] array2, int x) {
		double sinolo = 0;
		for(int i = 0; i < array2.length;i++) {
			sinolo += array2[i] * x;
		}
		return sinolo;
	}
}
