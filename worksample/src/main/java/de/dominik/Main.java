/*
 * File: Main.java
 * Modification date: 31.10.2015
 * by Dominik Breu
 */
package de.dominik;

import de.dominik.game.Game;

/**
 * The Class Main.
 */
public class Main {
	
	/** The my_game. */
	public static Game my_game = new Game();
	
	/**
	 * The main method. Just to make the Project runnable from the jar and prints the stats
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		
		
	my_game.run();
	my_game.print_Stats();
		
	
		
	}

}
