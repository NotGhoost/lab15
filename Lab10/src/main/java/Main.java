public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Анна", 12, "терапия", 3);
        Doctor d2 = new Doctor("Мария", 8, "хирургия", 2);
        Doctor d3 = new Doctor("Иван", 5, "педиатрия", 1);
        Teacher t1 = new Teacher("Ольга", 10, "математика", 25);
        Teacher t2 = new Teacher("Алексей", 6, "информатика", 20);
        Workable[] workers = {d1, d2, d3, t1, t2};
        Teachable[] teachers = {d1, d2, d3, t1, t2};
        System.out.println("Работа:");
        for (Workable person : workers) {
            person.work();
            System.out.println("Опыт: " + person.getExperience() + " лет");
        }
        System.out.println("\nОбучение:");
        for (Teachable person : teachers) {
            person.teach();
            System.out.println("Количество учащихся: " + person.getStudents());
        }
    }
}
