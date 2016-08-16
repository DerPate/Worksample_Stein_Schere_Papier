/*
 * File: Statistics.java
 * Modification date: 31.10.2015
 * by Dominik Breu
 */
package de.dominik.game;

import de.dominik.Config;

/**
 * The Class Statistics. Holds the Gamestatistics and calculate the percentages
 */
public class Statistics {
	
	
	
	/** The winnings. */
	private int winnings;
	
	/** The ties. */
	private int ties;
	
	/** The percentage_winnings. */
	private float percentage_winnings;
	
	/** The percentage_ties. */
	private float percentage_ties;
	
	/**
	 * Instantiates a new statistics.
	 */
	public Statistics() {
	
		this.winnings = 0;
		this.percentage_winnings = 0;
	}



	/**
	 * Gets the winnings.
	 *
	 * @return the winnings
	 */
	public int getWinnings() {
		return winnings;
	}

	/**
	 * Sets the winnings.
	 *
	 * @param winnings the new winnings
	 */
	public void setWinnings(int winnings) {
		this.winnings = winnings;
	}


	/**
	 * Gets the percentage_winnings.
	 *
	 * @return the percentage_winnings
	 */
	public float getPercentage_winnings() {
		return percentage_winnings;
	}

	/**
	 * Gets the ties.
	 *
	 * @return the ties
	 */
	public int getTies() {
		return ties;
	}

	/**
	 * Sets the ties.
	 *
	 * @param ties the new ties
	 */
	public void setTies(int ties) {
		this.ties = ties;
	}

	/**
	 * Gets the percentage_ties.
	 *
	 * @return the percentage_ties
	 */
	public float getPercentage_ties() {
		return percentage_ties;
	}


	/**
	 * Calculate_percentages.
	 */
	public void calculate_percentages()
	{
		this.percentage_winnings = winnings / new Float(Config.ROUNDS).floatValue();
		this.percentage_ties = ties / new Float(Config.ROUNDS).floatValue();
	}

	/**
	 * Winspp.
	 */
	public void winspp() {
		setWinnings(winnings+1);
	}


	/**
	 * Tiespp.
	 */
	public void tiespp() {
		setTies(ties+1);
		
	}
	

	
	
	
	
}
