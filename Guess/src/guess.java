import java.util.Scanner;

public class guess {
	
	public static void main(String[] args) {
		
		int guess;
		int randomnumber = (int)(Math.random()*10) + 1;
		String numb = new String();
		String end = new String();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.");
		
		for(int tries = 0; tries < 3; tries++) {
			
			if(tries == 0) {
				numb = "first";
			} else if(tries == 1) {
				numb = "second";
			} else if(tries == 2) {
				numb = "third";
			}
			
			if(tries == 2)
				end = "\nYou lose. The correct number was " +randomnumber;
				
			System.out.println("Enter your " +numb+ " guess: ");
			guess = scan.nextInt();
			
			if(guess == randomnumber) {
				System.out.println("Correct! You win!");
				break;
				
			} else if(guess > randomnumber) {
				System.out.println("Your guess is too high. " +end);
			
			} else if(guess < randomnumber) {
				System.out.println("Your guess is too low. " +end);
			}
			
		}
	}
}