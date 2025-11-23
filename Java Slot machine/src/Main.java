import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int bet;
		int balance = 100;
		int payout;
		String [] symbols;
		String choice;
		
		
		while(balance > 0) {
		System.out.println("*******************************");
		System.out.println("Welcome to java Slot machine");
		System.out.println("🍒 🍉 🍋 🔔 ");
		System.out.println("*******************************");
		
		System.out.println("Your balance now is: " + balance);
		System.out.println("Enter your bet: ");
		bet = scanner.nextInt();
		
		if(bet > balance) {
			System.out.println("Not enough money");
			continue;
		}else if(bet <= 0) {
			System.out.println("You cant use negative money");
			continue;
		}else {
			
			balance -= bet;
			
		}
		System.out.println("Spinning....");
		symbols = spinRow();
		printRow(symbols);
		
		payout = getPayout(symbols,bet);
		
		if(payout > 0) {
			System.out.println("You won $" + payout);
			balance += payout;
		}else {
			System.out.println("Sorry you lost this round");
		}
		
		System.out.println("Would you like to play again? (y/n)");
		scanner.nextLine();
		choice = scanner.nextLine().toLowerCase();
		
		if(!choice.equals("y")) {
			break;
		}
		
		
		
		}
		System.out.println("Thanks for playing");
		scanner.close();
	}
	static String[] spinRow() {
		
		String [] symbols = {"🍒", "🍉", "🍋", "🔔"};
		String [] row = new String[3];
		Random random = new Random();
		
		
		
		for(int i = 0; i < 3; i++) {
			row[i] = symbols[random.nextInt(symbols.length)];
		}
		return row;
	}
	static void printRow(String [] row) {
		System.out.println("**********************");
		System.out.println(" " + String.join(" | ", row));
		System.out.println("**********************");
	}
    static int getPayout(String [] row, int bet) {
    	
    	if(row[0].equals(row[1]) && row[1].equals(row[2])) {
    		return switch(row[0]) {
    		case "🍒" -> bet * 3;
    		case "🍉" -> bet * 4;
    		case "🍋" -> bet * 5;
    		case "🔔" -> bet * 10;
    		default -> 0;
    		
    		};
    		
    	}else if(row[0].equals(row[1])) {
    		return switch(row[0]) {
    		case "🍒" -> bet * 2;
    		case "🍉" -> bet * 3;
    		case "🍋" -> bet * 4;
    		case "🔔" -> bet * 10;
    		default -> 0;
    		
    		};
    		
    	}else if(row[1].equals(row[2])) {
    		return switch(row[1]) {
    		case "🍒" -> bet * 3;
    		case "🍉" -> bet * 4;
    		case "🍋" -> bet * 5;
    		case "🔔" -> bet * 10;
    		default -> 0;
    		
    		};
    		
    	}
    	return 0;
    }
}
