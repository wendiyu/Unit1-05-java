
/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 11 2019
 * Created for: ICS4U
 * This program generates a number from 1 to the range that selected.
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class DiceGame2 {

	public static void main(String[] args) {
		
		// generate number 1 to 6
		Random range = new Random();
		
		int numberOfTries = 0;
		int userRange;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("This is a guessing number game. "
				+ "Please, select a integer number as your range between 1 and ");
		
		// create a variable that can holds the range from user
		userRange = userInput.nextInt();
		System.out.println(" Your range are between 1 and " + userRange);
		
		// range cannot be negative
		if (userRange < 0) {
			System.out.println(" Please, put a whole number like 31,15, 100 ");
		}
		else {
			
		    // generate number 1 to selected range
		    int guess = range.nextInt(userRange) +1;
		
		    int userGuess;
		    boolean win = false;
		
		    while (win == false) {
			System.out.println("This is a guessing number game. Enter a number between 1 and " + userRange + ":" );
			
			userGuess = userInput.nextInt();
			numberOfTries++;
			
			if (userGuess == guess) {
				win = true;
				System.out.println("You Got It! The number was " + guess );
				System.out.println("It took you " + numberOfTries + " tries");
			}
			
			else if ( userGuess < guess || userGuess > guess ) {
				System.out.println("Sorry, it is not the right answer. Try again! ");
			}
			
			}
		}
			
		}

	}
