package com.rockpaperscissors.gc;

public class RandomPlayer extends Player {

	@Override
	public Roshambo getRoshambo() {
		double x = Math.random();

		if (x <= 0.33) {

			return(Roshambo.ROCK);

		} else if (x <= 0.66) {
			return(Roshambo.PAPER);

		} else {
			return(Roshambo.SCISSORS);

		}
	}
}
