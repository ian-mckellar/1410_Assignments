package face;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public enum FaceBackgrounds {
	FACE_BACKGROUND_1(new ImageIcon(Face.class.getResource("/face/images/faceBackground1.png"))), FACE_BACKGROUND_2(
			new ImageIcon(Face.class.getResource("/face/images/faceBackground2.png"))), FACE_BACKGROUND_3(
					new ImageIcon(Face.class.getResource("/face/images/faceBackground3.png")));

	private Icon icon;

	public Icon getIcon() {
		return icon;
	}

	private FaceBackgrounds(Icon icon) {
		this.icon = icon;
	}
}
