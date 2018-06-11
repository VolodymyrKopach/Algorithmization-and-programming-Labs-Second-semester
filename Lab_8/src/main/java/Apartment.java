public class Apartment extends Accommodation {
    private int floorOfHouse;

    public Apartment(Integer id, int floorOfHouse, int numberOfRooms, double price, int area) {
        super(id, numberOfRooms, price, area);
        this.floorOfHouse = floorOfHouse;
    }

    @Override
    public String toString() {
        return "\n\nApartment:" +
                "\nfloorOfHouse = " + floorOfHouse +
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
