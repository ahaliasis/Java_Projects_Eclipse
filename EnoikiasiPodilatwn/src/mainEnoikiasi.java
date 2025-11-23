import java.util.Scanner;
public class mainEnoikiasi {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String [] kwdikosPodilatou = new String[4];
		double [] wresEnoikiasis = new double[4];
		double [] poso = new double[4];
		int xrewsi = 3;
		boolean isRunning = true;
		
		
		while(isRunning) {
			
			System.out.println("**********MENU*********");
			System.out.println("0-Kataxwrisi stoixeiwn");
			System.out.println("1-Ypologismos posou gia kathe enoikiasi");
			System.out.println("2-Sinoliko poso eispraksewn");
			System.out.println("3-emfanisi olwn twn enoikiasewn");
			System.out.println("4-eksodos");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
			case 0:
				kataxwrisiStoixeiwn(kwdikosPodilatou,wresEnoikiasis);
				break;
			
			case 1:
				ipologismosPosouGiakatheEnoikiasi(kwdikosPodilatou,wresEnoikiasis,poso,xrewsi);
				
				break;
				
			case 2:
				
			    sinolikaPosaEispraksewn(poso);
			    
			    break;
			    
			case 3:
				emfanisiOlwtwnEnoikiasewn(kwdikosPodilatou,wresEnoikiasis);
				
				break;
				
			case 4:
				isRunning = false;
				
				break;
				
			default:
				System.out.println("Dwse egiri epilogi");
				break;
			
			}
			
			
			
		}
		
		
		
		
		
	}

	static void ipologismosPosouGiakatheEnoikiasi(String [] array1, double [] array2,double [] array3, int x) {
		
		for(int i = 0; i < array1.length;i++) { //eftiaksa ena allon pinka gia na apothikeyei ta posa 
			array3[i] = array2[i] * x;
			
			System.out.println("O pelatis " + array1[i] + " xrisimopoihse to podilato gia " + array2[i] + " wres kai tha plirwsei " + array3[i] + " $" );
		}
		
		
	}
	static void sinolikaPosaEispraksewn( double [] array3) {
		double sum = 0;
		for(int i = 0; i < array3.length; i++) {
			sum +=array3[i];
		}
		System.out.println("Ta sinolika posa eispraksewn einai: " + sum);
		
	}
	static void emfanisiOlwtwnEnoikiasewn(String [] array1, double [] array2) {
		for(int i = 0; i < array1.length; i++) {
			
			System.out.println("Kwdikos podilatou: " + array1[i] + " wres enoikiasis: " + array2[i]);
		}
	}
	static void kataxwrisiStoixeiwn(String [] array1, double [] array2) {
		for(int i = 0; i < array1.length; i++) {
			System.out.print("Kwdikos podilatou: ");
			array1[i] = scanner.nextLine();
			
			System.out.print("Wres xrisis gia kwdiko: " + array1[i] + " : ");
				array2[i] = scanner.nextDouble();
				scanner.nextLine();
				
			
		}
		System.out.println("Ta podialta prostethikan");
		
	}
}
