import java.util.Scanner;

public class GuessingGame {
	
	public static int getRandom(int min, int max) {
		return (int)(Math.random() * (max + 1) +min);
	}
	
	public static void main(String[] args) {
		
		int guess, min, max, randomNumber;
		String numb = new String();
		String end = new String();
		String loopResponse = "Yes";
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Welcome to the guessing game! \nEnter two integers you want to guess between: ");
			min = scan.nextInt();
			max = scan.nextInt();
			
			randomNumber = getRandom(min, max);
			
			for(int triesLeft = 0; triesLeft < 3; triesLeft++) {
				
				if(triesLeft == 0) {
					numb = "first";
				} else if(triesLeft == 1) {
					numb = "second";
				} else if(triesLeft == 2) {
					numb = "third";
				}
				
				if(triesLeft == 2)
					end = "\nYou lose. The correct number was " +randomNumber;
					
				System.out.println("Enter your " +numb+ " guess: ");
				guess = scan.nextInt();
				
				if(guess == randomNumber) {
					System.out.println("Correct! You win!");
					break;
					
				} else if(guess > max) {
					System.out.println("That guess is not within the parameters you set. " +end);
				
				} else if(guess < min) {
					System.out.println("That guess is not within the parameters you set. " +end);
					
				} else if(guess > randomNumber) {
					System.out.println("Your guess is too high. " +end);
					
					
				} else if(guess < randomNumber) {
					System.out.println("Your guess is too low. " +end);
					
				}
				
			} 
			System.out.println("Would you like to play again?");
			loopResponse = scan.next();
			
		} while(loopResponse.equals("Yes"));
	}
}