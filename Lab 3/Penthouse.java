public class Penthouse extends Accommodation {
    private boolean basin;

    public Penthouse(boolean basin, int numberOfRooms, double price, double area, double latitude, double height,
                     double longitude) {
        this.basin = basin;
        this.setNumberOfRooms(numberOfRooms);
        this.setPrice(price);
        this.setArea(area);
        setLocation(latitude, height, longitude);
    }

    @Override
    public String toString() {
        return "\n\nPenthouse:" +
                "\nbasin = " + basin +
                "\nlocation = " + getLocation() +
                "\nnumber of rooms = " + getNumberOfRooms() +
                "\nprice = " + getPrice() +
                "\narea = " + getArea();
    }

    public boolean isBasin() {
        return basin;
    }

    public void setBasin(boolean basin) {
        this.basin = basin;
    }

}
