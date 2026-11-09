public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1. Билет");
        Ticket ticket = new Ticket("Концерт", "A12", 100.0);
        System.out.println("До скидки: " + ticket);
        ticket.applyDiscount();
        System.out.println("После скидки: " + ticket);

        System.out.println("\nЗадание 2. Самолёты");
        Airplane[] planes = {
            new Airplane("A320", 180, 6100), new Airplane("B737", 189, 5700),
            new Airplane("A380", 555, 14800), new Airplane("B777", 396, 13650),
            new Airplane("A350", 350, 16000), new Airplane("B787", 290, 14000)
        };
        Airplane maxCapacity = planes[0], maxRange = planes[0];
        for (Airplane plane : planes) {
            System.out.println(plane);
            if (plane.getCapacity() > maxCapacity.getCapacity()) maxCapacity = plane;
            if (plane.getRange() > maxRange.getRange()) maxRange = plane;
        }
        System.out.println("Максимальная вместимость: " + maxCapacity);
        System.out.println("Максимальная дальность: " + maxRange);

        System.out.println("\nЗадание 3. Платежи картой");
        Payment[] payments = {new Payment(10, PaymentMethod.CASH), new Payment(20, PaymentMethod.CARD),
            new Payment(30, PaymentMethod.CRYPTO), new Payment(40, PaymentMethod.TRANSFER),
            new Payment(50, PaymentMethod.CARD)};
        for (Payment payment : payments) if (payment.getMethod() == PaymentMethod.CARD) System.out.println(payment);
    }
}
