package face;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FacePanel extends JPanel {
	private final Random rand = new Random();
	//private Face face;
	private boolean holdFace;
	private boolean holdMouth;
	private boolean holdEye;
	private boolean holdNose;
	private int currentEyes;
	private int currentNoses;
	private int currentMouths;
	private int currentFaceBackground;

	/**
	 * Create the panel.
	 */
	public FacePanel() {
	}

	/**
	 * sets a boolean value for the face to later store the current face value.
	 * 
	 * @param b
	 */
	public void setHoldFace(boolean b) {
		holdFace = b;
	}

	/**
	 * sets a boolean value for the face to later store the current mouth value.
	 * 
	 * @param b
	 */
	public void setHoldMouth(boolean b) {
		holdMouth = b;
	}

	/**
	 * sets a boolean value for the face to later store the current eye value.
	 * 
	 * @param b
	 */
	public void setHoldEye(boolean b) {
		holdEye = b;
	}

	/**
	 * sets a boolean value for the face to later store the current nose value.
	 * 
	 * @param b
	 */
	public void setHoldNose(boolean b) {
		holdNose = b;
	}

	/**
	 * randomly generates a new face using images from enumator classes; Eyes,
	 * FaceBackgrounds, Mouths, and Noses. only generates for classes with a true
	 * setter, i.e, the radio button has not been clicked.
	 * 
	 * @return
	 */
	public Face getNewFace() {
		FaceBackgrounds[] faces = FaceBackgrounds.values();
		Eyes[] eyes = Eyes.values();
		Mouths[] mouths = Mouths.values();
		Noses[] noses = Noses.values();

		int randomFaceBackgroundIndex = 0;
		int randomEyeIndex = 0;
		int randomMouthIndex = 0;
		int randomNoseIndex = 0;

		if (holdFace) {
			randomFaceBackgroundIndex = rand.nextInt(faces.length);
			currentFaceBackground = randomFaceBackgroundIndex;
		}

		if (holdEye) {
			randomEyeIndex = rand.nextInt(eyes.length);
			currentEyes = randomEyeIndex;
		}

		if (holdMouth) {
			randomMouthIndex = rand.nextInt(mouths.length);
			currentMouths = randomMouthIndex;
		}

		if (holdNose) {
			randomNoseIndex = rand.nextInt(noses.length);
			currentNoses = randomNoseIndex;
		}

		FaceBackgrounds randomFaceBackground = faces[currentFaceBackground];
		Eyes randomEye = eyes[currentEyes];
		Mouths randomMouth = mouths[currentMouths];
		Noses randomNose = noses[currentNoses];

		return new Face(randomEye, randomMouth, randomNose, randomFaceBackground);
	}

	/**
	 * overrides painCompent and gets values from getNewFace to paint.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		getNewFace().getFaceBackgrounds().getIcon().paintIcon(this, g, 50, 50);
		getNewFace().getEye().getIcon().paintIcon(this, g, 50, 50);
		getNewFace().getMouth().getIcon().paintIcon(this, g, 50, 50);
		getNewFace().getNose().getIcon().paintIcon(this, g, 50, 50);
	}

}
