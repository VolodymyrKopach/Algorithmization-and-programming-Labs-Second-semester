public class PersonalHome extends Accommodation{
    private int numberOfFloors;

    public PersonalHome(Integer id, int numberOfFloors, int numberOfRooms, double price, double area) {
        super(id, numberOfRooms, price, area);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "\n\nPersonalHome:" +
                "\nnumberOfFloors = " + numberOfFloors +
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
