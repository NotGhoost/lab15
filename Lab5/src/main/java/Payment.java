public class Payment {
    private final double amount;
    private final PaymentMethod method;
    public Payment(double amount, PaymentMethod method) {
        this.amount = amount;
        this.method = method;
    }
    public PaymentMethod getMethod() { return method; }
    @Override
    public String toString() { return "Сумма: " + amount + ", способ: " + method; }
}
