package de.dominik.game;

/**
 * This is the Class 'Stein' for the Game subclass of Move with it's own compareTo() so have the logic.
 */
public class Stein extends Move {
	
	
	/**
	 * Instantiates a new stein.
	 */
	public Stein() {
		super();
		this.Name = "Stein";
		
	}
	
	
	/* (non-Javadoc)
	 * @see de.dominik.game.Move#compareTo(de.dominik.game.Move)
	 */
	@Override
	public int compareTo(Move o) {
		
		
		if(o.Name!=null && !o.Name.isEmpty())
		{
			switch (o.Name) {
				case "Schere":
					return 1;
				case "Papier":
					return -1;
				case "Stein":
					return 0;
			}
		}
		throw new IllegalArgumentException("Not known Move. Check your code");
	}
	
	/* (non-Javadoc)
	 * @see de.dominik.game.Move#toString()
	 */
	@Override
	public String toString() {
		return super.toString();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {


		return (obj instanceof Stein && ((Move)obj).Name.equals("Stein")) ;
	}

}
