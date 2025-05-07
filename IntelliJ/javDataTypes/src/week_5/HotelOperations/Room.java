package week_5.HotelOperations;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;



    public Room(int roomNumber, boolean dirty, boolean occupied, double price, int numberOfBeds) {
        this.roomNumber = roomNumber;
        this.dirty = dirty;
        this.occupied = occupied;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
    }
    public void checkIn(){
        setOccupied(true);
        setDirty(true);
    }
    public void checkOut(){
        setOccupied(false);
        cleanRoom();
    }
    public void cleanRoom(){
        setDirty(false);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;

    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;

    }

    public boolean isAvailable() {
        return !isDirty() && !isOccupied();
    }



}
