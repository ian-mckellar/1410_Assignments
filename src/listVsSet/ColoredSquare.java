package listVsSet;

import java.awt.Color;

/**
 * 
 * @author ian
 *
 */
public class ColoredSquare {
	private int side;
	private Color color;
	
	/**
	 * initiates a new object ColoredSquare with a side and a color
	 * @param side
	 * @param color
	 */
	public ColoredSquare(int side, Color color) {
		this.side = side;
		this.color = color;
	}
	
	/**
	 * returns the area of a square as an int by multiplying the side by its self
	 * @return
	 */
	public int area() {
		return side * side;
	}

	/**
	 * overrides hashcode to allow us to use the equals method on our ColoredSquare object
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + side;
		return result;
	}

	/**
	 * overrides the equals method to allow us it on our ColoredSquare object
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColoredSquare other = (ColoredSquare) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (side != other.side)
			return false;
		return true;
	}

	/**
	 * overrides toString method to print a string of the format "side:{side} #{color in hexadecimal format}"
	 */
	@Override
	public String toString() {
		return String.format("side:%d #%s %n", side, Integer.toHexString(color.getRGB()).toUpperCase());
	}
	
	
}
