public class Main {

    public static void main(String[] args) {
        Room bedroom = new Room();
        Room kitchen = new Room("white", 2.5, 3.8, 4.2);
        Room livingRoom = new Room("green", 3, 4.4, 5.8, 1);

        System.out.println("\n" + bedroom.toString());
        System.out.println("\n" + kitchen.toString());
        System.out.println("\n" + livingRoom.toString());

        bedroom.printSum();
        bedroom.printStaticSum();

        kitchen.printSum();
        kitchen.printStaticSum();

        livingRoom.printSum();
        livingRoom.printStaticSum();

    }
}
