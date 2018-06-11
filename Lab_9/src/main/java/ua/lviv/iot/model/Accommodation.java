package ua.lviv.iot.model;


import javax.persistence.*;
import javax.ws.rs.Consumes;

@Entity
public class Accommodation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "numberOfRooms")
    private int numberOfRomms;

    @Column(name = "price")
    private int price;

    @Column(name = "area")
    private int area;


    public Accommodation(){

    }

    public int getNumberOfRomms() {
        return numberOfRomms;
    }

    public void setNumberOfRomms(int numberOfRomms) {
        this.numberOfRomms = numberOfRomms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
