import java.util.Objects;

public class Reservation {
    private String roomType;
    private final double price;
    private int numberOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        if (Objects.equals(roomType, "king")) {
            this.price = 139.00;
        } else if (Objects.equals(roomType, "double")) {
            this.price = 124.00;
        } else {
            this.price = 0.0;
        }
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
}

    public double reservationTotal() {
        double baseCost = price * numberOfNights;
        if(isWeekend) {
            baseCost = baseCost * 1.10;
        }
        return baseCost;
        }

    }
