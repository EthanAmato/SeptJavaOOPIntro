package com.tts.game;

import java.lang.Math;
import java.util.Scanner;

/**
 * This is a guessing game where, upon calling the constructor, the user will
 * pass in upper and lower boundaries for a positive random number generator.
 * The game will then initialize upon the .play() method which will prompt the
 * user to guess an integer from the upper and lower boundaries. The player will
 * then enter a guess, which will be responded to by the program with 'lower' or
 * 'higher' based on the difference between the random number and the guessed
 * number. This will continue to run until the player guesses the correct number
 * or puts in a negative number
 **/
public class GuessingGame {

//	Lets store the boundaries as instance variables
	private Integer upper;
	private Integer lower;

	// Let's also store the random number chosen as an instance variable
	private Integer secretRandomNumber;

	// Next comes the constructor

	public GuessingGame(Integer lower, Integer upper) {
		if (upper > lower) {
			// Set up the rest of the game
			this.lower = lower;
			this.upper = upper;

			// Call our local static helper method to set our instance variable
			// to a random integer from lower to upper (inclusive)
			this.secretRandomNumber = generateRandomFromRange(lower, upper);
			
		} else {
			System.err.println("Please ensure that the upper boundary is larger than the lower boundary");
		}
	}

	// User must call the play method to start the game
	// This will return void because we're just gonna print
	// in here:

	public void play() {
		Scanner input = new Scanner(System.in);

		Integer numTries = 0;
		Integer currentGuess;

		boolean hasGuessedCorrectly = false;

		generateSeparator();
		System.out.println("Welcome to the guessing game!");
		System.out.printf("I'm thinking of a number between %d and %d\n", this.lower, this.upper);
		generateSeparator();

		while (!hasGuessedCorrectly) {
			System.out.print("Enter your guess: ");
			currentGuess = input.nextInt();
			numTries++;

			if (currentGuess < this.lower || currentGuess > this.upper) {
				generateSeparator();
				System.out.printf("Remember, the number is between %d and %d\n", this.lower, this.upper);
				generateSeparator();
			} else if (currentGuess < this.secretRandomNumber) {
				generateSeparator();
				System.out.println("The number is higher than " + currentGuess + ".");
				generateSeparator();
			} else if (currentGuess > this.secretRandomNumber) {
				generateSeparator();
				System.out.println("The number is lower than " + currentGuess + ".");
				generateSeparator();
			} else {
				hasGuessedCorrectly = true;
				generateSeparator();
				System.out.println("Congratulations! You've guessed the right number!");
				System.out.println("It took you " + numTries + " tries to guess " + this.secretRandomNumber);
				generateSeparator();
			}

		}
		input.close();
	}

	// Helper method for generating a random number from a lower and upper range
	private static Integer generateRandomFromRange(Integer lower, Integer upper) {
		// Increment our boundaries so that our randomNumber is inclusive rather
		// than exclusive
		upper += 1;
		lower -= 1;
		Integer randomNumber = (int) (Math.random() * ((upper - lower) + 1) + lower);

		return randomNumber;
	}

	private static void generateSeparator() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}

}
