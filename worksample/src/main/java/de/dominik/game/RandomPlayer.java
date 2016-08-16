/*
 * File: RandomPlayer.java
 * Modification date: 31.10.2015
 * by Dominik Breu
 */
package de.dominik.game;

/**
 * The Class RandomPlayer. hence the name it will do random moves
 * @author dominik
 */
public class RandomPlayer extends Player{

	/**
	 * Instantiates a new random player.
	 *
	 * @param name the name
	 */
	public RandomPlayer(String name) {
		
	this.name = name;
	this.my_strategy = new Strategy(2);
	this.my_stats = new Statistics();
		
	}
	
	/* (non-Javadoc)
	 * @see de.dominik.game.Player#nextMove()
	 */
	@Override
	public Move nextMove() {

		return my_strategy.nextSign();
		
	}
	
	
	

}
