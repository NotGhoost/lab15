public class Main {
    public static void main(String[] args) {
        Professional[] professionals = {
            new Doctor("Анна", 12, 4.9, "Терапевт"),
            new Doctor("Мария", 8, 4.8, "Хирург"),
            new Doctor("Иван", 5, 4.7, "Педиатр"),
            new Engineer("Алексей", 10, 4.8, "Мост"),
            new Engineer("Ольга", 6, 4.6, "Информационная система")
        };
        for (Professional person : professionals) {
            person.displayInfo();
            person.work();
            if (person instanceof Doctor) ((Doctor) person).diagnose();
            if (person instanceof Engineer) ((Engineer) person).design();
            System.out.println();
        }
    }
}
