public class Penthouse extends Accommodation {
    private boolean basin;

    public Penthouse(boolean basin, int numberOfRooms, double price, double area, double latitude, double height,
                     double longitude) {
        super(numberOfRooms, price, area, latitude, height, longitude);
        this.basin = basin;
    }

    @Override
    public String toString() {
        return "\n\nPenthouse:"
                + "\nbasin = " + basin
                + "\nlocation = " + getLocation()
                + "\nnumber of rooms = " + getNumberOfRooms()
                + "\nprice = " + getPrice()
                + "\narea = " + getArea();
    }

    public boolean isBasin() {
        return basin;
    }

    public void setBasin(boolean basin) {
        this.basin = basin;
    }


}
