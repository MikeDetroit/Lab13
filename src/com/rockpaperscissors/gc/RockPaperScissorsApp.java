package com.rockpaperscissors.gc;

import java.util.Scanner;

// Anthony Reakoff, Alli Farr, Michael DeCoopman
// Lab 13

public class RockPaperScissorsApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Rock Paper Scissors game!");
		System.out.println();

		RockPlayer r = new RockPlayer();
		RandomPlayer p = new RandomPlayer();

		String userName = Validator.getString(scan, "Please enter your name:");
		String ans = "y";
		String userP = " ";

		System.out.println("Welcome, " + userName + "!");
		System.out.println();

		String userChoice = Validator.getString(scan, "Would you like to play against The Jets or The Sharks (j/s)");

		while (ans.equalsIgnoreCase("y")) {
			if (userChoice.equalsIgnoreCase("j")) {
				userP = Validator.getString(scan, "Rock, Paper, or Scissors? (R/P/S): ");
				System.out.println();
				if (userP.equalsIgnoreCase("R")) {
					System.out.println(userName + ": " + Roshambo.ROCK);
					System.out.println("The Jets: " + r.getRoshambo());
					System.out.println("DRAW!");
				} else if (userP.equalsIgnoreCase("P")) {
					System.out.println(userName + ": " + Roshambo.PAPER);
					System.out.println("The Jets: " + r.getRoshambo());
					System.out.println(userName + " wins!");
				} else if (userP.equalsIgnoreCase("s")) {
					System.out.println(userName + ": " + Roshambo.SCISSORS);
					System.out.println("The Jets: " + r.getRoshambo());
					System.out.println("The Jets won!");
				}

			}

			else if (userChoice.equalsIgnoreCase("s")) {
				Roshambo n = p.getRoshambo();
				userP = Validator.getString(scan, "Rock, Paper, or Scissors? (R/P/S): ");

				if (userP.equalsIgnoreCase("r") && n.toString().equalsIgnoreCase("rock")) {
					System.out.println(userName + ": " + Roshambo.ROCK);
					System.out.println("The Sharks: " + n);
					System.out.println("DRAW!");
				} else if (userP.equalsIgnoreCase("r") && n.toString().equalsIgnoreCase("scissors")) {
					System.out.println(userName + ": " + Roshambo.ROCK);
					System.out.println("The Sharks: " + n);
					System.out.println(userName + " wins!");
				} else if (userP.equalsIgnoreCase("r") && n.toString().equalsIgnoreCase("paper")) {
					System.out.println(userName + ": " + Roshambo.ROCK);
					System.out.println("The Sharks: " + n);
					System.out.println("The Sharks win!");
				} else if (userP.equalsIgnoreCase("s") && n.toString().equalsIgnoreCase("rock")) {
					System.out.println(userName + ": " + Roshambo.SCISSORS);
					System.out.println("The Sharks: " + n);
					System.out.println("The Sharks win!");
				} else if (userP.equalsIgnoreCase("s") && n.toString().equalsIgnoreCase("paper")) {
					System.out.println(userName + ": " + Roshambo.SCISSORS);
					System.out.println("The Sharks: " + n);
					System.out.println(userName + " wins!");
				} else if (userP.equalsIgnoreCase("s") && n.toString().equalsIgnoreCase("scissors")) {
					System.out.println(userName + ": " + Roshambo.SCISSORS);
					System.out.println("The Sharks: " + n);
					System.out.println("DRAW!");
				} else if (userP.equalsIgnoreCase("p") && n.toString().equalsIgnoreCase("rock")) {
					System.out.println(userName + ": " + Roshambo.PAPER);
					System.out.println("The Sharks: " + n);
					System.out.println(userName + " wins!");
				} else if (userP.equalsIgnoreCase("p") && n.toString().equalsIgnoreCase("paper")) {
					System.out.println(userName + ": " + Roshambo.PAPER);
					System.out.println("The Sharks: " + n);
					System.out.println("DRAW!");
				} else if (userP.equalsIgnoreCase("p") && n.toString().equalsIgnoreCase("scissors")) {
					System.out.println(userName + ": " + Roshambo.PAPER);
					System.out.println("The Sharks: " + n);
					System.out.println("The Sharks win!");
				} else
					System.out.println("Invalid data. Please try again.");

			} else {

				System.out.println("Invalid Input. Restart program.");
				break;

			}
			userP = " ";
			System.out.println();
			ans = Validator.getString(scan, "Play again? y/n ");
		}
		System.out.println();
		System.out.println("Thanks for playing!");

	}

}
