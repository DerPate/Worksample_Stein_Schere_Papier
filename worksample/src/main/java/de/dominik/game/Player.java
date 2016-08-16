/*
 * File: Player.java
 * Modification date: 31.10.2015
 * by Dominik Breu
 */
package de.dominik.game;

/**
 * The Class Player. Simple player as superclass for subclasses whit different strategies 
 * @author dominik
 */
public abstract class Player {

	/** The name. */
	public String name = "";
	
	/** The my_stats. */
	public Statistics my_stats;
	
	/** The my_strategy. */
	public Strategy   my_strategy;
	
	
	/**
	 * Next move.
	 *
	 * @return the move
	 */
	public abstract Move nextMove();	
	
	
	
}
