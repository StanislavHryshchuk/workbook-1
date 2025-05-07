package week_5.HotelOperations;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        setPrice();
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        setReservationTotal();
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal() {
        this.reservationTotal = getNumberOfNights() * getPrice();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice() {
        if (getRoomType().equalsIgnoreCase("king")){
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }
        if (isWeekend()){
            this.price *= 1.1;
        }
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
