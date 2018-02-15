public class Main {

    public static void main(String[] args) {
        Room Bedroom = new Room();
        Room Kitchen = new Room("white", 2.5, 3.8, 4.2);
        Room LivingRoom = new Room("green", 3, 4.4, 5.8, 1);

        System.out.println("\n" + Bedroom.toString());
        System.out.println("\n" + Kitchen.toString());
        System.out.println("\n" + LivingRoom.toString());

        Bedroom.printSum();
        Bedroom.printStaticSum();

        Kitchen.printSum();
        Kitchen.printStaticSum();

        LivingRoom.printSum();
        LivingRoom.printStaticSum();

    }
}
