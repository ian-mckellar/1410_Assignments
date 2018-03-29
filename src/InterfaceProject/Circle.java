package InterfaceProject;

/**
 * Represents a circle, A circle is a perfectly round shape that has a radius,
 * which is the length from the center to the outer edge of the circle. And a
 * circumference, which is the length of the the outter edge of the circle
 * 
 * @author ian
 *
 */
public class Circle implements Shape{
	private final int radius;

	/**
	 * Initializes a circle object with a radius
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	/**
	 * Returns a radius of type int
	 * 
	 * @return
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * Multiples the radius by 2, returning the diameter
	 * 
	 * @return
	 */
	public int diameter() {
		return radius * 2;
	}

	/**
	 * Multiples the diameter method by pi (Math.PI) returning the circumference
	 * 
	 * @return
	 */
	public double circumference() {
		return diameter() * Math.PI;
	}

	/**
	 * Returns a string with the following format; Circle({radius})
	 */
	@Override
	public String toString() {
		return String.format("Circle(%d)", radius);
	}

	/**
	 * returns the perimeter (length of the border of the shape), which in the case of the circle is the circumference.
	 */
	@Override
	public double perimeter() {
		return circumference();
	}

	/**
	 * returns the area of the circle, which in this case is pi * radius ^ 2
	 */
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
