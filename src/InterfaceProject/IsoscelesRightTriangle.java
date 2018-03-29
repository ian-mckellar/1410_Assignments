package InterfaceProject;

/**
 * Represents an isosceles right triangle.
 * An isosceles right triangle is a triangle with a hypoteenuse
 * and two legs of equal length
 * 
 * @author ian
 *
 */
public class IsoscelesRightTriangle implements Shape, Printable{
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

	/**
	 * Prints a triangle with two equal legs and a hypotenuse with the 'o' symbol
	 */
	@Override
	public void print() {
		for (int i = 0; i <= leg - 1; i++) {			
			if (i == leg - 1) {
				for (int k = 0; k <= leg - 1; k++) {					
					System.out.print("o "); // prints out horizontal leg
				}
			} else {
				for (int l = leg; l >= leg - i; l--) {
					if (l == leg - i) {
						System.out.print("o "); // prints out the hypotenuse and the vertical leg
					} else {
						if (l == leg) { 
							System.out.print("o "); // prints out the vertical leg
						} 
						else {
							System.out.print("  "); // prints out the space between the leg and hypotenuse
						}
					}
				}
			}
			System.out.println(); //moves to the next line 
		}
	}

	/**
	 * Returns the perimeter (length of the border) of the 
	 * triangle by adding both legs and the hypotenuse
	 */
	@Override
	public double perimeter() {
		return leg + leg + hypotenuse();
	}

	/**
	 * Returns the area of the triangle by using the area of the formula
	 * (1/2) (base) (height)
	 */
	@Override
	public double area() {
		return 0.5 * leg * leg ;
	}

}
