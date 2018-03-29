package face;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public enum Eyes {
	EYE_1(new ImageIcon(Face.class.getResource("/face/images/eyes1.png"))), EYE_2(
			new ImageIcon(Face.class.getResource("/face/images/eyes2.png"))), EYE_3(
					new ImageIcon(Face.class.getResource("/face/images/eyes3.png")));

	private Icon icon;

	public Icon getIcon() {
		return icon;
	}

	private Eyes(Icon icon) {
		this.icon = icon;
	}
}
