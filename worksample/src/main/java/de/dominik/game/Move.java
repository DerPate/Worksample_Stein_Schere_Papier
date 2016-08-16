package de.dominik.game;


/**
 * The Class Move. This is the Baseclass for all Moves in this Game
 */
public abstract class Move implements Comparable<Move>{

	/** The Name. */
	public String Name;

	/**
	 * this compareTo() has a non natural sorting which goes by following assumption <br>
	 * Move   win 1  eg. paper beats rock <br>
	 * Move   tie  0  eg. paper vs. paper <br>
	 * Move   lost -1 eg. scissors vs. paper <br>
	 * this will be done in any subclass so this method will be empty<br>
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public  int compareTo(Move o) {
		
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Move: "+ Name;
	}
	
}
