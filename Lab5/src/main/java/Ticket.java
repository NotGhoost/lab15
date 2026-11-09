public class Ticket {
    private final String event;
    private final String seatNumber;
    private double price;
    public Ticket(String event, String seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    // Условие не задаёт размер скидки: используем 10%.
    public void applyDiscount() { price *= 0.9; }
    @Override
    public String toString() { return event + ", место " + seatNumber + ", цена " + price; }
}
