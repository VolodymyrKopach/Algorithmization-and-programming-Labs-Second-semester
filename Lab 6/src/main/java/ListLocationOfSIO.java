public enum ListLocationOfSIO {
    SCHOOL(2, 3, 10), KINDERGARTEN(4, 8, 72), CLINIC(9, 12, 34);

    private double latitude;
    private double height;
    private double longitude;

    ListLocationOfSIO(double latitude, double height, double longitude) {
        this.latitude = latitude;
        this.height = height;
        this.longitude = longitude;
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
