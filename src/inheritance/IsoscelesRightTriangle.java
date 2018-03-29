/**
 * Represents an isosceles right triangle.
 * An isosceles right triangle is a triangle with a hypoteenuse
 * and two legs of equal length
 * 
 * @author ian
 *
 */
package inheritance;

public class IsoscelesRightTriangle {
	private final int leg;

	/**
	 * Initializes an isosceles triangle with a leg of type int
	 * 
	 * @param leg
	 */
	public IsoscelesRightTriangle(int leg) {
		super();
		this.leg = leg;
	}

	/**
	 * Returns a leg of type int
	 * 
	 * @return
	 */
	public int getLeg() {
		return leg;
	}

	/**
	 * Returns the square root of the sum of the squares of the legs
	 * 
	 * @return
	 */
	public double hypotenuse() {
		return Math.sqrt(Math.pow(leg, 2) + Math.pow(leg, 2));
	}

	/**
	 * Returns a string with the following format; IsoscelesRightTriangle({leg})
	 */
	@Override
	public String toString() {
		return String.format("IsoscelesRightTriangle(%d)", leg);
	}

}
