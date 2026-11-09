public class Professional {
    private String name;
    private int experience;
    private double rating;
    public Professional(String name, int experience, double rating) {
        this.name = name;
        this.experience = experience;
        this.rating = rating;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public void work() { System.out.println("Работает"); }
    public void displayInfo() {
        System.out.println("Имя: " + name + ", опыт: " + experience + " лет, рейтинг: " + rating);
    }
}
