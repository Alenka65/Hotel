public class Room {

    private int roomNumber;
    private int numberOfBeds;
    private int price; //price in Kc per night
    private boolean balcony;
    private boolean seaView;


    public Room(int roomNumber, int numberOfBeds, int price, boolean balcony, boolean seaView) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.balcony = balcony;
        this.seaView = seaView;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", balcony=" + balcony +
                ", seaView=" + seaView +
                '}';
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public int getPrice() {
        return price;
    }
}
