public abstract class Room {
    private int roomNumber;
    private double price;
    private boolean isBooked;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
    }


    public abstract String getRoomType();
}