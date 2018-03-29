package inheritance;

/**
 * Represents a rectangle, a rectangle is a shape with two equal widths and two
 * equal lengths
 * 
 * @author ian
 *
 */
public class Rectangle {
	private final int length;
	private final int width;

	/**
	 * Initializes a Rectangle with a length and a width
	 * 
	 * @param length
	 * @param width
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * Returns the length of type int
	 * 
	 * @return
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Return the width of type int
	 * 
	 * @return
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Returns a string with the following format; Rectangle({length}x{width})
	 */
	@Override
	public String toString() {
		return String.format("Rectangle(%dx%d)", length, width);
	}
}
