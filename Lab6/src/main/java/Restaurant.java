public class Restaurant {
    private final String name;
    private final String cuisine;
    private final int rating;
    public Restaurant(String name, String cuisine, int rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }
    public String getName() { return name; }
    public String getCuisine() { return cuisine; }
    public int getRating() { return rating; }
    public boolean isPopular() { return rating > 4; }
}
