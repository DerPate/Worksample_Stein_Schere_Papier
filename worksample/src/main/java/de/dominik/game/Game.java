/*
 * File: Game.java
 * Modification date: 31.10.2015
 * by Dominik Breu
 */
package de.dominik.game;


import de.dominik.Config;

/**
 * The Class Game. Runs the Game. Validates the Moves which are taken and prints the stats when the de.dominik.game is over.
 * @author dominik
 */
public class Game {

	/** The players. */
	private Player[] players = new Player[Config.NUM_PLAYERS];

	/**
	 * Instantiates a new de.dominik.game.
	 */
	public Game() {

		players[0] = new RandomPlayer("A");
		players[1] = new SimplePlayer("B");

	}

	/**
	 * Runs the Game Conig.Rounds times and validates after each move
	 */
	public void run() {

		for (int i = 0; i < Config.ROUNDS; i++) {
			validate(players[0].nextMove(), players[1].nextMove());
			players[0].my_stats.calculate_percentages();
			players[1].my_stats.calculate_percentages();

		}

	}

	/**
	 * Validate. Validates a Move with its compareTo() and gives the points to whom ever won the move
	 *
	 * @param move0 the move0
	 * @param move1 the move1
	 */
	public void validate(Move move0, Move move1) {


		if(move0.compareTo(move1) == 0)
		{
			players[0].my_stats.tiespp();
		}
		
		else if(move0.compareTo(move1)== 1)
		{
			players[0].my_stats.winspp();
		}
		else if(move0.compareTo(move1) == -1)
		{
			players[1].my_stats.winspp();
		}
		else if(move0.compareTo(move1) == -2)
		{
			throw new IllegalArgumentException("Not Known Move inserted");
		}
	
	}

	/**
	 * Print out the Stats after the de.dominik.game is finished
	 */
	public void print_Stats() {
		StringBuilder builder = new StringBuilder();

		builder.append("Player " + players[0].name + " wins " + players[0].my_stats.getWinnings())
				.append(" of " + Config.ROUNDS + " games (" + players[0].my_stats.getPercentage_winnings() * 100
						+ " %) \n")
				.append("Player " + players[1].name + " wins " + players[1].my_stats.getWinnings())
				.append(" of " + Config.ROUNDS + " games (" + players[1].my_stats.getPercentage_winnings() * 100
						+ " %) \n")
				.append("Tie " + players[0].my_stats.getTies() + " of " + Config.ROUNDS + " games ")
				.append("(" + players[0].my_stats.getPercentage_ties() * 100 + " %) \n");

		System.out.println(builder.toString());
	}

}
