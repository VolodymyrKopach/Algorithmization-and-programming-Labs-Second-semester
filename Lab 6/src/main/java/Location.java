public class Location {
    private double latitude;
    private double height;
    private double longitude;

    public Location() {
        latitude = 0;
        height = 0;
        longitude = 0;
    }

    public void setLocation(double latitude, double height, double longitude) {
        this.latitude = latitude;
        this.height = height;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{"

                + "latitude=" + latitude
                + ", height=" + height
                + ", longitude=" + longitude + '}';
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getHeight() {
        return height;
    }

    public double getLongitude() {
        return longitude;
    }

}
