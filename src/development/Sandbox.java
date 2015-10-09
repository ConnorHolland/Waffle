package development;
import java.util.*;
public class Sandbox {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int number;
	number =  (int) (Math.random()*1000);
	Scanner keyboard = new Scanner(System.in);
	int guess;
	do {
		System.out.print("Guess a number between 1-1000: ");
		guess = keyboard.nextInt();
		if (guess == number)
			System.out.println("Your guess is correct!");
		else if (guess < number)
			System.out.println("Your guess is to low, try again.");
		else if (guess > number)
			System.out.println("Your guess is to high, try again.");
		}while (guess != number);
		
	

	
	
	}
}
