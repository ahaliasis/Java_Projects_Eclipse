import java.util.Scanner;
public class main {
	
static	Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String [] pinakidaAytokinitou = new String[3];
		int [] wraEisodou = new int[3];
		int [] wraEksodou = new int[3];
		double  xrewsiAnaWra = 3.50;
		boolean isRunning = true;
		
		while(isRunning) {
			System.out.println("*******MENU*******");
			System.out.println("1-Kataxwrisi neoy aytokinioy");
			System.out.println("2-Emfanish olwn twn stathevmenwn");
			System.out.println("3-Anazitisi oximatos me pinakida");
			System.out.println("4-Ypologismos sinolikou posou pou exei espraxthei");
			System.out.println("5-Ypologismos gia kathe amaksi");
			System.out.println("6- Eksodos");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
			case 1:
				
			 kataxwrisiAytokinitou(pinakidaAytokinitou,wraEisodou,wraEksodou);
			 break;
			 
			case 2:
				
			emfanishAytokinitwn(pinakidaAytokinitou,wraEisodou);
			break;
			
			case 3:
				anazitisiAytokinitou(pinakidaAytokinitou,wraEisodou);
				break;
				
			case 4:
				System.out.println("To sinoliko poso pou exei eispraxthei einai: " + ipologismos(wraEisodou,xrewsiAnaWra));
				break;
				
			case 5:
				ipologismosKatheAytokinitou(wraEisodou,wraEksodou,xrewsiAnaWra);
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
	static void kataxwrisiAytokinitou(String [] array1, int [] array2, int [] array3) {
		for(int i = 0; i < array1.length;i++) {
			System.out.println("Dwse pinakida: ");
			array1[i] = scanner.nextLine();
			
			System.out.println("Wra eisodou gia " + array1[i] + ":");
			array2[i] = scanner.nextInt();
			
			
			System.out.println("Wra eksodou gia " + array1[i] + ":");
			array3[i] = scanner.nextInt();
			scanner.nextLine();
			
			
		}
		System.out.println("Ta aytokinitia prostethikan");
	}
	static void emfanishAytokinitwn(String [] array1, int [] array2) {
		for(int i = 0; i < array1.length; i++) {
			if(array1 != null) {
				System.out.println("Aytokinito: " + array1[i] + " wra eisodou: " + array2[i]);
			}
		}
	}
    static void anazitisiAytokinitou(String [] array1, int [] array2) {
    	System.out.println("Poia pinakida theleis na psakseis? ");
    	String pinakida = scanner.nextLine();
    	
    	for(int i = 0; i < array1.length; i++) {
    		if(array1[i] != null && array1[i].equalsIgnoreCase(pinakida)) {
    			System.out.println("Pinakida: "+ pinakida + " wra eisodou: " + array2[i]);
    		}
    	}
    }
    static double ipologismos(int [] array2, double xrewsi) {
    	double poso =0;
    	for(int i = 0; i < array2.length; i++) {
    		poso += array2[i] * xrewsi;
    	}
    	return poso;
    }
    static double ipologismosKatheAytokinitou(int[] wraEisodou, int[] wraEksodou, double xrewsiAnaWra) {
        double sinolikoPoso = 0;
        
        for (int i = 0; i < wraEisodou.length; i++) {
            if (wraEisodou[i] != 0 && wraEksodou[i] != 0) { // Έλεγχος να υπάρχουν δεδομένα
                int wres = wraEksodou[i] - wraEisodou[i];
                if (wres < 0) wres += 24; // Αν πέρασε τα μεσάνυχτα
                double posoGiaAuto = wres * xrewsiAnaWra;
                System.out.println("To aytokinito stathmeythike " + wres + " wres kai plirwnei " + posoGiaAuto + "€");
                sinolikoPoso += posoGiaAuto;
            }
        }
        
        return sinolikoPoso;
    }

}
