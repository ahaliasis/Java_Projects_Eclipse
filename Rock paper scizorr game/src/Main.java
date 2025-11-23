import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String playerChoice;
		String computerChoice;
		String choice1;
		String [] choices = {"rock", "paper", "scizors"};
		boolean isRunning = true;
	
		
		while(isRunning) {
		System.out.println("*******Game******");
		System.out.println("Dialekse Rock , paper, scizors");
		playerChoice = scanner.nextLine();
		System.out.println("Dialekses: " + playerChoice);
		
		if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scizors")) {
			System.out.println("Dwse egiri timi");
		}
		computerChoice = choices[random.nextInt(3)];
		System.out.println("O ipologstis dialekse: " + computerChoice);
		
		if(playerChoice.equals(computerChoice)) {
			System.out.println("Its a tie");
		}else if(playerChoice.equals("rock") && computerChoice.equals("paper")){
			System.out.println("The computer wins");
			
		}else if(playerChoice.equals("paper") && computerChoice.equals("rock")){
			System.out.println("You win");
			
		}else if(playerChoice.equals("rock") && computerChoice.equals("scizors")){
			System.out.println("You win");
		}else if(playerChoice.equals("scizors") && computerChoice.equals("rock")){
			System.out.println("The computer wins");
		}else if(playerChoice.equals("paper") && computerChoice.equals("scizors")){
			System.out.println("The computer wins");
		}else if(playerChoice.equals("scizors") && computerChoice.equals("paper")){
			System.out.println("You win");
		}else if(playerChoice.equals("rock") && computerChoice.equals("scizors")){
			System.out.println("You win");
		}else if(playerChoice.equals("scizors") && computerChoice.equals("rock")){
			System.out.println("The computer wins");
		}
		
		System.out.println("Thes na sinexiseis? yes/no ");
		choice1 = scanner.nextLine();
	
		if(choice1.equals("no")) {// na miin ksexanw to equals
			isRunning = false;
		
		}
	
			
		}	
		System.out.println("Thanks for playing");	
			
			
			
		
	}

}