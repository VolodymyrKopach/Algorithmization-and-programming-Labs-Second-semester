public class Room {
    private String colorOfTheRoom;
    private double height, width, length;
    private int numberOfWindows;
    public static double volume = 0;

    public Room() {
        colorOfTheRoom = "red";
        height = 2.5;
        width = 4;
        length = 4;
        numberOfWindows = 0;

        setVolume(width * length * height);
    }

    public Room(String colorOfTheRoom, double height, double width, double length){
        this.colorOfTheRoom = colorOfTheRoom;
        this.height = height;
        this.width = width;
        this.length = length;
        numberOfWindows = 0;

        setVolume(width * length * height);
    }

    public Room(String colorOfTheRoom, double height, double width, double length, int numberOfWindows){
        this.colorOfTheRoom = colorOfTheRoom;
        this.height = height;
        this.width = width;
        this.length = length;
        this.numberOfWindows = numberOfWindows;

        setVolume(width * length * height);
    }

    public String toString(){
        return "Information about the room:" + "\ncolor: " + colorOfTheRoom + "\nheight: " + height
                + "\nwidth: " + width + "\nlength: " + length + "\nwindow: " + numberOfWindows;
    }

    public static void printStaticSum(){
        System.out.println("Room volume: " + getVolume());
    }

    public void printSum(){
        setVolume(width * length * height);
        System.out.println("Room volume: " + width * length * height);
    }

    public void resetValues(String colorOfTheRoom, double height, double width, double length, int numberOfWindows){
        this.colorOfTheRoom = colorOfTheRoom;
        this.height = height;
        this.width = width;
        this.length = length;
        this.numberOfWindows = numberOfWindows;

        setVolume(width * length * height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String getColorOfTheRoom() {
        return colorOfTheRoom;
    }

    public void setColorOfTheRoom(String colorOfTheRoom) {
        this.colorOfTheRoom = colorOfTheRoom;
    }

    public static double getVolume() {
        return volume;
    }

    public static void setVolume(double volume) {
        Room.volume = volume;
    }

}
