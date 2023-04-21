package airport;

class Weather {
    private double temperature;
    private int windSpeed;
    private String windDirection;
    private double precipitationChance;
    private double visibility;
    private boolean unsafeForFlight;

    // constructor
    public Weather (double temp, int windSpeed, String windDirect, double precipChance, double visible, boolean unsafe){
        this.temperature = temp;
        this.windSpeed = windSpeed;
        this.windDirection = windDirect;
        this.precipitationChance = precipChance;
        this.visibility = visible ;
        this.unsafeForFlight = unsafe;
    }

    // getters + setters
    public void setTemperature (double currentTemp) {
        temperature = currentTemp;
    }
    public double getTemperature() {
        return temperature;
    }

    public void setWindSpeed (int windspd) {windSpeed = windspd;}
    public int getWindSpeed () {
        return windSpeed;
    }

    public void setWindDirection (String windDirect) {
        windDirection = windDirect;
    }
    public String getWindDirection() {
        return windDirection;
    }

    public void setPrecipitationChance(double precipChnce) {precipitationChance = precipChnce;}
    public double getPrecipitationChance() {return precipitationChance;}

    public void setVisibility (double visible){ visibility = visible;}
    public double getVisibility () {return visibility;}

    public void setUnsafeForFlight (boolean unsafe) {unsafeForFlight = unsafe;}
    public boolean getUnsafeForFlight() {return unsafeForFlight;}






}
