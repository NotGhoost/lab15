public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Васильки", "Белорусская", 5);
        System.out.println("Ресторан: " + restaurant.getName());
        System.out.println("Кухня: " + restaurant.getCuisine());
        System.out.println("Рейтинг: " + restaurant.getRating());
        System.out.println("Популярный: " + (restaurant.isPopular() ? "да" : "нет"));
    }
}
