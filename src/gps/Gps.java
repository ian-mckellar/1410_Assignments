package gps;

import java.util.ArrayList;
import java.util.Random;

/**
 * Allows a user to create an object with a position in GPS coordinates;
 * retrieve that position, add new positions into an ArrayList of positions;
 * add a random position within .5 latitude, longitude, or elevation (KM) of the position;
 * find the distance between two points using those positions;
 * find their current position;
 * find the total distance they have traveled on their current route;
 * find the distance between two positions;
 * and delete their route expect for the current position.
 * 
 * @author Ian McKelar
 *
 */
public class Gps {
	ArrayList<GpsPosition> route;
	
	/**
	 * Initializes the route with new GPS coordinates
	 * @param position
	 */
	public Gps(GpsPosition position ) {
		this.route = new ArrayList<>();
		this.route.add(position);
	}

	/**
	 * Returns the current items in the route ArrayList.
	 * @return
	 */
	public ArrayList<GpsPosition> getRoute() {
		return route;
	}
	
	/**
	 * Adds new GPS coordinates to the end of the route ArrayList.
	 * @param position
	 */
	public void update(GpsPosition position) {
		route.add(position);
	}
	
	/**
	 * Adds a new position to route.
	 * This new position is a random position that is within 0.5 latitude, longitude, and elevation(KM) from the last position
	 * 
	 */
	public void randomUpdate() {
		Random rand = new Random();
		double randomPositionChange = -0.5 + (0.5 - -0.5) * rand.nextDouble();
		
		double newRandomLatitude = route.get(route.size() - 1).getLatitude() + randomPositionChange;
		double newRandomLongitude = route.get(route.size() - 1).getLongitude() + randomPositionChange;
		double newRandomElevation = route.get(route.size() - 1).getElevation() + randomPositionChange;
		GpsPosition randomGpsPosition = new GpsPosition(newRandomLatitude, newRandomLongitude, newRandomElevation);
	}
	
	/**
	 * Returns the current position, i.e, the last element of the ArrayList route.
	 * @return
	 */
	public GpsPosition position() {
		return route.get(route.size() - 1);
	}
	
	/**
	 * Loops through route and finds distance between each point and the point before it.
	 * Sums those distances and returns that sum.
	 * @return
	 */
	public double distanceTraveled() {
		double totalDistanceTraveled = 0;
		
		for (int i = 1; i < route.size(); i++) {
			totalDistanceTraveled += distance(route.get(i - 1), route.get(i));
		}
		
		return totalDistanceTraveled;
	}
	
	/**
	 * Uses the Haversine formula to calculate the distance between two latitude and longitude points.
	 * Takes the distance between latitude and longitude and then returns the square of the sum of the
	 * square of elevation and the distance between latitude and longitude.
	 * 
	 * The Haversine formula is a formula used to calculate the distance between two points on a sphere.
	 * 
	 * hav({some angle}) = sin^2 ({some angle / 2})
	 * 
	 * the haversine formula looks like this:
	 * 
	 * hav({longitude angle two} - {longitude angle one}) + 
	 * cos({longitude angle one}) * 
	 * cos({longitude angle two}) * 
	 * hav({latitude angle two} - {latitude angle one})
	 * 
	 * ==========================================================================================
	 * I used the work of Jason Winns github file Haversine.java as guidance to write this method
	 * 
	 * For more information about Jasons work go to https://github.com/jasonwinn/haversine
	 * ==========================================================================================
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	private double distance(GpsPosition from, GpsPosition to) {
		int RADIUS_OF_EARTH = 6371;
		
		double distanceTravledLatitude = Math.toRadians(to.getLatitude() - from.getLatitude());
		double distanceTravledLongitude = Math.toRadians(to.getLongitude() - from.getLongitude());
		
		double startingLatitude = Math.toRadians(from.getLatitude());
		double endingLatitude = Math.toRadians(to.getLatitude());
		
		double a = Math.pow(Math.sin(distanceTravledLatitude / 2), 2) 
				+ Math.cos(startingLatitude) 
				* Math.cos(endingLatitude)
				* Math.pow(Math.sin(distanceTravledLongitude / 2), 2);
		
		double c = RADIUS_OF_EARTH * 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		
		double elevationTraveled = (from.getElevation() - to.getElevation()) / 1000;
		
		return Math.sqrt(Math.pow(c, 2) + Math.pow(elevationTraveled, 2));
	}
	
	/**
	 * Saves the last element of route.  Deletes the entire route Array,
	 * adds the saved element back into route.
	 */
	public void reset() {
		GpsPosition lastPosition = route.get(route.size() - 1);
		route.clear();
		route.add(lastPosition);
	}
}
