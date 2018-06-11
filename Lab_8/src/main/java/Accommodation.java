public class Accommodation {
    private int numberOfRooms;
    private double price;
    private double area;
    private Integer id = null;

    public Accommodation() {
    }

    public Accommodation(Integer id, int numberOfRooms, double price, double area) {
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        this.area = area;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n\nAccommodation:" +
                "\nnumberOfRooms = " + numberOfRooms +
                "\nprice = " + price +
                "\narea = " + area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

