public class Main {
    public static void main(String[] args) {
        FootballClub[] clubs = {
            new FootballClub("Динамо-Минск", "Беларусь", 60), new FootballClub("БАТЭ", "Беларусь", 55),
            new FootballClub("Барселона", "Испания", 75), new FootballClub("Реал", "Испания", 78),
            new FootballClub("Бавария", "Германия", 72), new FootballClub("Арсенал", "Англия", 66)
        };
        for (FootballClub club : clubs) System.out.println(club);
        System.out.println("Клубов: " + FootballClub.getTotalClubs());
        System.out.printf("Среднее число очков: %.2f%n", FootballClub.getAveragePoints());
    }
}
