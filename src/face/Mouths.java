package face;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public enum Mouths {
	MOUTH_1(new ImageIcon(Face.class.getResource("/face/images/mouth1.png"))), MOUTH_2(
			new ImageIcon(Face.class.getResource("/face/images/mouth2.png"))), MOUTH_3(
					new ImageIcon(Face.class.getResource("/face/images/mouth3.png")));

	private Icon icon;

	public Icon getIcon() {
		return icon;
	}

	private Mouths(Icon icon) {
		this.icon = icon;
	}
}
