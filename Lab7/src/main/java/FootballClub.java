public class FootballClub {
    private final String name;
    private final String country;
    private final int points;
    private static int totalClubs;
    private static long totalPoints;
    public FootballClub(String name, String country, int points) {
        this.name = name;
        this.country = country;
        this.points = points;
        totalClubs++;
        totalPoints += points;
    }
    public static double getAveragePoints() { return totalClubs == 0 ? 0 : (double) totalPoints / totalClubs; }
    public static int getTotalClubs() { return totalClubs; }
    @Override
    public String toString() { return name + " (" + country + "): " + points + " очков"; }
}
