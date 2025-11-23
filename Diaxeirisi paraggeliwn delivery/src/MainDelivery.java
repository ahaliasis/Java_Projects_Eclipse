import java.util.Scanner;

public class MainDelivery {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] onomateponimo = new String[4];
        double[] times = new double[4];
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nMenu Paraggelias");
            System.out.println("1 - Nea paraggelia");
            System.out.println("2 - Emfanisi olwn twn paraggeliwn");
            System.out.println("3 - Evresi megaliteris paraggelias");
            System.out.println("4 - Sinolo imerisiwn pwlisewn");
            System.out.println("5 - Eksodos");
            System.out.print("Epilogi: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 👈 καθαρίζει το ENTER από το προηγούμενο input

            switch (choice) {
                case 1:
                    paraggelia(onomateponimo, times);
                    break;

                case 2:
                    emfanisi(onomateponimo, times);
                    break;

                case 3:
                    System.out.println("Megisti paraggelia: " + megistis(onomateponimo, times));
                    break;

                case 4:
                    System.out.println("Sinolikes pwliseis: " + sinolo(times));
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Eksodos apo to programma...");
                    break;

                default:
                    System.out.println("Dwse mia egkiri epilogi!");
                    break;
            }
        }
    }

    static void paraggelia(String[] array, double[] array2) {
        // Συμπλήρωση δεδομένων για κάθε πελάτη
        for (int i = 0; i < array.length; i++) {
            System.out.print("Onoma pelati: ");
            array[i] = scanner.nextLine();

            System.out.print("Timi paraggelias gia " + array[i] + ": ");
            array2[i] = scanner.nextDouble();
            scanner.nextLine(); // 👈 καθαρίζει το ENTER για την επόμενη επανάληψη
        }
        System.out.println("Oi paraggelies kataxwrithikan epitixws!");
    }

    static void emfanisi(String[] array, double[] array2) {
        System.out.println("\n--- Lista Paraggeliwn ---");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i] + " -> " + array2[i] + " €");
            }
        }
    }

    static double megistis(String[] array, double[] array2) {
        double max = array2[0];
        String pelatis = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
                pelatis = array[i];
            }
        }

        System.out.println("O pelatis megaliteris paraggelias einai: " + pelatis);
        return max;
    }

    static double sinolo(double[] array2) {
        double sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        return sum;
    }
}
