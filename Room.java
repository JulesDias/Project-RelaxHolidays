public class Room {
    private int roomNumber;
    private double price;
    private boolean isBooked;
    private int adultCap;
    private int childCap;
    private int nbRooms;

    public Room(int roomNumber, double price, int adultCap, int childCap, int nbRooms) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.adultCap = adultCap;
        this.childCap = childCap;
        this.nbRooms = nbRooms;
        this.isBooked = false;
    }


    public abstract String getRoomType();
}
