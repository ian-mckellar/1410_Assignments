package inheritance;

/**
 * Represents a square. A square is a rectangle with a length and width that are
 * equals
 * 
 * @author ian
 *
 */
public class Square extends Rectangle {
	/**
	 * Initializes a square with a side of type int
	 * 
	 * @param side
	 */
	public Square(int side) {
		super(side, side);
	}

	/**
	 * returns a side of type int
	 * 
	 * @return
	 */
	public int getSide() {
		return getLength();
	}

	/**
	 * Returns a string with the following format; Square({side})
	 */
	@Override
	public String toString() {
		return String.format("Square(%d)", getSide());
	}

}
