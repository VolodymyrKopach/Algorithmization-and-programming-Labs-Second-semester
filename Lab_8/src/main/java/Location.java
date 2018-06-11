public class Location {
    private double latitude;
    private double height;
    private double longitude;

    public Location() {
        latitude = 0;
        height = 0;
        longitude = 0;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", height=" + height +
                ", longitude=" + longitude +
                '}';
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

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
