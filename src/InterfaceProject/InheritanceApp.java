/**
 * Initializes each of the shapes and prints out the values returned from all methods
 */

package InterfaceProject;

import java.util.ArrayList;

public class InheritanceApp {

	public static void main(String[] args) {

		// Rectangle
		Rectangle myRectangle = new Rectangle(5, 4);
		System.out.println(myRectangle.toString());
		System.out.printf("Length: %d%n", myRectangle.getLength());
		System.out.printf("Width: %d%n", myRectangle.getWidth());

		System.out.println();

		// Square
		Square mySquare = new Square(4);
		System.out.println(mySquare.toString());
		System.out.printf("Side: %d%n", mySquare.getSide());

		System.out.println();

		// Triangle
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		System.out.println(myIsoscelesRightTriangle.toString());
		System.out.printf("Leg: %d%n", myIsoscelesRightTriangle.getLeg());
		System.out.printf("Hypotenuse: %.1f%n", myIsoscelesRightTriangle.hypotenuse());

		System.out.println();

		// Circle
		Circle myCircle = new Circle(4);
		System.out.println(myCircle.toString());
		System.out.printf("Diameter: %d%n", myCircle.diameter());
		System.out.printf("Circumfrence: %.1f%n", myCircle.circumference());
		System.out.printf("Radius: %d%n", myCircle.getRadius());

		System.out.println();

		// Making a rectangle using a square
		Rectangle rectangle2 = mySquare;
		System.out.println("rectangle2\n-----------");
		System.out.printf("%s%nLength: %d%nWidth: %d%n", rectangle2.toString(), rectangle2.getLength(),
				rectangle2.getWidth());

		System.out.println();

		// ArrayList of rectangles
		ArrayList<Rectangle> rectangles = new ArrayList<>();
		rectangles.add(rectangle2);
		rectangles.add(mySquare);
		rectangles.add(myRectangle);

		System.out.println("Rectangle Array:\n----------------");
		for (Rectangle rectangle : rectangles) {
			System.out.printf("%s%nLength: %d%nWidth: %d%n%n", rectangle.toString(), rectangle.getLength(),
					rectangle.getWidth());
		}
	}
}
