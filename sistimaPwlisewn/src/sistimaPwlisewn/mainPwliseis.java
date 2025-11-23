package sistimaPwlisewn;
import java.util.Scanner;
public class mainPwliseis {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		/*
		 * 

              Ονόματα πελατών, υπηρεσίες, κόστος κάθε υπηρεσίας.
             
              καταχωρηση πελατων υπηρεσιςν και κοστος

             Προσθήκη νέας υπηρεσίας.

              Εμφάνιση όλων των πωλήσεων.

              Υπολογισμός συνολικού τζίρου.

              Εύρεση πελάτη με το μεγαλύτερο λογαριασμό.
		 */
		
		System.out.print("Posous pelates thes na kataxwriseis sto programma: ");
		int n = scanner.nextInt();
		
		String [] onomataPelatwn = new String [n];
		String [] ipiresies = new String [n];
		double [] kostosIpiresias = new double[n];
		boolean isRunning = true;
		
		while(isRunning) {
			
			System.out.println("*********MENU*********");
			System.out.println("1-kataxwrisi stoixeiwn");
			System.out.println("2-prosthiki neas ipiresias");
			System.out.println("3-emfanish olwn twn pwlisewn");
			System.out.println("4-Ipologismos sinolikou tzirou");
			System.out.println("5-Evresi pelati me ton megalitero logariasmo");
			System.out.println("6-eksodos");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
			case 1:
				kataxwrisiStoixeiwn(onomataPelatwn,ipiresies,kostosIpiresias);
				break;
				
			case 2:
				prosthikiIpiresias(onomataPelatwn,ipiresies,kostosIpiresias);
				break;
				
			case 3:
				emfanisiPwlisewn(onomataPelatwn,ipiresies,kostosIpiresias);
				break;
				
			case 4:
				System.out.println("O sinolikos tziros einai: " + ipologismosSinolikouTzirou(kostosIpiresias));
				break;
				
			case 5:
				
			   megaliterosLogariasmos(onomataPelatwn, ipiresies, kostosIpiresias);
			   break;
			   
			case 6:
				isRunning = false;
				break;
				
			default:
				System.out.println("Dwse mia egiri epilogi");
				break;
			 
			}
			
			
			
		}
		
		
		
		
		
	}
	static void kataxwrisiStoixeiwn(String [] array1, String [] array2, double [] array3) {
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print("Onoma pelati: ");
			array1[i] = scanner.nextLine();
			
			System.out.print("ipiresia gia ton pelati: " + array1[i] + " : ");
			array2[i]= scanner.nextLine();
			
			System.out.print("Kostos gia tin iperesia:  " + array2[i]);
			array3[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		System.out.println("Oi pelates prostehtikan!");
		
	}
	static void prosthikiIpiresias(String [] array1, String [] array2, double [] array3) {
		boolean found = false;
		System.out.print("Se poion pelati thes na prostheseis ipiresia? ");
		String onoma = scanner.nextLine().trim(); //apla leitourgise me to trim() kalitera 


		for (int i = 0; i < array1.length; i++) {
		    if (array1[i] != null && array1[i].trim().equalsIgnoreCase(onoma)) {
		        System.out.print("Poia ipiresia thes na prostheseis: ");
		        array2[i] = scanner.nextLine();
		        
		        System.out.print("Kostos gia tin ipiresia " + array2[i] + ": ");
		        array3[i] = scanner.nextDouble();
		        scanner.nextLine();
		        
		        found = true; // xreiazomai metavliti flag wste na anagnwrizei an vriskei to stoixeio pou psaxnoyme
		        System.out.println("I nea ipiresia prostethike epitixos ston pelati " + array1[i]);
		        break; // σταματάμε το loop αφού τον βρήκαμε
		    }
		}

		if (!found) {
		    System.out.println("Den vrethike tetoios pelatis!");
		}

		
	}
	static void emfanisiPwlisewn(String [] array1, String [] array2, double [] array3) {
		for(int i = 0 ; i < array1.length; i++) {
			System.out.println("Pelatis: " + array1[i] + " ,ipiresia: " + array2[i] + " ,kostos ipiresias: " + array3[i]);
			
		}
	}
	static double ipologismosSinolikouTzirou( double [] array3) {
		double sum = 0;
		for(int i = 0; i < array3.length; i++) {
			sum += array3[i];
		}
		return sum;
	}
	static void megaliterosLogariasmos(String [] array1, String [] array2, double [] array3) {
		double max = array3[0];
		String pelatis = array1[0];
		String ipiresia = array2[0];
		for(int i = 0; i < array1.length; i++) {
			if(array3[i] > max) {
				max = array3[i];
				pelatis = array1[i];
				ipiresia = array2[i];
			}
		}
		System.out.println("kaliteros pelatis einai: " + pelatis + " ,me ipiresia: " + ipiresia + " ,kostos: " + max);
		
	}

}
