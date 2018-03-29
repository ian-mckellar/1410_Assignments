package listVsSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author ian
 *
 */
public class ListVsSetDemo {
	private List<ColoredSquare> list;
	private Set<ColoredSquare> set;
	
	/**
	 * initializes list as an ArrayList of type ColoredSquare with a vararg of elements using addElement
	 * initializes set as a HashSet of type ColoredSquare with a vararg of elements using addElement
	 * 
	 * @param elements
	 */
	public ListVsSetDemo(ColoredSquare... elements) {
		list = new ArrayList<ColoredSquare>();
		set = new HashSet<ColoredSquare>();
		
		for (ColoredSquare el : elements) {
			addElement(el);
		}
		
	}

	/**
	 * creates a StringBuilder and appends each item in list to it then returns
	 * the StringBuilder as a string using toString
	 * @return
	 */
	public String getListElements() {
		StringBuilder stringOfListElements = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			stringOfListElements.append(list.get(i));
		}
		return stringOfListElements.toString();
	}

	/**
	 * creates a StringBuilder and appends each set in list to it then returns
	 * the StringBuilder as a string using toString
	 * @return
	 */
	public String getSetElements() {
		StringBuilder stringOfSetElements = new StringBuilder();
		for (ColoredSquare el : set) {
			stringOfSetElements.append(el.toString());
		}
		return stringOfSetElements.toString();
	}

	/**
	 * adds a ColoredSquare to set and list
	 * @param coloredSquare
	 */
	public void addElement(ColoredSquare coloredSquare) {
		set.add(coloredSquare);
		list.add(coloredSquare);
	}
}
