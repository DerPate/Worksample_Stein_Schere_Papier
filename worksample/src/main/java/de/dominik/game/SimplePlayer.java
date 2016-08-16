/*
 * File: SimplePlayer.java
 * Modification date: 31.10.2015
 * by Dominik Breu
 */
package de.dominik.game;

/**
 * The Class SimplePlayer. will just use 'Papier' as its next move.
 */
public class SimplePlayer extends Player{

	
	
	/**
	 * Instantiates a new simple player.
	 *
	 * @param name the name
	 */
	public SimplePlayer(String name) {
		
	this.name = name;
	this.my_strategy = new Strategy(1);
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
