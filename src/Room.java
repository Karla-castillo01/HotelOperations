public class Room {
    private final int numberOfBeds;
    private final double price;
    private final boolean isOccupied;
    private final boolean isDirty;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = true;

    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }
}
