public class Penthouse extends Accommodation {
    private boolean basin;

    public Penthouse(Integer id, boolean basin, int numberOfRooms, double price, double area) {
        super(id, numberOfRooms, price, area);
        this.basin = basin;
    }

    @Override
    public String toString() {
        return "\n\nPenthouse:" +
                "\nbasin = " + basin +
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
