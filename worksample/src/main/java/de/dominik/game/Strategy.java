/*
 * File: Strategy.java
 * Modification date: 31.10.2015
 * by Dominik Breu
 */
package de.dominik.game;


import java.util.Random;

/**
 * The Class Strategy. Which controlls how the player will choose the next move
 * 1: simple move allways paper
 * 2: random move from 'Papier' , 'Stein' und 'Schere'
 */
public class Strategy {

  /** The moves. */
  public Move[] moves = {new Papier(),new Stein(), new Schere()};
  
  /** The strategy_flag. */
  public int strategy_flag;
	
	/**
	 * Instantiates a new strategy.
	 *
	 * @param strategy the strategy
	 */
	public Strategy(int strategy) {
		if(strategy !=1 && strategy !=2)
		{
			throw new IllegalArgumentException("Choose 1 or 2 as Strategy or implement your own");
		}
		else
		{
			this.strategy_flag = strategy;
		}
		
	}
	
	
	
	/**
	 * Next sign.
	 *
	 * @return the move
	 */
	public Move nextSign()
	{
		
		switch (strategy_flag) {
		case 1:
			
	       return new Papier();
		case 2:
			
			return moves[new Random().nextInt(3)];

		default:
			
			throw new IllegalArgumentException("Choose 1 or 2 as Strategy or implement your own");
		}
		
		
	}
}
