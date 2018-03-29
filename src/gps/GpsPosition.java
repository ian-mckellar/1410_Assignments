package gps;

/**
 * Allows user to retrive latitude, longitude, and elevation;
 * create an object with a latitude, longitude, and elevation;
 * returns a string with latitude, longitude and elevation in a readable format.
 * 
 * @author Ian McKellar
 *
 */
public class GpsPosition {

	double latitude;
	double longitude;
	double elevation;
	
	/**
	 * Initializes a new GPS object with:
	 * latitude of type double, 
	 * longitude of type double, 
	 * and elevation of type double
	 * 
	 * @param latitude
	 * @param longitude
	 * @param elevation
	 */
	public GpsPosition(double latitude, double longitude, double elevation) {
		if (latitude > 90 || latitude < -90 ) {
			throw new IllegalArgumentException(Double.toString(latitude));
		}
		
		if (longitude > 180 || longitude < -180) {
			throw new IllegalArgumentException(Double.toString(longitude));
		}
		
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
	}

	/**
	 * Returns the latitude when called
	 * @return
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Returns the longitude when called
	 * @return
	 */
	public double getLongitude() {
		return longitude;
	}
	
	/**
	 * Returns the elevation when called
	 * @return
	 */
	public double getElevation() {
		return elevation;
	}
	
	/**
	 * Returns a string of format:
	 * Gps: latitude: {latitude}{new line}longitude: {longitude}{newline}elevation: {elevation}{newline}
	 */
	@Override
	public String toString() {
		return String.format("%.6f, %.6f (%.1f)", latitude, longitude, elevation);
	}
	
	
	
}
