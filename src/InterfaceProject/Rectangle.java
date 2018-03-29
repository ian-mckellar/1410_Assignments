package InterfaceProject;

/**
 * Represents a rectangle, a rectangle is a shape with two equal widths and two
 * equal lengths
 * 
 * @author ian
 *
 */
public class Rectangle implements Shape, Printable{
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

	/**
	 * prints out a rectangle with an outline of 'o' symbol
	 */
	@Override
	public void print() {
		for (int i = 0; i <= width - 1; i ++) {
			if (i == 0 || i == width - 1) {
				for (int j = 0; j <= length - 1; j ++) {
					System.out.print("o ");
				}
			} else {
				for (int k = 0; k <= length - 1; k ++) {
					if (k == 0 || k == length - 1) {
						System.out.print("o ");						
					} else {
						System.out.print("  ");
					}
				}
			}
		System.out.println();
		}
	}

	/**
	 * returns the perimeter (length of the border) of a rectangle by adding the length and width each multiplied by 2
	 */
	@Override
	public double perimeter() {
		return 2 * length + 2 * width;
	}

	/**
	 * returns the area by multiplying the length and width
	 */
	@Override
	public double area() {
		return length * width;
	}
}
