package InterfaceProject;

public class InterfaceApp {

	public static void main(String[] args) {
		/*
		 * creating all of the shapes
		 */
		Rectangle rectangle1 = new Rectangle(6, 3);
		Rectangle rectangle2 = new Rectangle(5, 4);
		Square square1 = new Square(4);
		Square square2 = new Square(3);
		IsoscelesRightTriangle triangle1 = new IsoscelesRightTriangle(5);
		IsoscelesRightTriangle triangle2 = new IsoscelesRightTriangle(3);
		Circle circle1 = new Circle(7);
		Circle circle2 = new Circle(2);
		
		/*
		 * Initializes an array with all of my shapes
		 */
		Shape[] shapeArray = {rectangle1, rectangle2, square1, square2, triangle1, triangle2, circle1, circle2};
		System.out.println("Shape Array:\n" + "-----------");
		
		/*
		 * loops through my shape array and prints out:
		 * the perimeter to one decimal in the form: "Perimeter: {perimeter}"
		 * the area to one decimal in the form: "Area: {area}"
		 * and if the shape is printable then it will draw the perimeter with the symbol o
		 */
		for(Shape shape : shapeArray) {
			System.out.println(shape.toString());
			System.out.printf("Perimeter: %.1f%n", shape.perimeter());
			System.out.printf("Area: %.1f%n", shape.area());
			if (shape instanceof Printable) {
				((Printable) shape).print();
			}
			System.out.println();
		}
	}

}
