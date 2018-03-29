package face;

public class Face {
	private Eyes eyes;
	private Mouths mouths;
	private Noses noses;
	private FaceBackgrounds faceBackgrounds;

	public Face(Eyes eye, Mouths mouth, Noses nose, FaceBackgrounds face) {
		this.eyes = eye;
		this.mouths = mouth;
		this.noses = nose;
		this.faceBackgrounds = face;
	}

	public Eyes getEye() {
		return eyes;
	}

	public Mouths getMouth() {
		return mouths;
	}

	public Noses getNose() {
		return noses;
	}

	public FaceBackgrounds getFaceBackgrounds() {
		return faceBackgrounds;
	}

}
