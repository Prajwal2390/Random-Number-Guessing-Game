package com.random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in); // create a Scanner object
		Random random=new Random();// create a random object
		int MinRange=1;
		int MaxRange=100;
		int MaxAttempt=5;
		int Score=0;
		boolean PlayAgin=true;
		int Level=2;
		while(PlayAgin) {
			int Randomnumber=MinRange+random.nextInt(MaxRange);// set the range to generate random value
			int Attempt=0;
			boolean guessdCorrectly=false;
			System.out.println("================================================================================");
			System.out.println("Welcome To Number Gussing Game ");
			System.out.println("Guess the Number Between "+MinRange+" to "+MaxRange);
			while(Attempt< MaxAttempt &&!guessdCorrectly) {
				System.out.println("Enter your Guess");
				int GuessNumber=ip.nextInt();
				if(Randomnumber==GuessNumber) {
					Score+=MaxAttempt-Attempt; // Score=Score+MaxAttempt-Attempt
					guessdCorrectly=true;
					System.out.println("Congragulation! You guessed the Number");
				}
				else if(GuessNumber<Randomnumber) {
					System.out.println("Guessed Number is too low! Try again");
				}
				else {
					System.out.println("Guessed Number is too High! Try again");		
				}
				Attempt++;
			}
			if(!guessdCorrectly) {
				System.out.println("Oops! You Ran out of Attempts, The Number was "+Randomnumber);
			}
			System.out.println("Your Score is "+Score);
			if(guessdCorrectly) {
			System.out.println("If you want to play Level "+ Level+ ", Type 'yes' or 'No'");
			Level++;
			String PlayAgainInput=ip.next();// Entering "yes" or "No" String value
			PlayAgin=PlayAgainInput.equalsIgnoreCase("yes"); //EqualsIgnoreCase() will give boolean Value
			}
			else {
				System.out.println("If you want to continue the game type 'yes' or 'No'");
				String PlayAgainInput=ip.next();// Entering "yes" or "No" String value
				PlayAgin=PlayAgainInput.equalsIgnoreCase("yes"); //EqualsIgnoreCase() will give boolean Value
				Level=2;
			}
		}
		System.out.println("Thank you for playing This Game");
		System.out.println("===========================================================================================");
	}
}

