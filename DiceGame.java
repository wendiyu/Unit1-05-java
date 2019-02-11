/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 11 2019
 * Created for: ICS4U
 * This program generates a number from 1 to 6.
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		
		// generate number 1 to 6
		Random range = new Random();
		
		int userGuess = range.nextInt(6) + 1;
		int numberOfTries = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		int guess;
		boolean win = false;
		
		while (win == false) {
			System.out.println("This is a guessing number game. Enter a number between 1 and 6: ");
		
			guess = scanner.nextInt();
			numberOfTries++;
			
			if (guess == userGuess) {
				win = true;
				System.out.println("You Got It! The number was " + userGuess );
				System.out.println("It took you " + numberOfTries + " tries");
			}
      
			else if ( guess != userGuess) {
				System.out.println("Invaild number! Try again! ");
			}
			
			}
			
		}

	}
