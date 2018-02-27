public class Apartment extends Accommodation {
    private int floorOfHouse;

    public Apartment(int floorOfHouse, int numberOfRooms, double price, double area, double latitude, double height,
                     double longitude) {
        super(numberOfRooms, price, area);
        this.floorOfHouse = floorOfHouse;
        setLocation(latitude, height, longitude);
    }

    @Override
    public String toString() {
        return "\n\nApartment:" +
                "\nfloorOfHouse = " + floorOfHouse +
                "\nlocation = " + getLocation() +
                "\nnumber of rooms = " + getNumberOfRooms() +
                "\nprice = " + getPrice() +
                "\narea = " + getArea();
    }

    public int getFloorOfHouse() {
        return floorOfHouse;
    }

    public void setFloorOfHouse(int floorOfHouse) {
        this.floorOfHouse = floorOfHouse;
    }
}
