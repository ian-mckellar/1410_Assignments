package itemList;
/**
 * 
 * @author Ian and Garret Wasden  
 */


public class Tea {
    String typeOfTea;
    String brand;
    int steepTime;
    int steepTemperature;
   
    int teaId;

    /**
     * used to creates a new Tea with a brand, type (flavor), steep time, and steep temperature
     * @param brand
     * @param typeOfTea
     * @param steepTime
     * @param steepTemperature
     */
    public Tea(String brand, String typeOfTea, int steepTime, int steepTemperature, int teaId) {
        this.brand = brand;
        this.typeOfTea = typeOfTea;
        this.steepTime = steepTime;
        this.steepTemperature = steepTemperature;
        this.teaId = teaId;
    }

    /**
     * returns the brand of tea
     * @return
     */
    public String getBrand() {
        return brand;
    }

    public int getTeaId() {
        return teaId;
    }

    /**
     * returns the temperature for the tea to be steeped at
     * @return
     */
    public int getSteepTemperature() {
        return steepTemperature;
    }

    /**
     * returns the type of tea
     * @return
     */
    public String getTypeOfTea() {
        return typeOfTea;
    }

    /**
     * returns the time the steep time of the tea
     * @return
     */
    public int getSteepTime() {
        return steepTime;
    }

	/**
     * Formats brand, typeOfTea, steepTime, and steepTemperature into one string
     * @return
     */
    @Override
    public String toString() {
        return String.format("Tea brand: %s \nTea type: %s\nSteep time in minutes: %d\nSteep temperature in " +
                        "fahrenheit: %d%nTea ID number %d%n", getBrand(), getTypeOfTea(), getSteepTime(),
                getSteepTemperature(), getTeaId());
    }
}
