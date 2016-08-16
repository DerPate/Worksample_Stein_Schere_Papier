package de.dominik.game;

/**
 * This is the Class 'Papier' for the Game subclass of Move with it's own compareTo() so have the logic.
 * @author dominik
 *
 */
public class Papier extends Move {

	
	/**
	 * Instantiates a new papier.
	 */
	public Papier() {
		super();
		this.Name = "Papier";
		
	}
	
	
	/* (non-Javadoc)
	 * @see de.dominik.game.Move#compareTo(de.dominik.game.Move)
	 */
	@Override
	public int compareTo(Move o) {
		
		
		if(o.Name!=null && !o.Name.isEmpty())
		{
			switch (o.Name) {
				case "Stein":
					return 1;
				case "Schere":
					return -1;
				case "Papier":
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
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {


		return (obj instanceof Papier && ((Move)obj).Name.equals("Papier")) ;
	}
}
