public class Suite extends Room {

    public Suite(int roomNumber, double price) {
        super(roomNumber, price);
    }

    @Override
    public String getRoomType() {
        return "Suite";
    }
}