public class PersonalHome extends Accommodation{
    private int numberOfFloors;

    public PersonalHome(int numberOfFloors, int numberOfRooms, double price, double area, double latitude, double height,
                        double longitude) {
        this.numberOfFloors = numberOfFloors;
        this.setNumberOfRooms(numberOfRooms);
        this.setPrice(price);
        this.setArea(area);
        setLocation(latitude, height, longitude);
    }

    @Override
    public String toString() {
        return "\n\nPersonalHome:" +
                "\nnumberOfFloors = " + numberOfFloors +
                "\nlocation = " + getLocation() +
                "\nnumber of rooms = " + getNumberOfRooms() +
                "\nprice = " + getPrice() +
                "\narea = " + getArea();
    }


    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
