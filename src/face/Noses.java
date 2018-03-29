package face;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public enum Noses {
	NOSE_1(new ImageIcon(Face.class.getResource("/face/images/nose1.png"))), NOSE_2(
			new ImageIcon(Face.class.getResource("/face/images/nose2.png"))), NOSE_3(
					new ImageIcon(Face.class.getResource("/face/images/nose3.png")));

	private Icon icon;

	public Icon getIcon() {
		return icon;
	}

	private Noses(Icon icon) {
		this.icon = icon;
	}
}
